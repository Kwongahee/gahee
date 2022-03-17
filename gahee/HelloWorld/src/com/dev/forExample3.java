package com.dev;

import java.util.Scanner;
// 블럭 주의. 블럭안에서만 유효. for문 사용할 때 증감식 등 규칙 꼭 지키기 <= : 작을동안에 >= : 클동안에
public class forExample3 {
	public static void main(String[] args) {
		// 입력받는 두 수를 num1, num2

		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");

		int num1 = scn.nextInt();

		System.out.println("두번째 값을 입력하세요");
		int num2 = scn.nextInt();
		int sum =0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		System.out.println(num1 + " 부터 " + num2 + "까지의 합 :" + sum);
	
	}
}
