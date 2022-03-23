package com.edu.generic;

import java.util.ArrayList;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj("Hello");
//		String result = (String) box.getObj(); //필드의 타입이 스트링이라 캐스팅 해줘야함 string > string
//		System.out.println(result);
//		
//		
//		Integer result1 = (Integer) box.getObj(); //담겨져있는 타입이 int .. 캐스팅해주기 string > integer
//		System.out.println(result1);
		
		Box<String> stringBox = new Box<String>();
		stringBox.setObj("");
		String result = stringBox.getObj();

		Box<Integer> intBox = new Box<Integer>();
		intBox.setObj(100);
		int result1 = intBox.getObj();
		
		ArrayList<Integer> intAry = new ArrayList<Integer>();
	}
}
