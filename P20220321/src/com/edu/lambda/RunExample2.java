package com.edu.lambda;

interface Runnable2 {
	public void run(String animal); //매개변수있고, 반환타입도 있고
}

public class RunExample2 {
	public static void main(String[] args) {
		Runnable2 runnable = (String animal) -> // 매개변수가 담겨져있는 블럭
		{
			System.out.println(animal + "이(가) 달립니다.");// 매개변수를 실행시키는 블럭
		};
		runnable.run("호랑이");

	}
}
