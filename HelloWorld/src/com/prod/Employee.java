package com.prod;

public class Employee {
	// 값을 담기 위한 용도 : field.
	private int employeeId;
	private String employeeName;
	private String department;
	private String job;
	private int salary; // 외부에서 접근 못하게 하는 것이 private

	public void setEmployeeId(int EmployeeId) {
		this.employeeId = employeeId;
	}

// 필드이름과 매소드 이름을 똑같이 (필드 샐러리 이름 디스샐러리로, 매개변수의 샐러리로 구분하기 위해)
// 값을 불러오고 싶으면 get 메소드, 값을 설정할 때는 set 메소드 (why ? 프라이베이트는 외부 접근 불가, 기능을 써야함)
// 대소문자 구분하기, 클래스의 필드를 쓸 때 this를 씀
	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return this.job;
	}

	public void setSalary(int salary) {
		if (salary <= 0) {
			this.salary = 10000; // 0보다 작으면 10000으로 출력
		} else {
			this.salary = salary;
		}
	}

	public int getSalary() {
		return this.salary;
	}

	public String getEmpinfo() {
		String result = this.employeeName + "의 부서는 " + this.department + "이고 직무는 " + this.job + "이고 급여는 " + this.salary
				+ "입니다.";
		return result;
	}

}
