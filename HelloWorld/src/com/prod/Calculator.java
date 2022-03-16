package com.prod;

// 클래스를 정의하는 부분
public class Calculator {

	// 매개변수를 두개 입력받고, 두 수를 더해서 반환해주는

	double PI = 3.14;

	// 매개변수, 매개변수
	int add(int n1, int n2) { // add 정수형 타입을 반환해주는 메소드
		return n1 + n2;
	}

	// 반환:int, minus(메소드이름), v1, v2, v1에서 v2를 뺀 메소드

	int minus(int v1, int v2) {
		return v1 - v2;
	}
	// 사각형의 넓이 계산.. 
	double getRectArea(double x, double y){
		return x * y; //반환되는 타입 맞춰서 넘기기
	}
	
	// 원의 넓이 계산 ..
	double getCircleArea(double radius){
		return PI * radius * radius;
	}
	
}
