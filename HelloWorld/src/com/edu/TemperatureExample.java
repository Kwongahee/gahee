package com.edu;

import java.util.Scanner;

public class TemperatureExample {
	public static void main(String[] args) {
		// C = 5/9(F-32) 화씨온도를 섭씨온도로 변경규칙.
		Scanner scn = new Scanner(System.in);
		System.out.println("온도 입력");
		double fDeg, cDeg;
		
		//scn.nextDouble();
		
		
		fDeg = scn.nextDouble();
		cDeg = (double) 5 / 9 * (fDeg - 32); 
		System.out.println(cDeg);

		//섭씨온도가 30.0보다 크면 "오늘은 더운 날씨네요" 그외는 "살만하네요 
		if(cDeg > 30.0) {
				System.out.println("오늘은 더운 날씨");
		} else {
				System.out.println("살만하네요");
		}
		scn.close();
	}
}
