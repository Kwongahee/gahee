package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp { // 기능 다 넣겠다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// 필드
	List<Student> list = new ArrayList<Student>(); // 값을 담고 불러오는 기능.. 배열처럼 표현하는
	Scanner scn = new Scanner(System.in);

	// 생성자
	public StudentApp() {
//		list.add(new Student(101, "권가희", 50, 60));
//		list.add(new Student(102, "해정잉", 70, 80));
//		list.add(new Student(103, "유빈잉", 90, 70));
	}

	// 멤버클래스 //기능 여기 넣기
	class StudentServiceImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가
		}

		@Override
		public Student getStudent(int sno) { // 학생번호로 한건 조회.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNumber() == sno) { // 한 건 가져올때는 get
					return list.get(i); // 있으면 스튜던트 클래스 리턴
				}
			}
			return null; // 없으면 null 리턴
		}

		@Override
		public List<Student> Studentlist() { // 전체 리스트.
			return list;
		}

		@Override
		public void modifyStudent(Student student) { // 수정. student에 담겨있는 값으로 변경..
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNumber() == student.getStuNumber()) {
					list.get(i).setEngScore(student.getEngScore()); // 영어점수를 수정
					list.get(i).setKorScore(student.getKorScore()); // 국어점수를 수정
				}
			}

		}

		@Override
		public void deleteStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStuNumber() == sno) {
					list.remove(i);

				}
			}

		}

		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchStudent = new ArrayList<Student>();
			// 찾았다고 종료x
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(name)) {
					searchStudent.add(list.get(i));
				}
				// 같은 이름이 있는지 찾아보고 있으면 searchList.add()
			}
			return searchStudent;

		}

		@Override
		public void saveTofile() {
			// TODO Auto-generated method stub

		}
	}// end of StudentServiceImpl

	public void execute() { // 실제 실행메소드
		StudentService service = null;
//		new StudentServiceImpl();
//		service = new StudentServiceFile();
		service = new StudentServiceOracle();
		// 요것은 메소드다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 다른 기능을 호출
		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정 6.이름조회(이름) 9.종료..
		// 인터페이스를 변수이름으로 선언 ..
		// 메인기능 담당하는 execute()
		while (true) {
			System.out.println("1.추가  2.리스트  3.한건조회  4.수정  5.삭제  6.이름조회  9.종료");
			System.out.print("선택 >> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 학생정보 추가입력. : 학생번호, 이름, 영어점수, 국어점수 입력하세용
				System.out.println("학생번호입력>>");
				int StuNo = scn.nextInt();
				System.out.println("학생이름입력>>");
				String name = scn.next();
				System.out.println("영어점수입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어점수입력>>");
				int korScore = scn.nextInt();
				Student s1 = new Student(StuNo, name, engScore, korScore);
				service.insertStudent(s1);

			} else if (menu == 2) {
				List<Student> list = service.Studentlist();
				System.out.println("===================학생리스트=======================");
				for (Student s : list) {
					System.out.println(s.toString());
				}
				System.out.println("==================================================");

			} else if (menu == 3) { // 한건 조회
				System.out.println("조회할 학생번호 입력>>");
				int studNo = scn.nextInt();
				Student student = service.getStudent(studNo);
				if (student == null) {
					System.out.println("조회된 결과가 없습니다.");
				} else {
					System.out.println(student.toString());
				}
			} else if (menu == 4) {
				System.out.println("수정할 학생번호입력>>");
				int StuNo = scn.nextInt();
				System.out.println("영어점수입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어점수입력>>");
				int korScore = scn.nextInt();

				Student s1 = new Student(StuNo, null, engScore, korScore);
				service.modifyStudent(s1);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) {
				System.out.println("삭제할 학생번호입력>>");
				int StuNo = scn.nextInt();
				service.deleteStudent(StuNo);
				System.out.println("삭제가 완료되었습니다.");

			} else if (menu == 6) {
				System.out.println("조회할 학생이름 입력>>");
				String name = scn.next();
				List<Student> list = service.searchStudent(name);
				System.out.println("===================학생리스트=======================");
				for (Student s : list) {
					System.out.println(s.toString());
				}
				System.out.println("==================================================");


			} else if (menu == 9) {
				System.out.println("프로그램을 종s료합니다");
				service.saveTofile();
				break;
			}

		} // end of while
		System.out.println("end of program");

	}
}
