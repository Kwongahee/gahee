package com.edu.interfaces;

public class MainExe {
	public static void main(String[] args) {
		//리모콘 > TV, Radio, 냉장고.. on/off하고싶 /.. 기능통일!
		RemoteControl rm = new TV();
		rm.powerOn();
		rm.powerOff(); //티비기능 가지게 됨.
		
		rm = new Radio();
		rm.powerOn();
		rm.powerOff(); //호출하는 규칙 파워온오프로 통일
		
		rm = new Refrigerator();
		rm.powerOn();
		rm.powerOff();
	}
}
