package com.prod;

public class Car {
	// 모델, 현재 속도, 최고속도, 가속(), 감속(), 현재속도() 괄호는 메소드
	private String model;
	private int speed;
	private int maxSpeed;
	
	
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void addSpeed() {
		if(this.speed + 10 > this.maxSpeed) {
			System.out.println("최고 속도를 초과 할 수 없습니다.");
			return;
		}
		System.out.println("10km 가속합니다.");
		this.speed +=10;
	} //가속 메소드
	
	public void breakSpeed() {
		System.out.println("10km 감속합니다.");
		this.speed -=10;
	} //감속 메소드

	public int getSpeed() {
		return this.speed;
	} //현재 속도
}
