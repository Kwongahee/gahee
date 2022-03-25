package com.edu.thread;

import java.awt.Toolkit;

class BeepTask implements Runnable { // 러너블을 구현하는 인터페이스

	@Override
	public void run() { // 구현객체를 매개값으로 넣기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

//process(main쓰레드)
public class BeepPrintExample {
	public static void main(String[] args) {

		// 쓰레드 생성하는 방법
		// Thread의 생성자의 매개값으로 Runnable을 구현한 객체
//		Thread thread = new Thread(new BeepTask()); //클래스생성

		// Runnable 인터페이스의 익명구현객체를 생성.
		// Thread클래스의 생성자 매개값으로 활용.
		// 쓰레드 만들경우 > 기능이 구현되어야한다 ! 
		// or 쓰레드라는 기능을 상속..?
		
		Thread thread = new Thread(() -> { //생성자의 매개값으로 runnable의 구현객체를 여기
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			
		});

		thread.start(); // 쓰레드 시작

		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
