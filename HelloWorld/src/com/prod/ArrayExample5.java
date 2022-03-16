package com.prod;
// 나는 첫번째. 세번째, 다섯번째, 일곱번째 (홀수 위치에 있는 숫자의 합과 평균 구하기)
public class ArrayExample5 {
	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		
		int sum = 0;
		int cnt = 0;
		for (int i =0; i < numbers.length; i++ ) {
			if ( i % 2 == 0) { //홀수번째 값 (배열이 0부터 시작해서 ==0이 돼야 홀수 위치가 됨)
				sum += numbers[i];
				cnt++;
			}
		}
		System.out.println("홀 수 번째 값의 합: " + sum );
		System.out.println("홀 수 번째 값의 평균: " + (sum / (double)cnt));
	}
}
