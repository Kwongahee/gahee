package com.dev;

public class ForExample {
	public static void main(String[] args) {
//		i = i + 1;
//		i += 1;
//		i++;  > 1을 증가시키겠습니다.
		// 1~10 까지 더하면 ??
		int sum = 0;
		for(int i= 1; i <= 5; i++) {
			System.out.println(i);
			sum = sum + i; // sum의 값 : 0, i의 값은 1, sum의 값 0+1=1
		}
		
		System.out.println("합계: " + sum);
		
		
	}
}
