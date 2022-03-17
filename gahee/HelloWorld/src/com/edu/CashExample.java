package com.edu;

import java.util.Scanner;

public class CashExample {
	public static void main(String[] args) {
		// 2개 값을 입력. 
		Scanner scn = new Scanner(System.in);
		
		System.out.println("가격을 입력하세요");
		int price = scn.nextInt();
		
		System.out.println("손님이 낸 금액을 입력하세요");
		int cash = scn.nextInt();
	
		System.out.println("거스름돈 :" + (cash - price));
		System.out.println(" 부가세 : " + (price * 1 / 11));
		
		
		// 가격을 입력하세요..
//		price = .nextInt(); // 5500원은 10%가 포함된 금액.

		// 손님이 낸 금액
//		cash = .nextInt(); // 10000원
		
		// 하나는 상품의 부가세, 하나는 거스름돈
		// 부가세 : 500 , 거스름돈 : 4500
		
		
	}
}
