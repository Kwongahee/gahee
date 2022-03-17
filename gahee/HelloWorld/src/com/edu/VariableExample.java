package com.edu;

public class VariableExample {
	public static void main(String[] args) {
		// 변수의 타입.
		int num1 = 100; // int 값 표현할려면 4bit 필요
		double num2 = 100.5; // double 소수점까지 표현 값 표현할려면 8bit 필요. double 더 큰 형태의 파일
		double result = num1 * num2; // 10050; num1이 double타입으로 바뀌게 해야함 double 이라 실수타입으로 결과나옴
		// 자동형변환(promotion) : 작은범위 > 큰범위. 
		System.out.println("결과: " + result ) ;
		// 강제형변환(casting) : 큰범위 > 작은범위 
		int val1 = 100;
		double val2 = 20.5;
		int sum = val1 + (int) val2; // 괄호안이 강제형변환 > 변환해서 정수형이 도출
		System.out.println("결과 : " + sum);
		
		int n1 = 11;
		int n2 = 4;
		
		double n3 = (double) n1 / n2; // n1을 n2로 나누겠습니다.   10/4 = 2.5 한쪽을 더블로 바꿔줘야 소수점까지 결과.
		System.out.println("나눈 결과: " + n3);
		
		// 나머지 10을 3으로 나눈 나머지 > 1
		int n4 = n1 % n2; // % > 나머지를 구한다(정수 기준)
		System.out.println("나머지: " + n4);
		
		// 짝수, 홀수
        //n4 = n1 % 2; > 0이 나오면 짝수, 1이 나오면 홀수
		if(n1 % 2 == 1) { 
			System.out.println(n1 + "의 값은 홀수입니다.");
		}
	}
}
