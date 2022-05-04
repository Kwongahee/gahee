package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberUpdateControl implements Control {

	// throws > 예외처리..
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 넘어오는 파라미터.

		System.out.println("수정처리하는 컨트롤입니다.");
		String id = request.getParameter("id");
		String nm = request.getParameter("name");
		String em = request.getParameter("email");
		String ps = request.getParameter("passwd");

		// 하나라도 없으면 체크.. 에러 > 페이지이동
		if (id.isEmpty() || nm.isBlank() || ps.isBlank() || em.isBlank()) {
			request.setAttribute("error", "모든 항목을 입력하세요 ! ");
			request.getRequestDispatcher("memberView/memberUpdate").forward(request, response);
			return;
		}

		// vo에 값을 담기위해 .. 에러 x > 정상적으로 실행
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPasswd(ps);
		member.setName(nm);
		member.setEmail(em);

		MemberService service = new MemberService();
		service.updateMember(member);

		request.setAttribute("id", id);

		// 처리된 결과는 이쪽으로 넘긴다
		request.getRequestDispatcher("memberResult/memberUpdateOutput.jsp").forward(request, response);

	}

}
