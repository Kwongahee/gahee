package com.prod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User {
	private String userid;
	private String passwd;
	private String name;
	
	

	public User() {
		
	}
	
	
	public User(String userid, String passwd) {
		super();
		this.userid = userid;
		this.passwd = passwd;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "User [회원아이디 = " + userid + ", 이름 = " + name + "]";
	}

	
	
	
	
	
	
	
}
