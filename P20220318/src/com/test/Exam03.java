package com.test;

import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성.
public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numbers = new int[3];

		System.out.println("첫번째 값을 입력하세요");
		numbers[0] = scn.nextInt();
		System.out.println("두번째 값을 입력하세요");
		numbers[1] = scn.nextInt();
		System.out.println("세번째 값을 입력하세요");
		numbers[2] = scn.nextInt();


		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}

		}

System.out.println("제일 큰 값은 : " + numbers[0]);		
	}
}
