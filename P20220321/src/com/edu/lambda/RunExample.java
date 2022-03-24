package com.edu.lambda;

interface Runnable {
	public void run(); // 추상메소드..구현해줘야함

}

class RunImpl implements Runnable {

	@Override
	public void run() {
		System.out.println("달려달려");
	}

}

public class RunExample {
	public static void main(String[] args) {
		// 람다표현식 (String s) 매개값을 받아서 > {구현코드}; 기능구현

		Runnable runnable = new RunImpl();
		runnable.run(); // 기능 호출해서 사용

		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("호랑이가 달려달려");

			}

		}; // 익명구현객체를 생성하겠드악
		runnable.run();

		runnable = () //매개변수가 담겨져있는 블럭
				-> {	System.out.println("사자가 달려달려");	}; //매개변수를 실행시키는 블럭
		runnable.run(); 

	}
}
