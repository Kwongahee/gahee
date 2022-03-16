package com.prod;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 }; // 변수 선언하면서 바로 값 할당
		// length : 배열의 크기 ex)7
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {// 짝수일 경우...
				sum += numbers[i];
				cnt++;  //cnt++ > 조건 후 변수의 현재 수(?)
			}
		}
		System.out.println("짝수 값의 합: " + sum);
		System.out.println("짝수 값의 평균: " + (sum / (double) cnt)); // 평균 구하는 공식 외우기
	}
}
