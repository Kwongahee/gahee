package com.edu;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		// 초(ex: 100초) 입력 > 시/분/초 로 변경하기
		Scanner scn = new Scanner(System.in);
//		int hour, minute, second, inputVal;
		
		System.out.println(" 초 단위 입력");
		int inputVal= scn.nextInt();
		int hour = inputVal / 3600; // 5000 / 3600 > 1시간
		int minute = (inputVal % 3600) / 60; // 1400 / 60 > 23분
		int second = (inputVal % 3600) % 60; // 1400 % 60 > 20초
		System.out.println(inputVal + "초 단위 입력");
		System.out.println(hour + "시" + minute + "분" + second + "초" );
		// 10 * 2 + 3 - 5;
		
		scn.close();
		
		
		
		
	}

}
