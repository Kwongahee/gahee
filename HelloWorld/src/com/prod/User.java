package com.prod;

public class User {

	private int userId;
	private String userGrade;
	private String userNo;
	private int userPoint;



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUserGrade() {
		return userGrade;
	}



	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}



	public String getUserNo() {
		return userNo;
	}



	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}



	public int getUserPoint() {
		return userPoint;
	}



	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}



	public String getEmpinfo() {
		String result = " 사용자 아이디 : " + this.userId + ", 사용자 등급 : " + this.userGrade + ", 사용자 번호: "
				+ this.userNo + ", 사용자 포인트: " + this.userPoint;
		
		return result;
	}

}
