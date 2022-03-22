package com.edu.api;

public class StringChartExample {
	public static void main(String[] args) {
		String ssn = "020624-1230123";
		char sex = ssn.charAt(7); // 7번째 숫자
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;

		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
