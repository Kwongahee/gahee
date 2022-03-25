package com.edu;

import java.util.List;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)

	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실

	private String ban;
	private String cname;

	public BookMember(int memberId, String memberName, String phone, String ban, String cname) {
		super(memberId, memberName, phone);
		this.ban = ban;
		this.cname = cname;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "BookMember [memberId=" + super.getMemberId() + ", memberName=" + super.getMemberName() + ", phone=" + super.getPhone() + ", ban=" + ban
				+ ", cname=" + cname + "]";
	}

}
