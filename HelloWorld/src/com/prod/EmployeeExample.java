package com.prod;

public class EmployeeExample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
//		e1.employeeId=100;
		e1.setEmployeeId(100);

//		e1.employeeName = "김사원";
		e1.setEmployeeName("김사원");

//		e1.department = "개발부";
		e1.setDepartment("개발부");

//		e1.job = "월급계산";
		e1.setJob("월급계산");

//		e1.salary = -1000000; //field에서 private걸어서 에러
		e1.setSalary(-10000); // 메소드 이용하면 가능.
		System.out.println(e1.getSalary());

//		System.out.println(e1.getEmployeeName() + "의 부서는 " + e1.getDepartment() + "이고 " + "직무는 " + e1.getJob() + "이고, "
//				+ "급여는 " + e1.getSalary() + "입니다.");

		System.out.println(e1.getEmpinfo());
		
		Employee e2 = new Employee();
		e2.setEmployeeId(101);
		e2.setEmployeeName("이재빈");
		e2.setDepartment("총무부");  //ctrl + 클릭 > 해당 메소드로 이동
		e2.setJob("비품구매");
		e2.setSalary(2000000);
		
		System.out.println(e2.getEmpinfo());
		
	}
}
