package com.edu.collect;

import java.util.List;

public interface StudentService {

	// 추상메소드를 구현한 기능 .. 기능에 대해 정의만 해놓음
	public void insertStudent(Student student); // 입력

	public Student getStudent(int sno); // 한건조회

	public List<Student> Studentlist(); // 전체목록

	public void modifyStudent(Student student); // 한건수정

	public void deleteStudent(int sno); // 한건삭제

	public List<Student> searchStudent(String name); // 이름 조회 //여러건 반환 ...ㅠ
	public void saveTofile();
}
