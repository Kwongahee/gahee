package co.dev.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//모든 컨트롤 요청하는 작업
public class FrontController extends HttpServlet {
	HashMap<String, Control> list = null;
	String charset = null;
	@Override
	//웹페이지 이동작업
	public void init(ServletConfig config) throws ServletException {
		charset = config.getInitParameter("charset");
		list = new HashMap<String, Control>();
		list.put("/memberInsert.do", new MemberInsertControl()); //여기서 처리 할 작업 인터페이스 선언! 
		list.put("/memberUpdate.do", new MemberUpdateControl());
		list.put("/memberList.do", new MemberListControl());
		list.put("/memberSearch.do", new MemberSearchControl());
		list.put("/memberDelete.do", new MemberDeleteControl());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding(charset);
		String url = req.getRequestURI(); // /P20220503/memberInsert.do (최종적으로 읽어오고싶은것)
		//주소표시줄에 있는 값을 가지고 컨트롤 ? 정하기 위해.
		String context = req.getContextPath();  //변하는 값 아님 ! 정해져있는 값
		String path = url.substring(context.length()); //path라는 정보에는 memberinsert or memberupdate의 마지막부분 가져온다?
	
		Control exeCon = list.get(path);
		exeCon.execute(req, resp);
	}

}


