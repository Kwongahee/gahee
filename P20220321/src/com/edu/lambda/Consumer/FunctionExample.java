package com.edu.lambda.Consumer;

import java.util.function.ToIntFunction;

import com.edu.collect.Student;
//Function 인터페이스 : 매핑작업.(Student -> int)
public class FunctionExample {
	public static void main(String[] args) {
		ToIntFunction<Student> func = (Student student) -> {
			return student.getEngScore() + student.getKorScore();
		};

		
//		ToIntFunction<Student> func2 = (student) -> student.getEngScore() + student.getKorScore();
//		 ... 생략버전
		
		
		int result = func.applyAsInt(new Student(101, "gahee", 90, 90)); // 결과값을 반환
		System.out.println("결과 값은 " + result);
	}
}
