package com.edu;

public class DriverExample {
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		v1 = new Taxi();
		v1 = new Bus();

		Driver driver = new Driver(); // 인스턴스 선언
		driver.drive(v1); // 메소드.. 매개변수의 다형성 !

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus(); // 생성자 호출

		System.out.println("Vehicle의 최고 속력: " + vehicle.getMaxSpeed());
		System.out.println("Taxi의 최고 속력: " + taxi.getMaxSpeed());
		System.out.println("Bus의 최고 속력: " + bus.getMaxSpeed());
		
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0]=vehicle;
		vehicles[1]=taxi;
		vehicles[2]=bus;
		
		//속도가 제일 빠른 타는 것의 값부터 정렬해서 vehicle[0]=taxi. vehicles[1]=bus. vehicles[2]=vehicles
		
		int ve = vehicles.length -1;
		Vehicle temp=vehicles[0];
		for(int i=0; i<ve; i++) {
			for (int j=0; j <ve; j++) {
				if (vehicles[j].getMaxSpeed() > vehicles[j+1].getMaxSpeed()) {
					temp = vehicles[j];
					vehicles[j] = vehicles[j+1];
					vehicles[j+1] = temp;
				}
			}
		} 
		for (int j=0; j<vehicles.length; j++)
		System.out.println("속도는 " + vehicles[j].getMaxSpeed() + "입니다");
		
		
		System.out.println("제일 빠른 것 : " + vehicles[2].toString());
		System.out.println("제일 느린 것 : " + vehicles[0].toString());

		
		
	}
}