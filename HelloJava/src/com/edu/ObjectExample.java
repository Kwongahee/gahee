package com.edu;

//object(객체) -> Class(객체의 특징을 모아놓은 도면, 틀) -> 인스턴스생성(초기화).
// 학생(객체:Object) -> class Student -> instance(new Student())
public class ObjectExample {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 12.34;
		double num3 = 20; //자동형변환(promotion) 
		int num4 = (int)23.4; //int보다 double의 값이 커서 x ... 강제형변환(Casting)
		
		String str1 = new String(); // 클래스로 생성. heap(인스턴스)생성.
		Car car1 = new Car(); // 초기화(인스턴스 생성.) 기능을 가지고 있는 실체를 만든 것 "중요"
		car1.setModel("Sonata");
		car1.setPrice(10000000);
		
		Student s1 = new Student(); //초기화시점에 값을 지정하고 싶다! > 생성자를 통해서 값을 지정하는 기능을 담기 
		s1.setStudNo(100);
		s1.setStudName("김형민");
		s1.setKorScore(90);
		s1.setEngScore(80);
		s1.setMathScore(85);
		
		System.out.println("영어 점수 초기값 : " + s1.getEngScore());
		System.out.println("영어 점수 초기값 : " + s1.getStudName());
		System.out.println(s1.getStudName() + "의 합계 점수: " + s1.getSumScore());
		System.out.println(s1.getStudName() + "의 평균 점수: " + s1.getAvgScore());
	}
}
