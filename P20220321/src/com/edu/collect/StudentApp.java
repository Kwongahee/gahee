package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {  //기능 다 넣겠다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	List<Student> list = new ArrayList<Student>(); //값을 담고 불러오는 기능.. 배열처럼 표현하는 
	Scanner scn = new Scanner(System.in);

	// 멤버클래스

	class StudentServiceImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); //추가
		}

		@Override
		public Student getStudent(int sno) { //학생번호로 한건 조회.
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getStuNumber() == sno) {  // 한 건 가져올때는 get
					return list.get(i); //있으면 스튜던트 클래스 리턴
				}
			}
			return null; //없으면 null 리턴
		}

		@Override
		public List<Student> Studentlist() { //전체 리스트.
			return list;
		}

		@Override
		public void modifyStudent(Student student) { //수정. student에 담겨있는 값으로 변경..
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getStuNumber() == student.getStuNumber()) {
					list.get(i).setEngScore(student.getEngScore());  //영어점수를 수정
					list.get(i).setKorScore(student.getKorScore());  //국어점수를 수정
				}
			}

		}

	}// end of StudentServiceImpl

	public void execute() {  //요것은 메소드다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정 9.종료
		while (true) {
			System.out.println("1.추가  2.리스트  3.한건조회  4.수정  9.종료");
			System.out.print("선택 >> ");

			int menu = scn.nextInt();
			if (menu == 1) {

			} else if (menu == 1) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		} // end of while
		System.out.println("end of program");

	}
}
