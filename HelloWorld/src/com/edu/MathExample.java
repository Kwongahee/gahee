package com.edu;

import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하시오.");
		double num1 = scn.nextDouble();
		System.out.println("두 번째 수를 입력하시오.");
		double num2 = scn.nextDouble();
		
		System.out.println("두 수의 합 = " + (num1 + num2)+"입니다.");
		System.out.println("두 수의 차 = " + (num1 - num2)+"입니다.");
		System.out.println("두 수의 곱 = " + (num1 * num2)+"입니다.");
		System.out.println("두 수의 몫 = " + (num1 /num2)+"입니다.");
		System.out.println("두 수를 나눈 후의 나머지는 = " + (num1 % num2)+"입니다.");
		
		scn.close();
	}
}