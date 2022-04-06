package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {

	// 전체조회
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employes.employee_id
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setHireDate(rs.getString("Hire_date").substring(0, 10));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("Salary"));

				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return employees;
	}
	

	

	// 입력처리 exectuteUpdate()
	public boolean insertEmp(Employee emp) {
		conn = getConnect();
		String sql = "insert into emp_java (employee_id, last_name, email, hire_date, job_id)\r\n"
				+ "values (?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql); // ? < 매개변수값중에서 employeeId 필드값.
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
//			psmt.executeUpdate();
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력");
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 > 반드시 실행코드.
			disconnect();
		}
		return false;
	}

	// 수정처리
	public boolean updateEmp(Employee emp) {
		conn = getConnect();
		String sql = "update emp_java\r\n" + "set first_name = ?,\r\n" + "    phone_number = ?,\r\n"
				+ "    salary = ? \r\n" + "    where employee_id = ?"; // 쿼리작성 > ? 작성
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 값을 지정.
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());

			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 수정");
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

	// 삭제처리
	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete from emp_java\r\n" + "where employee_id=?"; // 쿼리작성 > ? 작성
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터(?) 값을 지정.
			psmt.setInt(1, empId);

			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	// 한건조회
	public Employee searchEmp(int eid) {

		conn = getConnect();
		Employee emp = null;

		String sql = "select * from emp_java\r\n" + "where employee_id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eid);
			rs = psmt.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employes.employee_id
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setHireDate(rs.getString("Hire_date").substring(0, 10));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setPhoneNumber("phone_number");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;

	}

	// 다수조회
	public List<Employee> searchMany(String many) {

		List<Employee> employees = new ArrayList<Employee>();
		conn = getConnect();
		Employee emp = null;
		String sql = "    select *\r\n" + "    from emp_java\r\n" + "    where last_name like ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, many);
			rs = psmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employes.employee_id
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setHireDate(rs.getString("Hire_date").substring(0, 10));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setPhoneNumber("phone_number");

				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return employees;

	}

}
