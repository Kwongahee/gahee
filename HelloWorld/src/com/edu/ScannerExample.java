package com.edu;

import java.util.Scanner;

public class ScannerExample { // com.edu.ScannerExample
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //시스템인 > 키보드입력한 값을 (스캐너)읽어드리겠습니다

		System.out.println("첫번째 숫자를 입력하세요..");
		int val = scn.nextInt(); // 입력했던값을 불러오는 기능. 입력한 값 val에 불러옴 nextint는 입력해야 다음으로 넘어감.
		
	    System.out.println("두번째 숫자를 입력하세요..");
	    int val2 = scn.nextInt();
	    int result = val + val2; 
	  
	    System.out.println("두수의 합은 " + result + "입니다." );

//	if(val % 2 ==0) {
//			System.out.println("짝수입니다.");
//		}
//		
//		if(val % 2 ==1) {
//			System.out.println("홀수입니다.");
//		}
//
		scn.close();
	}
}
