package com.prod;

public class CalExample1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator(); // cal로 설정 + 초기화
		System.out.println(cal.PI);

		int number1 = 10;
		int number2 = 20;
		// 정의된 기능을 호출하는 부분 => 매개값, 매개값이 들어가야함!!!!!!
		
		int result = cal.add(number1, number2);
		System.out.println(number1 + "과 " + number2 + "의 합계 : " + result);

		int result2 = cal.minus(number1, number2);
		System.out.println(number1 + "과 " + number2 + "의 차이 : " + result2);	
		
		double area = cal.getRectArea(number1, number2);
		//10 > 10.0
		System.out.println( number1 + "과 " + number2 + "의 넓이는 " + area);
		
		double r = 4.5;
		area = cal.getCircleArea(r);
		System.out.println("반지름" + r + "의 넓이: " + area );
	
	
	
	}

}
