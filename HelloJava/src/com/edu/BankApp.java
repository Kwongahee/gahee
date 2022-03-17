package com.edu;

import java.util.Scanner;

public class BankApp {
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			printMenu();
			int menu = scn.nextInt();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				findAccountMoney();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 9) {
				showList();
			}
		}
	}

	// 메뉴출력 기능.
	public static void printMenu() {
		String menu = "============================\r\n" + "1. 계좌생성 (번호, 예금주, 예금액)\r\n"
				+ "2. 예금(번호, 예금액) 최고 예금액: 100,000원\n" + "3. 출금(번호, 출금액)\r\n" + "4. 잔액조회 (계좌번호입력)\r\n" + "5. 종료 \r\n"
				+ "============================\r\n" + "선택> ";
		System.out.println(menu);
	}

	// 계좌생성 메소드
	public static void createAccount() {
		System.out.println("계좌 생성");
		System.out.print("계좌번호입력 >> ");
		String accNo = scn.next();
		System.out.print("예금주입력 >> ");
		String accName = scn.next();
		System.out.print("예금액입력 >> ");
		int accMoney = scn.nextInt();

		Account accnt = new Account(accNo, accName, accMoney);
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
		System.out.println("계좌가 정상적으로 생성되었습니다.");
	}

	// 예금 메소드
	public static void deposit() {
		System.out.println("예금");
		System.out.print("계좌번호>> ");
		String ano = scn.next();
		System.out.print("예금액 입력 >> ");
		int amt = scn.nextInt();

		int checkCnt = 0;
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(ano)) {
				checkCnt = 1;

				int currAmt = banks[i].getMoney();
				if (currAmt + amt > 100000) {
					checkCnt = 2;
					System.out.println("한도액을 초과했습니다");
					break;
				}
				banks[i].setMoney(currAmt + amt);
				break;
			}
		}

		if (checkCnt == 1) {
			System.out.println("정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("한도액을 초과했습니다.");
		} else {
			System.out.println("계좌번호가 없습니다.");
		}

	}

	// 출금메소드
	public static void withdraw() {
		System.out.println("출금");
		System.out.print("계좌번호>> ");
		String ano = scn.next();
		System.out.print("출금액 입력 >>");
		int amt = scn.nextInt();

		int checkCnt = 0;
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(ano)) {
				checkCnt = 1;
				int currAmt = banks[i].getMoney();
				if (currAmt + amt < 0) {
					checkCnt = 2;
					System.out.println("한도액을 초과했습니다.");
					break;
				}
				banks[i].setMoney(currAmt + amt);
				break;
			}
		}
		if (checkCnt == 1) {
			System.out.println("정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("한도액을 초과했습니다.");
		}

	}
	
	// 잔액조회 메소드.
	public static void findAccountMoney() {
		System.out.println("잔액조회기능");
	}

	
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}	
	
	
}
