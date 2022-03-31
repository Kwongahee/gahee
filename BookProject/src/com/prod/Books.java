package com.prod;

public class Books { //관리자 클래스
	private int booknumber;
	private String title;
	private String writer;
	private String comapany;

	
	
	public Books() {
		
	}
	
	


	public Books(int booknumber, String title, String writer, String comapany) {
		super();
		this.booknumber = booknumber;
		this.title = title;
		this.writer = writer;
		this.comapany = comapany;
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



	@Override
	public String toString() {
		return "==================================도서 정보 =======================================\r\n"
				+ " [ 도서번호 : " + booknumber + " 도서제목 : " + title + " 지은이 : " + writer + " 출판사 : " + comapany
				+ "]";
	}
	
	
	
}