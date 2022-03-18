package com.dev;

public class Singleton {	
	private static Singleton instance = new Singleton();
	//static 은 클래스에 소속돼있어서 유일하게 존재. 생성자 호출못하도록 숨기기
	// 각 각 다른 값 가지기 위해서는 private 선언해야함.
	private Singleton() {
	}
	
	public static Singleton getInstance() { 
		return instance;
	}
}
