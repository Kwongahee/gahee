package com.prod;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
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
			System.out.println("비밀번호(숫자) >> ");
			int pwd = scn.nextInt();
			dao.login(id, pwd);

			while (true) {
				System.out.println("1.도서등록  2.도서정보수정  3.도서삭제  4.도서목록  5.대출반납관리  9.종료");
				System.out.println("메뉴를 선택해주세요");

				int menu = scn.nextInt();
				if (menu == 1) {
					System.out.println("=====도서등록=====");
					// 도서번호, 책제목, 지은이, 출판사
					System.out.println("도서번호를 입력하세요.");
					int Number = scn.nextInt();
					System.out.println("책제목을 입력하세요.");
					String title = scn.next();
					System.out.println("지은이를 입력하세요.");
					String writer = scn.next();
					System.out.println("출판사를 입력하세요.");
					String company = scn.next();

					Books book1 = new Books(Number, title, writer, company);
					book1.setBooknumber(Number);
					book1.setTitle(title);
					book1.setWriter(writer);

					dao.insertBook(book1);

					System.out.println("등록완료");

				} else if (menu == 2) {
					System.out.println("=====도서수정=====");
					System.out.println("도서번호를 입력하세요.");
					int Number = scn.nextInt();
					System.out.println("수정하실 제목을 입력하세요.");
					String title = scn.next();
					System.out.println("수정하실 지은이를 입력하세요.");
					String writer = scn.next();
					System.out.println("수정하실 출판사를 입력하세요.");
					String company = scn.next();

					Books book1 = new Books(Number, title, writer, company);
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

				} else if (menu == 9) {
					System.out.println("프로그램을 종료합니다.");
					break;

				}
			} // while문 종료
		} else if (mode == 2)
			System.out.println("1.로그인 2.회원가입");

		int menu = scn.nextInt();
		if (menu == 1) {
			System.out.println("======로그인=======");
			System.out.println("아이디를 입력해주세요");
			String userid = scn.next();
			System.out.println("비밀번호를 입력해주세요");
			int userpwd = scn.nextInt();

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
				} else if (menu == 2) {
					System.out.println("=============대출=============");
					
					

				} else if (menu == 3) {
					System.out.println("=============반납=============");
				} else if (menu == 4) {
					System.out.println("=============종료=============");
					break;
				}
			}

		} else if (menu == 2) {
			System.out.println("====== 회원가입 ======");
			System.out.println("사용하고자하는 아이디를 입력해주세요.");
			String id = scn.next();
			System.out.println("사용하고자하는 비밀번호(숫자)를 입력해주세요.");
			int pwd = scn.nextInt();
			System.out.println("이름을 입력해주세요.");
			String name = scn.next();

			User users = new User();
			users.setUserid(id);
			users.setPasswd(pwd);
			users.setName(name);

			dao.insertUser(users);

		}

		System.out.println("end of program");
		scn.close();
	}

}
