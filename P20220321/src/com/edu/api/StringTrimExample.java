package com.edu.api;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123  ";
		String tel3 = "  1234  "; //중간의 공백은 제거불가
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
	}
}
