package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {

		// for
		for (int i = 1; i <= 5; i++) {
			System.out.println("i의 값=> " + i);
		}

		// while
		int i = 1; // 초기화
		while (i <= 5) { // 조건식
			System.out.println("i의 값=> " + i);
			i++; // 증감식의 위치가 중요
		}

//		// while
//		int num = 0;
//		while (true) {
//			System.out.println("i의 값=> " + num);
//			num++;
//			if (num > 5) {
//				break; //반복문을 빠져나옴. (종료하는 구문이 있어야함)
//			}
//		}

		// while
		while (true) {
			int rand = (int) (Math.random() * 10) + 1;
			System.out.println("임의의 생성된 값 : " + rand);
			if (rand == 8) {
				break;
			}
		}

		// 숫자를 맞출때까지 계속 반복
		Scanner scn = new Scanner(System.in);
		int randomVal, userVal;
		randomVal = (int) (Math.random() * 5) + 1;
		while (true) {
			System.out.println("임의 값을 입력하시오. (1~5)");
			userVal = scn.nextInt();

			if (randomVal == userVal) {
				System.out.println("생성된 임의의 값과 같다");
				break;
			}
		}
		System.out.println("End of prog");

	}
}


