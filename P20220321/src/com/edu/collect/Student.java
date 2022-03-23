                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     package com.edu.collect;

public class Student {
	// 학생번호(1,2,3), 이름(홍길동), 영어(80), 국어(70)
	
	private int StuNumber;
	private String Name;
	private int EngScore;
	private int KorScore;

	public Student() {
		
	}
	
	public Student(int stuNumber, String name, int engScore, int korScore) {
		super();
		StuNumber = stuNumber;
		Name = name;
		EngScore = engScore;
		KorScore = korScore;
	}
	
	
	public int getStuNumber() {
		return StuNumber;
	}

	public void setStuNumber(int stuNumber) {
		StuNumber = stuNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getEngScore() {
		return EngScore;
	}

	public void setEngScore(int engScore) {
		EngScore = engScore;
	}

	public int getKorScore() {
		return KorScore;
	}

	public void setKorScore(int korScore) {
		KorScore = korScore;
	}

	@Override
	public String toString() {
		return "학생정보 [ 학생번호 : " + StuNumber + ", 이름 : " + Name + ", 영어점수 : " + EngScore + ", 국어점수 : "
				+ KorScore + "]";
	}


	//toString() => 재정의.
	
	
}
