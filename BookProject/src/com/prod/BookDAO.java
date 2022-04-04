package com.prod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends DAO implements BookService { // 기능메소드 담기

	// 로그인
	public boolean login(String id, String pwd) {
		conn = getConnect();
		String sql = "select * from b_table where b_id =? and b_wd=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pwd);
			rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.println("로그인 성공!!");
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		System.out.println("로그인 실패 !");
		return false;

	}

	// 입력처리
	public void insertBook(Books book) {
		conn = getConnect();
		String sql = "insert into b_table (b_no, b_title, b_writer, b_company, stock)\r\n"
				+ "values (? , ? , ? , ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBooknumber());
			psmt.setString(2, book.getTitle());
			psmt.setString(3, book.getWriter());
			psmt.setString(4, book.getComapany());
			psmt.setInt(5, book.getStock());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 수정처리
	public void updateBook(Books book) {
		conn = getConnect();
		String sql = "update b_table\r\n" + "set b_title=?,\r\n" + "    b_writer=?,\r\n" + "    b_company=?,\r\n"
				+ "stock=?" + "where b_no=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getTitle());
			psmt.setString(2, book.getWriter());
			psmt.setString(3, book.getComapany());
			psmt.setInt(4, book.getBooknumber());
			psmt.setInt(5, book.getStock());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 삭제처리
	public void deleteBook(int bookid) {
		conn = getConnect();
		String sql = "delete from b_table\r\n" + "where b_no=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bookid);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 목록조회
	public List<Books> bookList() {
		List<Books> bk = new ArrayList<Books>();
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select*from b_table");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Books book = new Books();
				book.setBooknumber(rs.getInt("b_no"));
				book.setTitle(rs.getString("b_title"));
				book.setWriter(rs.getString("b_writer"));
				book.setComapany(rs.getString("b_company"));
				book.setStock(rs.getInt("stock"));

				bk.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return bk;
	}

	// 회원가입 기능
	public void insertUser(User users) {
		conn = getConnect();
		String sql = "insert into user_login (user_id, user_pwd, user_name)\r\n" + "values (?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, users.getUserid());
			psmt.setString(2, users.getPasswd());
			psmt.setString(3, users.getName());

			int r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 대출기능
	public Books borrow(Books book) {
		conn = getConnect();
		String sql = "update b_table\r\n"
				+ "set stock=?-1," + "where b_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getStock());
			psmt.setString(2, book.getId());			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 대출");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return book;
		
	}
	
	//반납기능

}
