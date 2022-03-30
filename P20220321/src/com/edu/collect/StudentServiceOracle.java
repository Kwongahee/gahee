package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService{ 

	@Override
	public void insertStudent(Student student) {
		conn=getConnect();
		String sql = "insert into student_info (student_no, student_name, eng_score, kor_score)\r\n"
				+ "values (?,?,?,?)";
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1, student.getStuNumber());
			psmt.setString(2, student.getName());
			psmt.setInt(3, student.getEngScore());
			psmt.setInt(4, student.getKorScore());
			
			int r=psmt.executeUpdate();
			System.out.println(r + "건 입력");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public Student getStudent(int sno) {
		return null;
	}

	@Override
	public List<Student> Studentlist() {
		List<Student> list = new ArrayList<Student>();  //조회된 결과값 담기 위한 컬렉션
		conn=getConnect();
		String sql = "select * from student_info order by student_no";
		try {
			psmt = conn.prepareStatement(sql); //new Student()... psmt > 객체!
			rs = psmt.executeQuery(); //실행건수만큼 반복자.
			while(rs.next()) { //반복자를 통해 요소를 가지고 올 수 있는지 체크.. 있으면 가지고 오겠습니다!
				Student student = new Student();
				student.setStuNumber(rs.getInt("student_no"));
				student.setName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score")); //칼럼에 담겨져있는 값을 가지고 오겠다.
				
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "update student_info\r\n"
				+ "set eng_score =?,\r\n"
				+ "kor_score=?\r\n"
				+ "where student_no=?";
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setInt(1,student.getEngScore());
			psmt.setInt(2,student.getKorScore());
			psmt.setInt(3, student.getStuNumber());
			
			int r= psmt.executeUpdate();
			System.out.println(r + "건 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void deleteStudent(int sno) {
		conn=getConnect();
		String sql = "delete from student_info\r\n" + "where student_no=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			
			int r= psmt.executeUpdate();
			System.out.println( r + "건 삭제");
		} catch (SQLException e) {			
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public List<Student> searchStudent(String name) {		
		List<Student> list = new ArrayList<Student>();
		conn = getConnect();
		Student stu = null;		
		String sql= "select *\r\n"
				+ "from student_info\r\n"
				+ "where student_name like ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,name);
			rs = psmt.executeQuery();
			while(rs.next()) {
				stu = new Student();
				stu.setName(rs.getString("student_name"));
				stu.setStuNumber(rs.getInt("student_no"));
				stu.setEngScore(rs.getInt("eng_score"));
				stu.setKorScore(rs.getInt("kor_score"));		
				list.add(stu);
			} 
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
		

	}

	@Override
	public void saveTofile() {
		
	}

}
