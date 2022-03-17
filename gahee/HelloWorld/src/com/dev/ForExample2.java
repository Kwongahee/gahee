package com.dev;

public class ForExample2 {
	public static void main(String[] args) {
		// 블럭 넣어서 구문 만들기
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}
		for (int i = 4; i <= 6; i++) {
			System.out.println(i);
		}

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
// 2를 증가시킬려면 i+=2 
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		int startCnt = 11; // 변수도 값으로 넣을수 있음
		int lastCnt = 20; // 20까지 반복
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("짝수의 합: " + sum);
	}
}
