package com.test;

import java.util.Scanner;

//문제2) 정수형 변수 n1, n2를 선언하고 Scanner 클래스를 통하여 두정수를 입력받은 후 큰수에서 작은 수를 나눈 결과값을 소수점 첫번째까지 구하는 기능 작성. 
public class Exam02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요.");
		double num1 = scn.nextInt();
		
		System.out.println("두번째 수를 입력하세요.");
		double num2 = scn.nextInt();
		
		double go = (num1/num2);
		double go2 = (num2/num1);
		
		System.out.println("큰수에서 작은수로 나눈 값은");
		if (num1 > num2) {
			System.out.printf("%.1f ", (go) );
		} else {
			System.out.printf(" %.1f ", (go2) );
		}
		scn.close();
	}
}
