package com.dev;
// BankApp(main method), Account(계좌정보,예금주,잔액)

import java.util.Scanner;

import com.dev.Account;

public class BankApp {
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

	// 메뉴: 1.계좌생성(번호, 예금주, 예금액)
	// 2.예금(번호, 예금액) > 최고예금액 : 100,000원
	// 3. 출금(번호, 출금액) > 잔액보다 큰 금액 출금하지 못하도록
	// 4. 잔액조회(계좌번호입력)
	// 5. 종료.

	public static void main(String[] args) {

		while (true) { // 반복문
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
				withdraw();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 9) {
				showList();
			}
		}
		System.out.println("=== End of Prog===");
	}

	// 메뉴출력 기능.
	public static void printMenu() {
		String menu = "========================================\r\n" + " 1. 계좌생성(번호, 예금주, 예금액)\r\n"
				+ " 2. 예금(번호, 예금액) > 최고예금액 : 100,000원\r\n" + " 3. 출금(번호, 출금액) > 잔액보다 큰 금액 출금하지 못하도록\r\n"
				+ " 4. 잔액조회(계좌번호입력)\r\n" + " 5. 송금 ( 송금번호, 금액, 입금번호) \r\n" // transferAmount()
				+ "=========================================\r\n" + " 6. 종료\r\n" + "선택> ";
		System.out.println(menu);
	}

	// 계좌생성 메소드.
	public static void createAccount() {
		System.out.println("계좌생성기능");
		// 계좌번호가 있으면 반복문, 없으면 종료
		String accNo;
		while (true) {
			System.out.print("계좌번호입력 >> ");
			accNo = scn.next();
			// 계좌번호가 있는지 체크.
			if (searchAccountNo(accNo) != null) {
				System.out.println("이미 존재하는 계좌번호입니다.");
				continue;
			}
			break;
		}

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

		Account findAccount = searchAccountNo(ano);
		if (findAccount != null)
			checkCnt = 1; // 계좌가 존재
		int currAmt = findAccount.getMoney();

		// 예금액이 10만원 넘지 않도록
		if (currAmt + amt > 100000) {
			checkCnt = 2;
		} else {
			findAccount.setMoney(currAmt + amt); // 잔액 + 입금액
		}

		if (checkCnt == 1) {
			System.out.println("정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("한도액을 초과했습니다.");
		} else {
			System.out.println("계좌번호가 없습니다.");
		}

	}

//	for (int i = 0; i < banks.length; i++) {
//	if (banks[i] != null && banks[i].getAccNo().equals(ano)) { // 계좌번호가 있을 경우
////		계좌번호가 조회됐을때
//		checkCnt = 1;
//
//		int currAmt = banks[i].getMoney();
//		if (currAmt + amt > 100000) {
////			예금액이 10만원을 초과하지 못하도록
//			checkCnt = 2;
//			System.out.println("한도액을 초과했습니다");
//			break;
//		}
//		banks[i].setMoney(currAmt + amt); // 잔액 + 입금액.
//		break;
////	}
//}

	// 출금 메소드.
	public static void withdraw() {
		System.out.println("출금");
		System.out.print("계좌번호>> ");
		String ano = scn.next();
		System.out.print("출금액 입력 >>");
		int amt = scn.nextInt();

		int checkCnt = 0;

		Account findAccount = searchAccountNo(ano);
		if (findAccount != null)
			checkCnt = 1; // 계좌가 존재
		int currAmt = findAccount.getMoney();

		// 잔액초과
		if (currAmt < amt) {
			checkCnt = 2;
		} else {
			findAccount.setMoney(currAmt - amt); // 잔액 + 입금액
		}

		if (checkCnt == 1) {
			System.out.println("정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("잔액 초과했습니다.");
		} else {
			System.out.println("계좌번호가 없습니다.");
		}

	}

	// 잔액조회 메소드.
	public static void findAccountMoney() {
		System.out.println("잔액조회");
		System.out.print("계좌입력 >> ");
		String ano = scn.next();
		Account findAccount = searchAccountNo(ano);
		if (findAccount == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("잔액: " + findAccount.getMoney());
	}

	// 송금 메소드
	public static void transferAmount() {
		System.out.println("송금기능");
		System.out.println("송금계좌 입력");
		String outputNo = scn.next();
		System.out.println("금액");
		int amt = scn.nextInt();
		System.out.println("입금계좌 입력");
		String inputNo = scn.next();

		int checkCnt = 0;

		Account findAccount = searchAccountNo(outputNo);
		if (findAccount != null)
			checkCnt = 1;
		int currAmt = findAccount.getMoney();
		if (currAmt < amt) {
			checkCnt = 2;
		} else {
			findAccount.setMoney(currAmt - amt);
		}
		if (checkCnt == 1) {
			System.out.println("정상적으로 처리하였습니다.");
		} else if (checkCnt == 2) {
			System.out.println("송금을 보낼 금액이 부족합니다");
			return;
		} else {
			System.out.println("계좌번호가 없습니다.");
		}
		int checkCnt1 = 0;
		Account findAccount1 = searchAccountNo(inputNo);
		if (findAccount != null)
			checkCnt1 = 1;
		int currAmt1 = findAccount1.getMoney();
		findAccount1.setMoney(currAmt1 + amt);

		if (checkCnt1 == 1) {
			System.out.println("정상처리되었습니다.");
		} else {
			System.out.println("입금가능한 계좌가 없습니다");
		}
		return;
	}

//	public static void findAccountMoney() {
//		System.out.println("잔액조회기능");
//		System.out.print("계좌입력 >");
//		String ano = scn.next();
//
//		int checkCnt = 0;
//		for (int i = 0; i < banks.length; i++) {
//			if (banks[i] != null && banks[i].getAccNo().equals(ano)) {
//				System.out.println(banks[i].toString());
//
//			}
//		}
//	}

	// 전체리스트 출력.
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}

	// 계좌번호를 입력하면 배열(banks)에서 그 계좌번호를 반환 없으면 null
	// 배열 100개에서 35개 저장
	public static Account searchAccountNo(String accNo) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) { // null이 아닌 값을 기준으로 조회를 하십시오
				return banks[i]; // 있으면 찾은 계좌를 반환
			}
		}
		return null; // 100개 있는데도 값을 못찾았을 경우 이게 없으면 반환이 안됨..
		// 모든 클래스의 초기값은 null(Student, Car,
	}
}
