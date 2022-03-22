package com.edu.interfaces;

public interface Dao extends RemoteControl, Run {
	
	//인터페이스는 다중으로 상속가능.. 구현하는 객체에서 규칙을 따라서 만들어야합니다..>인터페이스 
	
	public void select(); 
	public void insert(); 
	public void update(); 
	public void delete(); //추상클래스
}
