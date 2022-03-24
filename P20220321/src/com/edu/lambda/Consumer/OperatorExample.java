package com.edu.lambda.Consumer;

import java.util.function.IntBinaryOperator;

// Operator : 연산처리 결과
public class OperatorExample {
	public static void main(String[] args) {

		IntBinaryOperator intBin = (left, right) -> left + right; // 기능 담아두기
		intBin.applyAsInt(10, 20);

		intBin = (num1, num2) -> num1 > num2 ? num1 : num2;  //숫자비교 .. 큰값이 올 수 있도록
		int result = maxOrMin(intBin);
		System.out.println(result);
	}

	public static int maxOrMin(IntBinaryOperator intBin) { //제일 큰 값 골라내기
		int[] intAry = { 85, 47, 92 };
		int result = intAry[0]; 
		for (int num : intAry) { // 배열에 들어있는 갯수만큼 반복문 실행
			result = intBin.applyAsInt(result, num); //result와 배열에 들어있는 값 비교해서 큰 값을 result에 담겠다
		}
		return result;

	}
}
