package com.prod;

public class UserExample {
	public static void main(String[] args) {
		User u1 = new User();

		u1.setUserId(100);
		u1.setUserGrade("A");
		u1.setUserNo("010-1212-3232");
		u1.setUserPoint(1500);
		
		User u2 = new User();

		u2.setUserId(200);
		u2.setUserGrade("B");
		u2.setUserNo("010-1222-3292");
		u2.setUserPoint(800);		
		
		User u3 = new User();

		u3.setUserId(300);
		u3.setUserGrade("C");
		u3.setUserNo("010-9898-3232");
		u3.setUserPoint(500);
		
		User u4 = new User();

		u4.setUserId(400);
		u4.setUserGrade("A");
		u4.setUserNo("010-1342-3542");
		u4.setUserPoint(2300);
		
		System.out.println(u1.getEmpinfo());
		System.out.println(u2.getEmpinfo());
		System.out.println(u3.getEmpinfo());
		System.out.println(u4.getEmpinfo());
		
		System.out.println("========================================================================\n");
		System.out.println(" 등급이 A이며, 1000포인트 이상의 사용자 정보\n");
		User[] users = {u1, u2, u3, u4};
		
			 for (int i=0; i<users.length; i++) {
				 if(users[i].getUserPoint()>=1000 && users[i].getUserGrade()=="A") {
					 System.out.println(users[i].getEmpinfo());
				 }
			 }
		
	}
}
