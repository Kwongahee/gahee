package com.prod;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookExe { // 관리자
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BookDAO dao = new BookDAO();

		Map<String, String> map = new Hashtable<String, String>();

		map.put("admin", "1234");

		// 메뉴: 1.도서등록 2.도서정보수정 3.도서삭제 4.도서목록

		System.out.println("* * * * * * * * * * *도서관리시스템* * * * * * * * * * * *");
		System.out.println("관리자 로그인을 해주세요.");
		System.out.println("아이디 >> ");
		String id = scn.next();
		System.out.println("비밀번호 >> ");
		String pwd = scn.next();
		
			if (map.containsKey(id)) {
				if (map.get(id).equals(pwd)) {
					System.out.println("로그인 성공 !!");
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
					}
				} // while문 종료
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("end of program");
					scn.close();
				} // if문 종료

			} // 아이디 while문 종료
			else {
				System.out.println("아이디가 존재하지 않습니다.");
				
			}
		}
	}

