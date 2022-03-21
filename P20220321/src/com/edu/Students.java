package com.edu;

public class Students extends Person {  //펄슨클래스 공통 기능 상속받음.
	//학교정보,학년정보 : 이름, 나이, 키, 몸무게
	private String school;
	private int grade;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
