package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestServlet.do")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RequestServlet() {
        super();
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() call.");
	}

    //서블릿 호출하기전 웹 컨테이너가 객체 생성.. 주소값을 매개로 받음 > request가 요청정보를 처리
	//response > 응답정보. 
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("service() call.");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
	
		PrintWriter out =  response.getWriter(); // 출력스트림 생성
		out.print("<h3> 홍길동 </h3>");  //응답정보에 홍길동 값
		out.print("<h3>네트워크정보</h3>");
		out.print("Request Scheme : " + request.getScheme() + "<br>");
		out.print("Server Name : " + request.getServerName() + "<br>");
		out.print("Server Adeeress : " +  request.getLocalAddr() + "<br>");
		out.print("Client Address : " + request.getRemoteAddr() + "<br>");
		out.print("Client Port : " + request.getRemotePort() + "<br>");
		//페이지 새로고침 > service 호출
		//init은 최초요청일때 한번 호출
		
		out.print("<h3>요청 프로토콜</h3>");
		out.print("Request URI : " + request.getRequestURI() + "<br>");
		out.print("Request URL : " + request.getRequestURL() + "<br>");
		out.print("Request path : " + request.getContextPath() + "<br>");
		out.print("Request protocol : " + request.getProtocol() + "<br>");
		out.print("Server Path : " + request.getServletPath() + "<br>"); //요청한페이지
		
		out.print("queryString : " + request.getQueryString() + "<br>"); //넘어온 파라메터 정보
		//파라메터 중요 ! 
		out.print("id : " + request.getParameter("id") + "<br>");
		out.print("passwd : " + request.getParameter("passwd") + "<br>");
		out.print("name : " + request.getParameter("username") + "<br>");
		out.close(); //이런 정보들이 request에 포함되어져서 옴

	}

}
