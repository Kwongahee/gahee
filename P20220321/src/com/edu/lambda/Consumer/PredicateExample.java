package com.edu.lambda.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	String name;
	String gender;
	int score;

	// 생성자.
	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

}

public class PredicateExample {
	public static void main(String[] args) { // 기능설명..기능정리
		Predicate<Student> pridic = new Predicate<Student>() {

			@Override
			public boolean test(Student t) { // 매개값으로 받은 스튜던트 타입의 변수 = t..

				return t.gender.equals("남자"); // true or false 로 리턴
			}

		};
		double avg = avg(pridic); // 이 기능을 avg의 매개값으로 던져줌
		System.out.println("남학생의 평균은 " + avg);
		pridic = (s) -> s.gender.equals("여자");
		avg =avg(pridic);
		System.out.println("여학생의 평균은 " + avg);
	}

	public static double avg(Predicate<Student> pred) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("길동이", "남자", 70));
		list.add(new Student("김커피", "여자", 80));
		list.add(new Student("권요리", "남자", 60));
		list.add(new Student("박조리", "여자", 90));

		int cnt = 0;
		int sum = 0; // 학생들의 값..저장
		double avg = 0;

		for (Student student : list) {
			if (pred.test(student)) { // 이 값이 참일 경우
				cnt++; // 참이면 값 증가시키기
				sum += student.score; // 값 누적시키기
			}
		}

		avg = sum / (double) cnt;
		return avg;
	}
}
