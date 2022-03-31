package com.prod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends DAO { //기능메소드 담기

	
	
	//입력처리
	public void insertBook(Books book) {
		conn = getConnect();
		String sql = "insert into b_table (b_no, b_title, b_writer, b_company)\r\n"
				+ "values (? , ? , ? , ?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBooknumber());
			psmt.setString(2, book.getTitle());
			psmt.setString(3, book.getWriter());
			psmt.setString(4, book.getComapany());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	
	}
	
	//수정처리
	public void updateBook(Books book) {
		conn=getConnect();
		String sql = "update b_table\r\n"
				+ "set b_title=?,\r\n"
				+ "    b_writer=?,\r\n"
				+ "    b_company=?\r\n"
				+ "where b_no=?";
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1,book.getTitle());
			psmt.setString(2,book.getWriter());
			psmt.setString(3,book.getComapany());
			psmt.setInt(4, book.getBooknumber());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			disconnect();
		}
			
		
	}
	
	//삭제처리
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
		}finally {
			 disconnect();
		}
		
	}
	
	//목록조회
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
				
				bk.add(book);
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return bk;
	}
	


}
