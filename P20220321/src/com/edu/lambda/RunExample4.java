package com.edu.lambda;

interface Runnable4 {
	public int run(); // 매개값없, 반환타입있
}

public class RunExample4 {
	public static void main(String[] args) {
		Runnable4 runnable = () -> {
			return (int) (Math.random() * 10);
		};
		int result = runnable.run();
		System.out.println(result);

		//함수적 프로그램을 작성하고 싶다 ! : 간단하게 표현(화살표 있는것 ... 람다표현식)
		// 기능을 변수에 담음 >>
		runnable = () -> {
			return (int) (Math.random() * 100);
		};
		int result2 = runnable.run();
		System.out.println(result2);
	}
}
