package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		// 오류 : Error, Exception
		// compile error, runtime error;
		try { //블럭 사이
		double result = 13 / 0; // runtime error (실행 시점에 알 수 있는 에러)
		System.out.println("결과: " + result );
		} catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다. "); //catch 구문 언어 실행시키고(에러났는 이유 알려주고), 시스템 종료 >> 예외처리!
		}
		
		Scanner scn= new Scanner(System.in);
		System.out.println("숫자를 입력하세요..");
		try {
			int menu = scn.nextInt();	
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력안하셨네요..");
		}
		
		scn.close();
		System.out.println("end of program");
	}
}
