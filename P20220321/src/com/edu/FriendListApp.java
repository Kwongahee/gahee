package com.edu;

public class FriendListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];

		Friend f1 = new Friend();
		f1.setName("진휘용");
		f1.setAge(25);
		f1.setHeight(178.3);
		f1.setWeight(68.9);
		f1.setPhone("010-1234-5678");

		UnivFriend f2 = new UnivFriend("서현일", 29, 178.3, 69.2, "010-1111-2222");
		f2.setUniversity("대구대학교");
		f2.setMajor("컴퓨터공학과");

		ComFriend f3 = new ComFriend("최규완", 29, 179.3, 75.2, "010-1321-4322", "네이버", "지도App개발연구원");
		
		Friend f4 = new Friend();
		f4.setName("권가희");
		f4.setAge(25);
		f4.setHeight(180.3);
		f4.setWeight(60.9);
		f4.setPhone("010-1004-1004");

		UnivFriend f5 = new UnivFriend("콩콩이", 25, 160.3, 48.1, "010-5252-2222");
		f5.setUniversity("대구대학교");
		f5.setMajor("컴퓨터공학과");

		ComFriend f6 = new ComFriend("뿡뿡이", 25, 175.3, 68.2, "010-5821-4622", "네이버", "지도App개발연구원");
				

		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		friends[4] = f5;
		friends[5] = f6;
		


		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println(friends[i].toString());
		}
		
//학교친구만 출력,
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i] instanceof UnivFriend)
				System.out.println(friends[i].toString()); }
		//동일한 기능이지만 인스턴스종류에 다른 결과실행 > 다형성.
		
		Friend friend = (Friend) f2; // UnivFriend; getUniversity, getMajor
		friend = f1;
		UnivFriend uni = null; //(UnivFriend) friend;
		if (friend instanceof UnivFriend) { // friend변수값과 univfriend의 인스턴스가 같은지 체크하는 intanceof사용
			uni = (UnivFriend) friend;  // 인스턴스 같으면 강제로 형변환. Casting 해야함
			uni.getUniversity(); // 부모클래스의 참조변수 > 자식클래스의 참조변수에 할당이 가능하다. (원래 기능 다 살아남
		}
	}
}
