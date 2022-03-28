package com.edu.collect;

import java.io.*;
import java.util.*;

public class StudentServiceFile implements StudentService { // 여기는 저장소다!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// StudentServiceImpl(중첩클래스의 기능대체)
	// 입력, 수정, 삭제 > 파일에 저장이 되도록.. 프로그램을 종료하고 다시 시작하더라도 데이터가 남아있을수 있도록

	// 필드.(먼저 제시(?))
	List<Student> list = new ArrayList<Student>();
	File file;

	// 생성자
	// 기본생성자에 파일에 저장되어 있는 파일을 읽어서 list 값을 담아준다.
	public StudentServiceFile() {
		try {
			FileReader fr = new FileReader("studentList.data");
			BufferedReader br = new BufferedReader(fr);
			String readBuffer = null;
			while ((readBuffer = br.readLine()) != null) {
				String[] contents = readBuffer.split(","); // 읽어온 값을 ","로 구분하겠다. ex) 101,홍길동,80,90
//				contents[0] <= 101, contents[1] <=홍길동, contents[2] <=80... 
				list.add(new Student(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3])));

			} // 한 라인 전체를 읽겠다.
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 메소드
	@Override
	public void insertStudent(Student student) {
		list.add(student);

	}

	@Override
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNumber() == sno)
				;
		}
		return null;
	}

	@Override
	public List<Student> Studentlist() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStuNumber() == student.getStuNumber()) {
				list.get(i).setEngScore(student.getEngScore()); // 영어점수를 수정
				list.get(i).setKorScore(student.getKorScore()); // 국어점수를 수정
			}
		}

	}

	@Override
	public void deleteStudent(int sno) {
		// TODO Auto-generated method stub

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
		// 작성했던 ArrayList<Student> list > 파일저장.
		try {
			FileWriter fw = new FileWriter("studentList.data"); // 쓰는 용도로 읽어들이기
			BufferedWriter bw = new BufferedWriter(fw); // 보조스트림의 생성자의 매개값으로 기본값 설정(?)

			for (Student stud : list) {
				bw.write(stud.getStuNumber() + "," + stud.getName() + "," + stud.getEngScore() + ","
						+ stud.getKorScore() + "\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
