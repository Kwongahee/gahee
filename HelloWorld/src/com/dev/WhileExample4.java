package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1:입금, 2:출금, 3:종료
		// 입금일 경우: 입금액을 입력하세요.. account 값을 누적.
		// 출금일 경우: 출금액을 입력하세요.. account 값을 차감.
		// 종료일 경우: 프로그램 종료
		// 구문 정렬 잘하기.

		Scanner scn = new Scanner(System.in);
		int account = 0;
		while (true) {
			System.out.println(" 1.입금 2.출금 3.종료 ");
			int menu = scn.nextInt();
			if (menu == 1) { // 입금일경우
				System.out.println("입금액을 입력하세요");
				int inputVal = scn.nextInt();
				account += inputVal;
				System.out.println("잔액은 " + account + "원 입니다.");

			} else if (menu == 2) { // 출금일 경우
				System.out.println("출금액을 입력하세요");
				int inputVal = scn.nextInt();
				if (account < inputVal) { // 잔액부족이라 출금이 불가능 할 경우
					System.out.println("잔액부족");
					System.out.println("잔액은" + account + "원 입니다.");
					continue; // 구문 아래를 무시 다음순번으로 넘어감
				}
				account -= inputVal;
				System.out.println("잔액은 " + account + "원 입니다.");

//				else {  continue 구문쓰면 굳이 else 안써도 넘어감
//				account -= inputVal;
//				System.out.println("잔액은 " + account + "원 입니다.");
//				}

			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
}
