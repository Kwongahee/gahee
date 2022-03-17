package com.dev;

public class SwithExample2 {
	public static void main(String[] args) {
		//90점 이상 A, 80점 이상 B, 70점 이상 C, 60점이상 D, 그외 F
		
		int score=60; // > 하나의 값으로

//		switch(score / 10) {
//		case 10:
//		case 9 :
//		case 8:
//		case 7:
//		case 6:
//			System.out.println("pass");
//			break;
//		default:
//		System.out.println("fail");
			
		switch(score / 10) {
		case 10:
			System.out.println("A 입니다");
			break;
		case 9 :
			System.out.println("A 입니다.");
			break;
		case 8:
			System.out.println("B 입니다.");
			break;
		case 7:
			System.out.println("C 입니다.");
			break;
		case 6:
			System.out.println("D 입니다.");
			break;
		default:
			System.out.println("F 입니다.");
		}
		
	}
		
}

