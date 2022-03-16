package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책 (책제목, 저자, 출판사, 가격)

		Book b1 = new Book();
		b1.bookName = "혼공자";
		b1.bookWrite = "신용권";
		b1.bookCom = "한빛미디어";
		b1.bookPrice = 24000;

		Book b2 = new Book();
		b2.bookName = "Power Java";
		b2.bookWrite = "천인국";
		b2.bookCom = "인피니티";
		b2.bookPrice = 35000;

		Book b3 = new Book();
		b3.bookName = "재밌는 Java";
		b3.bookWrite = "이호준";
		b3.bookCom = "인피니티";
		b3.bookPrice = 20000;

		Book[] books = { b1, b2, b3 };

		// 인피니트 출판사

//		for (int i = 0; i < books.length; i++) {
//			if (books[i].bookCom == "인피니티") {
//				System.out.println("제목 : " + books[i].bookName);
//				System.out.println("저자 : " + books[i].bookWrite);
//				System.out.println("가격 : " + books[i].bookPrice);
//				System.out.println("=================================");
//				}
//			}
		
		// 제목, 저자, 가격
//		for (int i = 0; i <books.length; i++) {
//			System.out.println("제목 : " + books[i].bookName);
//			System.out.println("저자 : " + books[i].bookWrite);
//			System.out.println("가격 : " + books[i].bookPrice);	
//			System.out.println("=================================");
//		}
//		
		// 저자: 신용권 > 혼공자
		
		for (int i = 0; i < books.length; i++) {
			if (books[i].bookWrite == "신용권") {
				System.out.println("제목 : " + books[i].bookName);
			}
		}

		
	}
}
