package com.edu;

public class BitExample {
	public static void main(String[] args) {
		int num = 10;
		int result = num << 3;
		System.out.println(result);
		
		int val = 100;  //대입 연산
		val = val + 10; //대입 연산 (오른쪽부터 봐야함)
		System.out.println(val); // 110
		
		val += 20; // val값에서 다시 20더한값을 도출
		System.out.println(val); // 130
		
		val = val - 5; //125
		val -= 10; //115
		
		val = val * 2; //230
		val *= 2; //460
	    System.out.println(val); //460
	
	    String message = "반갑습니다";
	    System.out.println(message);
	    
	    message = message + "권가희입니다";
	    System.out.println(message);
	    
	    message += "좋은 하루 보내삼";
	    System.out.println(message);		
	    
	    
	    int cnt = 0;
	    cnt = cnt + 1; 
	    cnt += 1;
	    cnt++; //  =+1
	    cnt--; // =-1
	    System.out.println(cnt);
	    
	}
}
