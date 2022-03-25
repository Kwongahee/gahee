package com.edu.collect;

import java.io.*;
import java.util.*;

public class StudentServiceFile implements StudentService { // 여기는 저장소다!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	List<Student> list = new ArrayList<Student>();
	File file;

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
		return null;
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
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw);

			for (Student stud : list) {
				bw.write(stud.getStuNumber() + "," + stud.getName() + "," + stud.getEngScore() + ","
						+ stud.getKorScore());
			}
			bw.close();
			fw.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
