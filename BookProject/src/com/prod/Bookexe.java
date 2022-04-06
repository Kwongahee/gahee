package com.prod;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Bookexe {
	// 관리자

	public Bookexe() {

	}

	public void execute() {
		Scanner scn = new Scanner(System.in);
		BookDAO dao = new BookDAO();

//		Map<String, String> map = new Hashtable<String, String>();
//
//		map.put("admin", "1234");

// 메뉴: 1.도서등록 2.도서정보수정 3.도서삭제 4.도서목록

		System.out.println("* * * * * * * * * * *가희네 도서관* * * * * * * * * * * *");

		System.out.println("1.관리자모드   2.사용자모드");
		int mode = scn.nextInt();
		if (mode == 1) {
			System.out.println("관리자 로그인을 해주세요.");
			System.out.println("아이디 >> ");
			String id = scn.next();
			System.out.println("비밀번호 >> ");
			String pwd = scn.next();

			boolean login = dao.login(id, pwd);
			if (login) {
				while (true) {
					System.out.println("1.도서등록  2.도서정보수정  3.도서삭제  4.도서목록  5.회원목록  9.종료");
					System.out.println("메뉴를 선택해주세요");

					int menu = scn.nextInt();
					if (menu == 1) {
						System.out.println("=====도서등록=====");
						// 도서번호, 책제목, 지은이, 출판사
						System.out.println("도서번호를 입력하세요.");
						int Number = scn.nextInt();
						System.out.println("도서제목을 입력하세요.");
						String title = scn.nextLine();
						System.out.println("지은이를 입력하세요.");
						String writer = scn.nextLine();
						System.out.println("출판사를 입력하세요.");
						String company = scn.nextLine();
						System.out.println("해당 도서는 대출가능여부 (Y/N)");
						String stock = scn.next();

						Books book1 = new Books(Number, title, writer, company, stock);
						book1.setBooknumber(Number);
						book1.setTitle(title);
						book1.setWriter(writer);
						book1.setComapany(company);
						book1.setStock(stock);

						dao.insertBook(book1);

						System.out.println("등록완료");

					} else if (menu == 2) {
						System.out.println("=====도서수정=====");
						System.out.println("도서번호를 입력하세요.");
						int Number = scn.nextInt();

						System.out.println("수정하실 제목을 입력하세요.");
						String title = scn.nextLine();
						System.out.println("수정하실 지은이를 입력하세요.");
						String writer = scn.nextLine();
						System.out.println("수정하실 출판사를 입력하세요.");
						String company = scn.nextLine();
						System.out.println("수정하실 대출가능여부 (Y/N)");
						String stock = scn.next();

						Books book1 = new Books(Number, title, writer, company, stock);
						dao.updateBook(book1);

					} else if (menu == 3) {
						System.out.println("======도서삭제=======");
						System.out.println("삭제할 도서번호를 입력하세요.");
						int Number = scn.nextInt();
						dao.deleteBook(Number);

					} else if (menu == 4) {
						List<Books> list = dao.bookList();

						for (Books book1 : list) {
							System.out.println(book1.toString());
						}

					} else if (menu == 5) {
						List<User> list = dao.UserList();

						for (User us : list) {
							System.out.println(us.toString());
						}
					} else if (menu == 9) {
						System.out.println("프로그램을 종료합니다.");
						break;

					}
				}
				// while문 종료
			} else {
				System.out.println("다시 로그인해주세요 !");

			} // if/else 관리자 login

			// 사용자모드
		} else if (mode == 2)
			System.out.println("1.로그인 2.회원가입");

		int menuu = scn.nextInt();
		if (menuu == 1) {
			System.out.println("======로그인=======");
			System.out.println("아이디를 입력해주세요");
			String userid = scn.next();
			System.out.println("비밀번호를 입력해주세요");
			String userpwd = scn.next();

			User loginuser = dao.loginuser(userid, userpwd);

			if (loginuser != null) {
				while (true) {
					System.out.println(" * * * * * * 환영합니다 * * * * * * *");
					System.out.println("1.도서목록조회  2.대출  3.반납  4.종료  ");

					int menu2 = scn.nextInt();
					if (menu2 == 1) {
						System.out.println("===========도서목록============");
						List<Books> list = dao.bookList();

						for (Books book1 : list) {
							System.out.println(book1.toString());
						}
					} else if (menu2 == 2) {
						System.out.println("=============대출=============");
						System.out.println("대출하실 도서번호를 입력해주세요.");
						int brw = scn.nextInt();

						Books brww = new Books(brw);
						Books check = dao.check(brw);

						if (check.getStock().equals("Y")) {
							dao.borrowBook(brww);
							System.out.println("대.출.성.공 @_@");

							Books r = dao.searchone(brw);
							System.out.println(r.toString());
							System.out.println("~~~~~~~~ 즐독하세요 v^__^v ~~~~~~~~");

						} else if (check.getStock().equals("N")) {
							System.out.println("대출 불가-_-^");
						}

					} else if (menu2 == 3) {
						System.out.println("=============반납=============");
						System.out.println("반납하실 도서번호를 입력해주세요.");
						int rent = scn.nextInt();

						Books byeb = new Books(rent);
						Books check = dao.check(rent);

						if (check.getStock().equals("N")) {
							dao.returnBook(byeb);
							System.out.println("반.납.성.공 *^~^*");

							Books r = dao.searchone(rent);
							System.out.println(r.toString());

						} else if (check.getStock().equals("Y")) {
							System.out.println("반납 불가.. ");
						}

					} else if (menu2 == 4) {
						System.out.println("=============종료=============");
						System.out.println("시스템을 종료합니다.");
						break;

					}
				} // user login : end of while

			} else {
				System.out.println("로그인 실패 !\r\n" + "다시 로그인해주세요.");
			} // if/else login
		} else if (menuu == 2) {
			System.out.println("====== 회원가입 ======");
			System.out.println("사용하고자하는 아이디를 입력해주세요.");
			String id = scn.next();
			System.out.println("사용하고자하는 비밀번호(숫자)를 입력해주세요.");
			String pwd = scn.next();
			System.out.println("이름을 입력해주세요.");
			String name = scn.next();

			User users = new User();
			users.setUserid(id);
			users.setPasswd(pwd);
			users.setName(name);

			dao.insertUser(users);
			System.out.println("=========회원가입 성공======== \r\n " + " 로그인해주세요. ");

		}

	}
}
