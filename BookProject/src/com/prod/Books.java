package com.prod;

import java.util.InputMismatchException;

public class Books { //관리자 클래스
	private int booknumber;
	private String title;
	private String writer;
	private String comapany;
	private String id;
	private String pwd;
	private String stock;

	
//	if (check.getStock().equals("Y")) {
//		dao.borrowBook(brww);
//		System.out.println("대.출.성.공 @_@");
//
//		Books r = dao.searchone(brw);
//		System.out.println(r.toString());
//		System.out.println("~~~~~~~~ 즐독하세요 v^__^v ~~~~~~~~");
//
//	} else if (check.getStock().equals("N")) {
//		System.out.println("대출 불가-_-^");
//	}
//	Books brww = new Books(brw);
//	Books check = dao.check(brw);
//
//	if (check.getStock().equals("Y")) {
//		dao.borrowBook(brww);
//		System.out.println("대.출.성.공 @_@");
//
//		Books r = dao.searchone(brw);
//		System.out.println(r.toString());
//		System.out.println("~~~~~~~~ 즐독하세요 v^__^v ~~~~~~~~");
//
//	} else if (check.getStock().equals("N")) {
//		System.out.println("대출 불가-_-^");
//	}
//	
	
	
	public Books() {
		
	}
	
	

	public Books(int booknumber) {
		super();
		this.booknumber = booknumber;
	}




	

	public Books(String stock) {
		super();
		this.stock = stock;
	}



	public Books(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}






	public Books(int booknumber, String title, String writer, String comapany, String stock) {
		super();
		this.booknumber = booknumber;
		this.title = title;
		this.writer = writer;
		this.comapany = comapany;
		this.stock = stock;
	}



	public int getBooknumber() {
		return booknumber;
	}



	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public String getComapany() {
		return comapany;
	}



	public void setComapany(String comapany) {
		this.comapany = comapany;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String getStock() {
		return stock;
	}



	public void setStock(String stock) {
		this.stock = stock;
	}



	public Books(int booknumber, String title, String writer, String comapany, String id, String pwd, String stock) {
		super();
		this.booknumber = booknumber;
		this.title = title;
		this.writer = writer;
		this.comapany = comapany;
		this.id = id;
		this.pwd = pwd;
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "==================================도서 정보 =======================================\r\n"
				+ " [ 도서번호 : " + booknumber + "   도서제목 : " + title + "   지은이 : " + writer + "   출판사 : " + comapany
				+ "    대출가능여부 : " + stock + " ]";
	}
	

	
}
