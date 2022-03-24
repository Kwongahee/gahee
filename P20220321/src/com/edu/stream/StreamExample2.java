package com.edu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("길동이", "남자", 70, 100)); //170
		list.add(new Student("김커피", "여자", 80, 150)); //230
		list.add(new Student("권요리", "남자", 100, 80)); //180
		list.add(new Student("박조리", "여자", 100, 90)); //190

		//남자,여자 스코어+포인트 > 180이상인 학생들만 출력해보세요
		System.out.println("스코어와 포인트의 합이 180이상인 학생 리스트");
		list
		.stream()
//		.filter(student -> (student.score + student.point) >= 180) //180점 이상인 대상을 필터,,
		.sorted()  //오름차순, 내림차순 ,, Comparable 구현하는 클래스
		.forEach(student -> System.out.println(student));
		
		System.out.println("=====================================================");
		
		System.out.println("스코어가 80점 이상인 학생 리스트"); // 필터링 된 대상을 출력
			list //컬렉션으로부터
			.stream() // 스트림생성
			.filter(student -> student.score >= 80) // 80점 이상인 대상을 필터,, 
			.filter(student -> student.gender.equals("여자"))
			.forEach(student -> System.out.println(student)); //필터링된 대상을 출력
	}
}