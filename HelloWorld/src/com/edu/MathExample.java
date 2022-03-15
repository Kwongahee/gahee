package com.edu;

import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요.");
		int num1 = scn.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		int num2 = scn.nextInt();
		
//		int num1, num2;
//		Scanner scn = new Scanner(System.in);
//		System.out.println("첫 번째 수를 입력하세요.");
//		num1 = scn.nextInt();
		
		System.out.println("두 수의 합 = " + (num1 + num2)+"입니다.");
		System.out.println("두 수의 차 = " + (num1 - num2)+"입니다.");
		System.out.println("두 수의 곱 = " + (num1 * num2)+"입니다.");
		System.out.println("두 수의 몫 = " + (num1 / num2)+"입니다.");
		System.out.println("두 수를 나눈 후의 나머지는 = " + (num1 % num2)+"입니다.");
		
		scn.close();
	}
}