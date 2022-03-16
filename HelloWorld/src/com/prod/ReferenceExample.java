package com.prod;
class {
	String name;
	int age;
}

public class ReferenceExample {
	public static void main(String[] args) {
		//참조타입 vs 기본(데이터)타입
		// 클래스 타입의 변수 > 참조타입.		
		
		int num1 = 10; //리터럴
		int num2 = 10; //
		// int, double, (byte, short, long, float, char, boolean)
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 ==num2); //기본타입은 같은 숫자라 true가 뜸.
		
		String str1 = new String("Hello"); // 
		String str2 = new String("Hello");
		
		System.out.println(str1); // 123afbc35 (16진수로표현)
		System.out.println(str2); //ab3af3ch5
		System.out.println(str1==str2); // 참조 타입은 같은 글자라도 false가 뜸. 원래 있던 메모리 값의 주소값을 가지고 있기때문에 false가 뜸. 
		// 참조타입은 변수 선언할때마다 다른 주소만듬
		System.out.println(str1.equals(str2)); //문자값을 비교할때 equals라는 메서드를 씀. 문자열이 같으면 true가 뜸.

		//배열은 주소값이 담기는 참조타입이다.
		
	}
}
