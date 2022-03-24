package com.test;
//책제목, 저자, 출판사, 금액
public class Book {
	private String bookName;
	private String bookWrite;
	private String bookcom;
	private int bookPrice;
	
	public Book(String bookName, String bookWrite, String bookcom, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookWrite = bookWrite;
		this.bookcom = bookcom;
		this.bookPrice = bookPrice;
	}
//
//	public String getBookName() {
//		return bookName;
//	}
//
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//
//	public String getBookWrite() {
//		return bookWrite;
//	}
//
//	public void setBookWrite(String bookWrite) {
//		this.bookWrite = bookWrite;
//	}
//
//	public String getBookcom() {
//		return bookcom;
//	}
//
//	public void setBookcom(String bookcom) {
//		this.bookcom = bookcom;
//	}
//
//	public int getBookPrice() {
//		return bookPrice;
//	}
//
//	public void setBookPrice(int bookPrice) {
//		this.bookPrice = bookPrice;
//	}
//
//	
//	public String showinfo() {
//		String result = " 책정보 [책 제목] : " + this.bookName + "[책 저자]: " + this.bookWrite + "[출판사]: "
// + this.bookcom + "[가격] : " + this.bookPrice;
//		return result;
//		}
		
	
	//교수님이 하신거
	public void showInfo2() {
	System.out.printf("책정보 [제목: %5s 저자: %2s 출판사: %3s 가격: %2d]\n", bookName, bookWrite, bookcom, bookPrice);
	}  //겟셋메소드 없어도됨
		
		

	
}
