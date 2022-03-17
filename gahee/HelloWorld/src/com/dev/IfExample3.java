 package com.dev;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {

		//랜덤숫자랑 입력한값이 같으면 정답 ! 다르면 오답 !
		
		Scanner scn = new Scanner(System.in);
		System.out.println("1 ~ 10까지의 숫자를 입력하세요");
		int inputVal = scn.nextInt();
		
		int ranVal = (int) (Math.random() * 10 ) + 1;
		System.out.println(ranVal);
		
		if ( ranVal == inputVal ) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
		scn.close();
	}
}
