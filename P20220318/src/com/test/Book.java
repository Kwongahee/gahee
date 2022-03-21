package com.test;

public class Book {
	String bookName;
	String bookWrite;
	String bookcom;
	int bookPrice;
	
	public Book(String bookName, String bookWrite, String bookcom, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookWrite = bookWrite;
		this.bookcom = bookcom;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWrite() {
		return bookWrite;
	}

	public void setBookWrite(String bookWrite) {
		this.bookWrite = bookWrite;
	}

	public String getBookcom() {
		return bookcom;
	}

	public void setBookcom(String bookcom) {
		this.bookcom = bookcom;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookinfo() {
		String result = "책 제목 : " + this.bookName + "책 저자: " + this.bookWrite + "출판사 : "
 + this.bookcom + "가격 : " + this.bookPrice;
		
		return result;
		}
	
}
