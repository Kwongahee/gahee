                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     package com.edu.collect;

public class Student {
	// ????????????(1,2,3), ??????(?????????), ??????(80), ??????(70)
	
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
		return "???????????? [ ???????????? : " + StuNumber + ", ?????? : " + Name + ", ???????????? : " + EngScore + ", ???????????? : "
				+ KorScore + "]";
	}


	//toString() => ?????????.
	
	
}
