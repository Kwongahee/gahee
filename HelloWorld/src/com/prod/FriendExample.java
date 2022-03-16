package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		// 친구의 정보(이름, 전화번호, 이메일, 키, 몸무게)

		Friend f1 = new Friend();
		f1.friendName = "권가희";
		f1.friendPhone = " 010-1212-1212";
		f1.email = "kgh@naver.com";
		f1.height = 167.5;
		f1.weight = 55.7;

		Friend f2 = new Friend();
		f2.friendName = "이유빈";
		f2.friendPhone = " 010 -5553-3555";
		f2.email = "lyb@gmail.com";
		f2.height = 156.5;
		f2.weight = 45.7;

		Friend f3 = new Friend();
		f3.friendName = "나현주";
		f3.friendPhone = " 010 -5525 -2555";
		f3.email = "nhj@gmail.com";
		f3.height = 176.5;
		f3.weight = 65.7; // 변수 바꾸는거 까먹지 말기

		System.out.println(f1);

		Friend[] friends = { f1, f2, f3 };

		for (int i = 0; i < friends.length; i++) {
			if(friends[i].height <170) {  //170 이하 친구만 보이게 됨.
			System.out.println("이름 : " + friends[i].friendName);
			System.out.println("전화번호 : " + friends[i].friendPhone);
			System.out.println("키 : " + friends[i].height);
			System.out.println("=================================");
			}
		}

	}
}
