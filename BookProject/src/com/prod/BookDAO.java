package com.prod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO extends DAO implements BookService { // 기능메소드 담기

	// 로그인
	public boolean login(String id, String pwd) {
		conn = getConnect();
		String sql = "SELECT * "
				+ "FROM B_TABLE "
				+ "where b_id=? and b_wd=? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pwd);
			rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.println("로그인 성공");
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		System.out.println("로그인 실패");
		return false;

	}

	// 입력처리
	public boolean insertBook(Books book) {
		conn = getConnect();
		String sql = "insert into b_table (b_no, b_title, b_writer, b_company, stock)\r\n"
				+ "values (? , ? , ? , ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, book.getBooknumber());
			psmt.setString(2, book.getTitle());
			psmt.setString(3, book.getWriter());
			psmt.setString(4, book.getComapany());
			psmt.setString(5, book.getStock());
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	// 수정처리
	public void updateBook(Books book) {
		conn = getConnect();
		String sql = "update b_table\r\n" + "set b_title=?, " + "b_writer=?, " + "b_company=? , " + "stock=? "
				+ "where b_no=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getTitle());
			psmt.setString(2, book.getWriter());
			psmt.setString(3, book.getComapany());
			psmt.setString(4, book.getStock());
			psmt.setInt(5, book.getBooknumber());

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
			psmt = conn.prepareStatement("select*from b_table order by b_no");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Books book = new Books();
				book.setBooknumber(rs.getInt("b_no"));
				book.setTitle(rs.getString("b_title"));
				book.setWriter(rs.getString("b_writer"));
				book.setComapany(rs.getString("b_company"));
				book.setStock(rs.getString("stock"));

				bk.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return bk;
	}

	// 회원조회
	public List<User> UserList() {
		List<User> us = new ArrayList<User>();
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select*from user_table");
			rs = psmt.executeQuery();
			while (rs.next()) {
				User users = new User();
				users.setUserid(rs.getString("m_id"));
				users.setPasswd(rs.getString("m_wd"));
				users.setName(rs.getString("m_name"));

				us.add(users);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

		return us;

	}

	// 회원가입 기능
	public void insertUser(User users) {
		conn = getConnect();
		String sql = "insert into user_table (m_id, m_wd, m_name)\r\n" + "values (?,?,?)";

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

	// 회원로그인기능
	public User loginuser(String userid, String userwd) {
		conn = getConnect();
		User users1 = null;
		String sql = "select *\r\n" + "from user_table\r\n" + "where m_id=? and m_wd=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userid);
			psmt.setString(2, userwd);
			rs = psmt.executeQuery();

			if (rs.next()) {
				users1 = new User();
				users1.setUserid(rs.getString("m_id"));
				users1.setPasswd(rs.getString("m_wd"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return users1;

	}

	// 대출가능여부 확인
	public Books check(int bok) {
		Books one = null;
		conn = getConnect();
		String sql = "select * from b_table where b_no=? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bok);
			rs = psmt.executeQuery();

			if (rs.next()) {
				one = new Books();
				one.setBooknumber(rs.getInt("b_no"));
				one.setStock(rs.getString("stock"));

				return one;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return one;

	}

	// 대출기능
	public void borrowBook(Books brw) {
		conn = getConnect();

		String sql = "update b_table " + " set stock ='N' " + " where b_no=?  ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, brw.getBooknumber());
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 반납기능
	public void returnBook(Books rt) {
		conn = getConnect();
		String sql = "update b_table " + " set stock ='Y' " + " where b_no=? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, rt.getBooknumber());
			psmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			disconnect();
		}
	}

	// 대출가능 도서 목록
	public List<Books> rentBookList() {
		List<Books> rt = new ArrayList<Books>();
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select *  from b_table where stock = 'Y'");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Books bk = new Books();
				bk.setBooknumber(rs.getInt("b_no"));
				bk.setTitle(rs.getString("b_title"));
				bk.setWriter(rs.getString("b_writer"));
				bk.setComapany(rs.getString("b_company"));
				bk.setStock(rs.getString("stock"));

				rt.add(bk);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

		return rt;
	}
	// 도서 한 권 조회
	public Books searchone(int bok) {

		conn = getConnect();
		Books one = null;
		String sql = "select *\r\n" + "from b_table where b_no=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bok);
			rs = psmt.executeQuery();

			if (rs.next()) {
				one = new Books();
				one.setTitle(rs.getString("b_title"));
				one.setWriter(rs.getString("b_writer"));
				one.setComapany(rs.getString("b_company"));
				one.setStock(rs.getString("stock"));
				one.setBooknumber(rs.getInt("b_no"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return one;

	}
	//회원탈퇴
	public boolean deleteuser(String users) {
		conn = getConnect();
		String sql = "delete from user_table  where m_id=? ";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, users);
			
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
}
}