package com.edu.except;

public class SlowEx {
	public static void main(String[] args) {
		showInterval ("Hello, World");
	}
	
	
	public static void showInterval(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(200); //예외처리를 통해 처리해야하는 구문 (0.3초 동안 멈췄다가 다시 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
