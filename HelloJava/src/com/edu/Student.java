package com.edu;

public class Student {
	// 학생번호, 학생이름, 국어점수, 수학점수, 영어점수 <=필드로 정리
	private int studNo;
	private String studName;
	private int korScore = -1;
	private int mathScore = -1;
	private int engScore = -1; // 내부요소 > 필드

	// 생성자 : 필드의 값을 초기화 ..
	public Student() { // student 라는 메소드를 정의하는구나.
		this.studNo = 1;
		this.studName = "Nobody";
		this.korScore = 0;
		this.engScore = 0;
	}

	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		super();
		this.studNo = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	// 또다른 생성자 선언 가능
	public Student(int studNo) { // int 타입에 학번을 넣는 매개변수를 가지게 된다.
		this.studNo = studNo;
	}

	public Student(int studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName;
	}
	// 기능은 원하는 만큼 정의가능 !
	//a 메소드.. --구구단 ex--

	public static void callStatic() {
		System.out.println("정정메소드 실행");
	}
		
	
	// 영어,국어,수학 == 값이 저장되면 평균...

	public double getAvgScore() {
		return getSumScore() / 3.0; // return this.getSumScore() / 3.0
	} // 밑에 기능이 만들어졌으면 그냥 쓰면 됨.

	// 영어, 국어, 수학 ==> 합계점수..

	public int getSumScore() {
		if (this.korScore != -1 && this.korScore != -1 && this.mathScore != -1) {
			return this.korScore + this.engScore + this.mathScore;
		}
		return -1;
	}

	// 기능(method) => 규칙 : 반환값 메소드명 매개변수 { }
	public void setStudNo(int studNo) { // 디폴트 접근 지시 (다른 패키지에서 호출 불가)
		this.studNo = studNo;
	}

	public int getStudNo() { // 학번만 리턴하니까 매개변수 필요없
		return this.studNo;
	}

	public String getStudName() { // 퍼블릭 접근 지시 (퍼블릭이면 다른패키지에서도 호출 가능)
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
// \n > 줄바꿈
	public String getStudInfo() {
		String str = "==================================";
		str += "\n 학생 이름은 " + this.getStudName() + "이고";
		str += "\n 학번은 "+ this.getStudNo() + "이고";
		str += "\n 평균은 " + String.format("%.2f", this.getAvgScore()) + "입니다.";
		str += "\n=====================================\n" ;			
		return str;
	}
}
