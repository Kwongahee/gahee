package com.prod;

import java.util.List;

public interface BookService {
	
	public boolean login(String id, String pwd); //관리자로그인
	
	public void  insertBook(Books book); //책등록
	
	public void updateBook(Books book); //책수정
	
	public void deleteBook(int bookid); //책삭제
	
	public List<Books> bookList(); //책목록
	
	public List<User> UserList(); //회원조회
	
	public User loginuser(String userid, String userwd); //회원로그인
	
	public void insertUser(User users); //회원가입
	
	public void borrowBook(Books brw); //대출
	
	
}
