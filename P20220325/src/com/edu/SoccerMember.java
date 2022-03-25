package com.edu;

import java.util.List;

public class SoccerMember  extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	

	private String co;
	private String lnme;
	
	
	public SoccerMember(int memberId, String memberName, String phone, String co, String lnme) {
		super(memberId, memberName, phone);
		this.co = co;
		this.lnme = lnme;
	}



	public String getCo() {
		return co;
	}


	public void setCo(String co) {
		this.co = co;
	}


	public String getLnme() {
		return lnme;
	}


	public void setLnme(String lnme) {
		this.lnme = lnme;
	}


	@Override
	public String toString() {
		return "SoccerMember [memberId=" + super.getMemberId() + ", memberName=" + super.getMemberName() + ", phone=" + super.getPhone() + ", co=" + co
				+ ", lnme=" + lnme + "]";
	}


	
	
	
	
	
}
