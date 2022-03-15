package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 숫자를 계속 입력할 수 있도록..
		// -1 값을 입력하면 입력멈춤.
		// sum 값에 입력
		// 스캐너 선언, sum 선언(0으로 초기화)
		// 숫자를 입력하세요.
		// -1로 종료한 후, 마지막에 입력한 값이 합계로 출력되게 

		Scanner scn = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("숫자를 입력하세요.");
			int inputVal = scn.nextInt();
			if (inputVal == -1) {
				break;
			}
			sum += inputVal; // inputVal를 sum에 넣어야한다.
		}

		System.out.println("합계의 값은" + sum + " 입니다.");

	}
}
