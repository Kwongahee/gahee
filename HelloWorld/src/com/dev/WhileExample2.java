package com.dev;

public class WhileExample2 {
	public static void main(String[] args) {
		// 1~10까지의 수 중에서 짝수만 출력.
		// while 문으로 작성

		int i = 1; // 초기화
		while (i <= 10) { // i가 10보다 작아야함
			if (i % 2 == 0) { // 짝수가 될려면 i를 2로 나눴을 때 0이 나와야함
				System.out.println("i의 값 : " + i);
			}
			i++; // 증감식...

		}
	}

}
