package com.edu;

import java.util.List;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	
	private String te;
	private String grade;
	
	

	public SwimMember(int memberId, String memberName, String phone, String te, String grade) {
		super(memberId, memberName, phone);
		this.te = te;
		this.grade = grade;
	}
	public String getTe() {
		return te;
	}
	public void setTe(String te) {
		this.te = te;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	@Override
	public String toString() {
		return "SwimMember [memberId=" + super.getMemberId() + ", memberName=" + super.getMemberName() + ", phone=" + super.getPhone() + ", te=" + te
				+ ", grade=" + grade + "]";
	}
	
	
	
	
	
	
}
