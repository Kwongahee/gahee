package com.dev;

import java.util.Scanner;

public class ForExample5 {
	public static void main(String[] args) {
		
//		int num = 48;
//		for (int i = 1; i <= num; i++) {
//			if ( num % i==0)
//				
//			{System.out.println(num + "의 약수는" + i + "입니다." );}
//		}
		
		
		
				
		
		
		int num = 48;
		
		for (int i=1; i <= num; i++) {
			if (num % i ==0)
			
			{System.out.println( num + "의 약수는" + i + "입니다.");}
		}
		
		//최대공약수
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1=scn.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2=scn.nextInt();
		
		int max = 0;
		for (int i=1; i <= num2; i++) {
			if ( num2 % i ==0 && num1 % i ==0)
				max = i;
		}
		System.out.println(max);	
		
		
		
	}
}
