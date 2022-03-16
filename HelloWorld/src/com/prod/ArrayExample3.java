package com.prod;

public class ArrayExample3 {
	public static void main(String[] args) {
		String[] names = new String[5]; // 문자열만 담아라.
		names[0] = "홍길동";
		names[1] = "234";
		names[2] = "권가희";
		names[3] = "";

		names[1] = "이삼사";
		names[4] = "권나희";
		names[0] = null;

		String searchName = "권가희";

		for (int i = 0; i < 5; i++) {
//			if (names[i] != null) {
//				System.out.println("이름: " + names[i]);
//			}// != 두 값이 다르면 true

			if (names[i] != null && names[i].equals(searchName)) {
				System.out.println(i + 1 + " 번째 위치에 있습니다.");
			}
		}
	}
}
