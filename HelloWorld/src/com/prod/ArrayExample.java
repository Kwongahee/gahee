package com.prod;

public class ArrayExample {
	public static void main(String[] args) {
		long l1 = 4644845468465L; // 마지막 L을 붙여서 long타입을 표시 8byte.
		int i1 = 100; // 4byte  (1bit 8개 > 1byte) 
		byte b1 = 127; // (두개의 차이 > 값을 담을 수 있는 크기 1byte)  -128 ~ ~1 / 0 ~ 127 byte의 범위는 이거밖에 안됨. 127의 값은 최대 범위를 넘어서 젤 작은 값으로 나타남
		b1++;
		b1++;
		short s1 = 100; //  (2byte 값을 담을 수 있는 것이 short 타입) -32768~-1 / 0~32767
		System.out.println(b1);
		
		int sum = 0;		
		int score1 = 80;
		int score2 = 90;
		int score3 = 85;
		int score4 = 95;
		int score5 = 88;
		
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;

		double avg = sum / (double) 5;

		int[] scores = new int[5];
		
		scores[0] = 80; // 첫번째 위치의 값 0으로 시작
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 95;
		scores[4] = 88;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]); //이거나 밑에거나 결과값 같음. 짧게쓰는게 더 효율
		
//		System.out.println(scores[0] + scores[1]);
		// 배열을 활용해서 sum => avg 
		sum = 0;
		for (int i=0; i < 5; i++) {
//			System.out.println(scores[i]); // scores[0] , for반복문이 더 편함
			sum +=scores[i];
		}
		avg = sum / (double) 5;
		System.out.println("평균은 " + avg);
		
	}
}
