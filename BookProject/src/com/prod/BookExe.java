package com.prod;

import java.util.List;
import java.util.Scanner;

public class BookExe { // 관리자
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BookDAO dao = new BookDAO();

		// 메뉴: 1.도서등록 2.도서정보수정 3.도서삭제 4.도서목록
		while (true) {
			System.out.println("* * * * * * * * * * *도서관리시스템* * * * * * * * * * * *");
//			System.out.println("관리자 로그인을 해주세요.");
//			System.out.println("아이디 >> ");
//			String id = scn.next();
//			System.out.println("비밀번호 >> ");
//			String pwd = scn.next();

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

				Books book = new Books(Number, title, writer, company);
				book.setBooknumber(Number);
				book.setTitle(title);
				book.setWriter(writer);

				dao.insertBook(book);

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
				
				Books book = new Books(Number, title, writer, company);
				dao.updateBook(book);
				
			} else if (menu == 3) {
				System.out.println("======도서삭제=======");
				System.out.println("삭제할 도서번호를 입력하세요.");
				int Number = scn.nextInt();
				dao.deleteBook(Number);
				
			} else if (menu == 4) {
				List<Books> list = dao.bookList();
				
				for(Books book : list) {
					System.out.println(book.toString());
				}

			} else if (menu == 5) {

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end of while
		System.out.println("end of program");
		scn.close();

	} // end of main
}
