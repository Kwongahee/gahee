package com.dev;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance(); // new Singleton(); 한번 만들었을때 계속 쓸 수 있는 클래스
		Singleton s2 = Singleton.getInstance(); // new Singleton();

		System.out.println(s1==s2);
		System.out.println(s2);
	
	}
}
