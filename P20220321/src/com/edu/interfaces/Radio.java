package com.edu.interfaces;

public class Radio implements RemoteControl {
	public void turnOn() {
		System.out.println("Radio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Raido를 끕니다.");
	}  //처음부터 turnon .. 등 작업 필요없음.

	//켜고 끄는 기능 인터페이스 규격(규칙)에 따라 만들어야한다.
	@Override
	public void powerOn() {
		System.out.println("Radio를 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Raido를 끕니다.");
		
	}
}
