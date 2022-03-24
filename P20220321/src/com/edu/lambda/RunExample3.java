package com.edu.lambda;

interface Runnable3 {
	public int run(String str); //매개변수있고, 반환타입없는
}
public class RunExample3 {
	public static void main(String[] args) {
		Runnable3 runnable = (String str) -> {
			return str.length();
		};
		int lnth = runnable.run("Hello, world"); //문자열의 크기를 담기
		System.out.println(lnth);
	}
}
