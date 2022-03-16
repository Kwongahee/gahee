package com.prod;

// 변수의 값 서로 바꾸기. 변수값을 변수값으로 이동가능
public class ArrayExample7 {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("num: " + num1);
		System.out.println("num: " + num2);

		int[] numbers = { 15, 20 }; // 두 개의 숫자 위치바꾸기.
//		int[] numbers = new int[];
//		numbers[0]=15;
//		numbers[1]=20;
		
		
		temp = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = temp;

		System.out.println("바뀐 첫번째 : " + numbers[0]);
		System.out.println("바뀐 두번째 : " + numbers[1]);
	}
}
