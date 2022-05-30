package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class AddBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//db insert
		//addBook.do 에서 처리된값들 addOutput.jsp 로 공유
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String press = request.getParameter("press");
		int price = Integer.parseInt(request.getParameter("price"));
		
		BookVO vo = new BookVO();
		vo.setBookTitle(title);
		vo.setBookAuthor(author);
		vo.setBookPress(press);
		vo.setBookPrice(price);
		
		BookService service = new BookService();
		service.addBook(vo);
		
		// ""라는 이름으로 ~속성. 
//		request.setAttribute("hello", "홍길동");
		request.setAttribute("hello", title);
		request.getRequestDispatcher("result/addOutput.jsp").forward(request, response);


	}

}
