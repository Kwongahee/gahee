package com.edu;

import java.util.List;

public class Member  {
	// 필드.
	private int memberId;
	private String memberName;
	private String phone;

	//생성자
	public Member(int memberId, String memberName, String phone) {
		this.memberId=memberId;
		this.memberName=memberName;
		this.phone=phone;
	}
	

//메소드
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [회원아이디 :" + memberId + ", 회원 이름 : " + memberName + ", 연락처 : " + phone + "]";
	}




	

}
