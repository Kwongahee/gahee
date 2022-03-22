package com.edu.api;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-123456";
		
		String firstNum= ssn.substring(0,6); //0~6의 인덱스값 .. 0포함 6제외
		System.out.println(firstNum);
		
		String secondNum=ssn.substring(7); //7부터 끝까지
		System.out.println(secondNum);
				
	}
}
