package com.dev;

public class AccExample {
	public static void main(String[] args) {
		Account[] accounts;
		
		accounts = new Account[] { new Account("212", "kwon")
				,new Account("243", "dfn")
			, new Account("254", "kwfdsdfn")
		};		
		
//		Account a1 = new Account(); //실체(인스턴스)를 생성.. 인스턴스를 반드시 만들어야함.
		System.out.println(Account.bankName); // 인스턴스 생성안해도 값 가지고 있음. 정적필드(정적메소드)
		Account.showBankName(); 
	
		// 쉐어하우스..주방, 거실 vs 방,방 (주방과 거실은 스테이틱(공용공간). 방은 인스턴스를 만들어서 각각 다른 값
		Calcurator.sum(10, 20); //스테이틱 메소드.. 클래스에서 공용으로 사용할 값은 클래스 사용
		
		Calcurator c1 =new Calcurator();
		c1.sum(10, 20);
		
		Calcurator.getArea(10);
		
		//static 활용. 
		
	}
}
