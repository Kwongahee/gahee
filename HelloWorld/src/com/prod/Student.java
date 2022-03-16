package com.prod;

public class Student {
	// 22-123456
	// 정보 담는 용도 >필드. 
	String studentNo;
	String studentName;
	int korScore;
	int engScore; // 여기까지 필드

	// method : 기능.. 함수 정의는 메소드에서 하기 (기능 > 메소드)
	void study(String gwamok) { //void = 비어있다는뜻. 값 담을수가 없음.
		System.out.println( gwamok +"를(을) 공부합니다.");
	}
	
	void eat(String food) {
		System.out.println(food + "을 먹습니다.");
	}
	
	int getkorScore() {
		return korScore; //국어점수에 있는 값을 int 타입으로 돌려주겠습니다.
	}
	
	int getengScore() {
		return engScore;
	}
	
}

	