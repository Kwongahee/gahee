package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;

public class MemberDeleteControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("삭제처리를 하는 컨트롤입니다.");
		String id = request.getParameter("id");

		if (id.isEmpty()) {
			request.setAttribute("error", "아이디를 입력하세요");
			request.getRequestDispatcher("memberView/memberDelete").forward(request, response);
			return;
		}

		MemberService service = new MemberService();
		service.deleteMember(id);

		request.setAttribute("id", id);

		request.getRequestDispatcher("memberResult/memberDeleteOutput.jsp").forward(request, response);
	}

}
