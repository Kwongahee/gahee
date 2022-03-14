package com.edu;

public class Variables {
	public static void main(String[] args) {
		// 변수 : 메모리공간 이름 지정하고 값을 할당.
		int age = 20; // 20 == 30 (같습니까) 
	 	System.out.println(" age변수: " + age);
		int num1 = 30;
		int num2 = 50;
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		System.out.println("20 + 10 = 30");
		
		String name = "홍길동"; //문자열. 두번째는 변수선언 안해도됨. 변수 선언은 한번만  홍길동이 최민규된것은 변수설정이 바꼈기때문
		name = "최민규";  
		System.out.println(name + "의 나이는 " + age + "입니다.");
		
		final String myName = "권가희"; // 상수(Constance) > 항상 고정된 값.
//		myName = "권가리"; 상수는 변경안됨
		String Number = "010-5121-4966";
		// 전화번호, 이메일 값을 담을 수 있는 변수. 둘다 문자열. 
	    String Mail = "gh7557@naver.com";
		
		
		System.out.println(myName + "의 전화번호는 " + Number + "이고 " + Mail + "입니다." );
	}
}
