package com.edu.api;

public class IDCheckExample {
	public static void main(String[] args) {
		IDCheck idcheck = new IDCheck();
		String result = idcheck.getGender("950304-1234567");
		System.out.println(result);
		result = idcheck.getGender("980519 2111111");
		System.out.println(result);
		result = idcheck.getGender("0401062222222");
		System.out.println(result);
	}
		
}
