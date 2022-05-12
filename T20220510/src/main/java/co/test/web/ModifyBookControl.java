package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String code = request.getParameter("bookCode");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String press = request.getParameter("press");
		int price = Integer.parseInt(request.getParameter("price"));
		
		if(code.isEmpty()||  title.isBlank() || author.isBlank() || press.isBlank()) {
			request.setAttribute("error", "항목을 입력하세요 !");
			request.getRequestDispatcher("view/modify").forward(request, response);
			return;
		};
			
		BookVO book = new BookVO();
		book.setBookCode(code);
		book.setBookTitle(title);
		book.setBookAuthor(author);
		book.setBookPress(press);
		book.setBookPrice(price);
		
		BookService service = new BookService();
		service.modifyBook(book);
		
		request.setAttribute("book", book);
		
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
	}

}
