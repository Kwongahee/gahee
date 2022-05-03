package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		System.out.println("입력처리하는 컨트롤입니다.");
		String id = request.getParameter("id");
		String ps = request.getParameter("passwd");
		String nm = request.getParameter("name");
		String em = request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setName(nm);
		vo.setEmail(em);
		vo.setPasswd(ps);

		MemberService service = new MemberService();
		service.memberInsert(vo);
		
		request.setAttribute("id", id); //id값을 담는다!
		request.setAttribute("name", nm);
		
		//Dispatcher 객체 기능 > forward 기능있음.
		request.getRequestDispatcher("memberResult/memberInsertOutput.jsp").forward(request, response);
		//여기로 이동하겠습니다아아(요청정보의 값 그대로 들고감)
	
	}

}
