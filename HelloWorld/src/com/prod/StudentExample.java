package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
			s1.studentName = "홍길동";
			s1.korScore = 80;
			s1.engScore = 85;
			s1.study("국어");  //메소드 사용
			s1.eat("급식");
			s1.eat("간식");
			s1.eat("초콜릿");
			
			int v1 = s1.getkorScore();		
			int v2 = s1.getengScore();
			
			System.out.println("국어점수: " + v1 + ", 영어점수 : " + v2);
			
			
	}
}
