package com.edu;

public class Friend extends Person {
// 이름, 나이, 키 , 몸무게 > 회사 : 회사이름, 회사업무
//					  > 학교 : 학교이름, 전공
	private String phone;

 public Friend() {

 }	 // super(); 펄슨의 기본생성자 호출	
	public Friend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight); // 부모의 기본생성자.
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//overriding => 부모클래스의 메소드 - 자식클래스가 새롭게 정의.
	@Override //annotation
	public String toString() {
		String str= "친구의 이름은 " + super.getName() + "이고, \n";
		str += "나이는 " + super.getAge() + "살이고, \n";
		str += "연락처는 " + this.getPhone() + "입니다. \n";
		return str;
	}	
	

	
	
}
