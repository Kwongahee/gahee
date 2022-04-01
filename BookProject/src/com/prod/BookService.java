package com.prod;

import java.util.List;

public interface BookService {
	
	public boolean login(String id, int pwd); //관리자로그인
	
	public void  insertBook(Books book); //책등록
	
	public void updateBook(Books book);
	
	public void deleteBook(int bookid);
	
	public List<Books> bookList();
	
	public void insertUser(User users);
	
	
}
