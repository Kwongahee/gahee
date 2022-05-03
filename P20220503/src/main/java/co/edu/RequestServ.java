package co.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServ
 */
@WebServlet("/request1.do")
public class RequestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RequestServ() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String id = request.getParameter("id");
	String name = request.getParameter("name");
	request.setAttribute("id", id);
	request.setAttribute("name", name); //요청정보를 포워딩할때 매개값으로 씀

	StudentDAO dao = new StudentDAO();
	Student reuslt = dao.searchStudent(id);
	request.setAttribute("result", reuslt); //요청정보에 속성 추가 
	
	//response.jsp
	request.getRequestDispatcher("response.jsp").forward(request, response); //foward : 요청 정보의 값을 그대로 쓰겠다는 기능 !!
	// response.sendRedirect("response.jsp") 요청정보에 넣어준 값들을 읽어 올 수 없음
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
