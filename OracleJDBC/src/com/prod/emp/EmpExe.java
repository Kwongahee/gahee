package com.prod.emp;

import java.util.List;
import java.util.Scanner;

import javax.crypto.spec.DHGenParameterSpec;

public class EmpExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();

		// 메뉴: 1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 6.다수조회 9.종료
		while (true) {	
			System.out.println("1.사원리스트  2.입력  3.수정  4.삭제  5.한건조회  6.다수조회  9.종료");
			System.out.println("메뉴선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {// 리스트
				List<Employee> list = dao.empList(); // 전체 조회 기능

				System.out.println("사원리스트");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) {// 입력
				// 사원번호, lastName, email, hireDate, jobId
				System.out.println("사원번호를 입력하세요.");
				int Number = scn.nextInt();
				System.out.println("이름을 입력하세요.");
				String lastName = scn.next();
				System.out.println("이메일을 입력하세요.");
				String email = scn.next();
				System.out.println("입사날짜를 입력하세요.");
				String date = scn.next();
				System.out.println("JobId를 입력하세요");
				String jobid = scn.next();

//				Employee emp = new Employee(Number, lastName, email, date, jobid);

				Employee emp = new Employee();
				emp.setEmployeeId(Number);
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setHireDate(date);
				emp.setJobId(jobid);

				boolean result = dao.insertEmp(emp);
				
				if (result) 
					System.out.println("정상처리");
				 else 
					System.out.println("오류");
				

			} else if (menu == 3) {// 수정
				// 사원번호, firstname, phonenumber, salary
				System.out.println("사원번호를 입력하세요.");
				int Number = scn.nextInt();
				System.out.println("first Name을 입력하세요.");
				String firstname = scn.next();
				System.out.println("전화번호를 입력하세요.");
				String phoneNumber = scn.next();
				System.out.println("급여를 입력하세요");
				int salary = scn.nextInt();
				
				Employee emp = new Employee(Number, firstname, phoneNumber, salary);
				boolean result = dao.updateEmp(emp);
				if (result)
					System.out.println("정상처리");
				else
					System.out.println("오류");


//				Employee emp=new Employee();
//
//
//				emp.setEmployeeId(Number);
//				emp.setFirstName(firstname);
//				emp.setdPhoneNumber(phoneNumber);
//				emp.setSalary(salary);



			} else if (menu == 4) {// 삭제
				System.out.println("사원번호를 입력하세요.");
				int Number = scn.nextInt();
				dao.deleteEmp(Number);

			} else if (menu == 5) {// 한건조회
				System.out.println("사원번호를 입력하세요.");
				int emp = scn.nextInt();
				Employee r = dao.searchEmp(emp);

				if (r == null) {
					System.out.println("오류");
				} else
					System.out.println(r.toString());

			} else if (menu == 6) { // 다중조회
				System.out.println("사원이름조회");
				System.out.println("조회할 키워드를 입력하세요.");
				String emp = scn.next();
				List<Employee> employees = dao.searchMany(emp);

				for (Employee r : employees) {
					System.out.println(r.toString());
				}

			} else if (menu == 9) {// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end of while
		System.out.println("end of program");
		scn.close();

	}// end of main

}
