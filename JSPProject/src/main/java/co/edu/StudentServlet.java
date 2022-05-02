package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//IOC : Introversion of control
public class StudentServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출.");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8"); // 태그들을 html 형식으로 변환
		
		String method = req.getMethod(); //요청 방식을 불러오는 것.. 
		PrintWriter out = resp.getWriter(); // 출력스트림 생성.
		out.print("<h3>Student Sample page.</h3>");


		if (method.equals("GET")) {
			out.print("<h3>get방식 호출</h3>");
			doGet(req, resp);
		} else if (method.equals("POST")) {
			out.print("<h3>post방식 호출</h3>");
		}

		out.print("<a href='../index.jsp?user_name=gahee&user_id=kwon'> index page</a>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출.");
	}
}
