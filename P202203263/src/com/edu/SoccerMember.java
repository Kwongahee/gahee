package com.edu;

import java.util.List;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)

	// 정보출력시 => 코치이름: 홍길동, 락커룸: A

	private String coachName;
	private String rockName;

	public SoccerMember(int memberId, String memberName, String phone, String coachName, String rockName) {
		super(memberId, memberName, phone);
		this.coachName = coachName;
		this.rockName = rockName;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += ", 코치 이름 :" + coachName + ", 락커룸의 이름:" + rockName + "]";
		return info;
	}

}
