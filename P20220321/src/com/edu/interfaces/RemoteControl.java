package com.edu.interfaces;

public interface RemoteControl {
//기능만 담고있. 생정자 불가. 필드 불가.

	// private String maxVolume;
	public static final int MAX_VOLUME = 10; //상수로 선언
	public static final int MIN_VOLUME = 0; //상수로 선언
	
	public void powerOn(); //구현하는 부분이 없는것. 추상메소드.
	public void powerOff();
	
}
