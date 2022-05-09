package co.edu.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class todoDAO {
	
	Connection conn =null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	//데이터 베이스 연결
	public void getConnect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void disConnect() {
		if (rs != null) { // 값이 있으면 close
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (psmt != null) { // 값이 있으면 close
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) { // 값이 있으면 close
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	//리스트
	public List<todoVO> getList(){
		String sql = "select * from todolist";
		getConnect();
		List<todoVO> list = new ArrayList<>();
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				todoVO vo = new todoVO(rs.getString("todo"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}
	
	// 한건삭제.
		public void deleteTodo(String todo) {
			String sql = "delete from todolist where todo = ?";
			getConnect();
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, todo);
				int r = psmt.executeUpdate();
				System.out.println(r + "건 삭제");

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disConnect();
			}
		}
		
		// 한건입력.
		public void insertTodo(todoVO vo) {
			String sql = "insert into todolist (todo) values (?)";
			getConnect();
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, vo.getTodo());
				int r = psmt.executeUpdate();
				System.out.println(r + "건 입력");

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disConnect();
			}

		}
		
		//수정
		public void updateTodo(todoVO vo) {
			getConnect();
			String sql = "update todolist" + "set todo=? " 
					+ "where todo=?";

			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, vo.getTodo());

				int r = psmt.executeUpdate();
				System.out.println(r + "건 수정");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disConnect();
			}

		}

	
	
}
	
	

