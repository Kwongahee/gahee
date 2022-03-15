package com.dev;

import java.util.Scanner;

public class Ifexample2 {
	public static void main(String[] args) {
		// 물건가격이 50000원 이상이면 배송비 0
		// 그 외에는 배송비 3000원.
		
		// 결재할 금액이 얼마인지를 보여주는 코드.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("가격을 입력하세요.");
		int price = scn.nextInt();
		int fee = 3000;
		
//		if (price >= 50000) {
//			price =price;
//		} else {
//			price = price + fee;
//		}

		price = (price >=50000) ? price : price + fee;
		
		System.out.println("결제할 금액은" + price + "입니다.");		
		
	}
}
