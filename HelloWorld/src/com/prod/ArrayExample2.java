package com.prod;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 정수를 담을 수 있는 배열, ages 3개 담을 수 있는

		int[] ages = new int[3];

		ages[0] = 30;
		ages[1] = 32;
		ages[2] = 35;
		
		int sum=0;
		for (int i = 0; i < 3; i++) {
			System.out.println(ages[i] + "살 입니다.");
			sum +=ages[i]; System.out.println();
			System.out.println("나이의 합은" + sum + " 입니다.");
		}
		double avgAge = sum / (double) 3;
		System.out.printf("%.2f" , avgAge); // 소수점 2번째까지
	}
}
