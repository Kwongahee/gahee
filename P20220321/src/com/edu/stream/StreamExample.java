package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	String name;
	String gender;
	int score;
	int point;
	// 생성자.
	
	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		
		
	}
	
	
	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point + "]";
	}


	@Override
	public int compareTo(Student student) {
	//this 와 student 비교 : this, student  => 오름차순 : 음수. 내림차순 : 양수
//		if(this.score < student.score) { // 스코어 정렬
//			return -1000;
//		} else {
//			return 9000;
//		}
//		return   (this.score - student.score)  ; //60(this.score), 70(비교대상점수)... 값이 음수가 된다면 60, 70 순서로 넣는다는것. (작은값>큰수:오름차순)
		//양수가 나오면 내림차순.. (큰수-작은수=양수) 즉 ! 큰수 작은수 순으로 정렬했다는 뜻이니까.

		return (this.score+this.point) - (student.score +student.point);  // 포인트+스코어 합계 오름차순 정렬 
	
	}


}

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("길동이", "남자", 70));
		list.add(new Student("김커피", "여자", 80));
		list.add(new Student("권요리", "남자", 60));
		list.add(new Student("박조리", "여자", 83));
	
		//평균구하기
		int sum=0, cnt=0;
		double avg =0;
		for(Student student : list ) {
			if(student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}
		}
		avg = sum / (double) cnt;
		System.out.println("컬렉션평균: " + avg);
		
		
		Stream<Student> stream = list.stream(); // 스트림생성. ..
		OptionalDouble od = stream.filter((s) -> s.gender.equals("남자")).mapToInt(s->s.score).average();
		
		avg = od.getAsDouble();
		System.out.println("스트림평균: " + avg);
		
//		stream.forEach // 스트림 데이터 각각의 요소에 대한 기능을 넣겠ㄷㅏ... 컨슈머라는 인터페이스를 포이치에 넣기(?)
//   	그냥 출력..
//		//반복적으로 기능을 실행하겠다. (코드기니까 람다식 활용)
//		((Student t) -> {
//			System.out.println("이름 : " + t.name + ", 성별 : " + t.gender + "점수 : " + t.score); // 인스턴스 각각에 대해 기능 구현완료
//
//		});
	}
}
