package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class ObjectExample {
	public static void main(String[] args) { // void 리턴 타입.
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student(100, "이가영"); // 첫번째 생성자가 아닌 int형을 부여받은 생성자.. studNo=100
		System.out.println(s1.getStudNo());
		System.out.println(s1.getStudName());
		s1.setKorScore(100);
		s1.setEngScore(60);
		s1.setMathScore(80);

// 생성자의 역할은 필드의 값을 받아온 값으로 초기화하는 용도, 
		Student s2 = new Student(101, "이혜린", 80, 82, 85); // 생성자를 통해 필드의 값을 지정할 수 있음 (순서 똑같이)
		System.out.printf(s2.getStudName(), "의 평균: %.2f", s2.getAvgScore());

		Student s3 = new Student(102, "서현일", 70, 80, 90);
		Student s4 = new Student(103, "최규완", 77, 82, 83);

		Student[] students = { s1, s2, s3, s4 }; // Student를 배열에 담고 싶다.
////////////////////////////////////////////////////		

		while (true) {
			System.out.println("조회하려는 학생의 이름을 입력하세요. (ex:홍길동)");
			String searchName = scn.next();
			if (searchName.equals("종료"))
				break;
			
			for (int i = 0; i < students.length; i++) {
				if (students[i].getStudName().equals(searchName)) {
					System.out.println(students[i].getStudInfo());
				}
			}
		}
		
	} // while 구문안에 for 구문 넣기 

	///////////////////////////////////////////////////////////////////////////////

//	students[0].getAvgScore();
//	students[1].getStudName();
//	

//		s1.setStudNo(100); // student 에서 디폴트 접근지시하면 접근불가
//		s1.setStudName("이가영"); // 퍼블릭 접근지시하면 다른 패키지에서도 접근가능

}
