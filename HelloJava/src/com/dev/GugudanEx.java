package com.dev;

public class GugudanEx {

	public static void main(String[] args) {
//		for(int i =1; i <=5; i++) {
//		printStar(i, "★"); // ★ ○ 도형 넣으면 출력
//		System.out.println();
//		} >>별

//		gugudan(5); >>구구단
//		System.out.println(divide(10,4));

		int result = sum(sum(10, 20), sum(5, 7));
		System.out.println("결과는 " + result);

		int[] newAry = { 10, 20, 30 };
		result = sum(newAry);
		System.out.println("결과는 " + result);

	}

	public static int sum(int[] ary) {
		// 배열매개변수의 각 요소의 합을 구하는 메소드
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	// 나누기 메소드 (int, int) 반환되는 타입 더블.. 0을 나누면 0

	public static double divide(int n3, int n4) {
		if (n4 == 0) {
			return 0;
		}
		return n3 / (double) n4;
	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void gugudan(int dan) {
		System.out.println("[" + dan + "단]");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d * %2d =%2d\n", dan, i, (i * dan));
		}
		System.out.println();
	}

	public static void printStar(int runCnt, String shape) {
		for (int i = 0; i < runCnt; i++) {
			System.out.print(shape);
		}
	}

///////////////////////////////////////////////////////////
// static 실행 할 준비 완료.
// 메소드 실행하려면 new 클래스이름(); ex) Student s1 = new Student();
 //Student.callStatic();
	public static void printGugudan() {
		for (int j = 2; j <= 5; j++) {
			int cnt = j;
			System.out.println("[" + cnt + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(cnt + " * " + i + "= " + (i * cnt));

			}

		}

		for (int i = 2; i <= 9; i++) {
			System.out.print("  [ " + i + "단 ]  ");
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print("  " + j + "*" + i + "= " + j * i + "  ");
			}
			System.out.println("");
		} 

	} // end of printGugudan

}