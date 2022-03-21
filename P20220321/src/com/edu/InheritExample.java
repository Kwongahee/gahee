package com.edu;

public class InheritExample {
//학생, 직장인, 친구 > 연락처를 담아놓는 정보.
// 학생>학교정보,학년정보     직장인>직장명,직급     친구>출신지역 

	public static void main(String[] args) {
		Students student = new Students();
		student.setName("홍길동");
		student.setAge(15);
		student.setSchool("중앙고");
		student.setGrade(2);
		
		Worker worker = new Worker();
		worker.setName("직장인");
		worker.setAge(35);
		worker.setCompany("카카오");
		worker.setJob("개발팀장");
		
		//부모클래스의 참조변수에 자식클래스의 참조변수 자동형변환(promotion)
		Person p1=new Person();
		p1 = (Person) student;
		p1 = worker;
		
		//student = worker 자식끼리는 변환 안됨
		
	}
}
