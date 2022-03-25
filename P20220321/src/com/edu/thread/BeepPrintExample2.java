package com.edu.thread;

import java.awt.Toolkit;

class BeepThread extends Thread {

	@Override
	public void run() {
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

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//쓰레드라는 클래스를 상속받아서 
		
		
		// 비프음.. 생성
		// Thread클래스를 상속받는 클래스를 선언.. rung메소드를 override기능구현
		Thread thread = new BeepThread();
		thread.start();

		// 비프 출력
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
