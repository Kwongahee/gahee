package co.edu.full;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/FullCalendarServlect")
public class FullCalendarServlect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FullCalendarServlect() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 전체조회
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json; charset=utf-8");

		FullDAO dao = new FullDAO();
		List<FullVO> list = dao.getList();

		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list)); // json 타입 생성(응답정보 담기)
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 입력, 삭제
		request.setCharacterEncoding("utf-8");

		String job = request.getParameter("job");

		FullDAO dao = new FullDAO(); //dao 인스턴스 생성
		
		if (job.equals("insert")) {
			String title = request.getParameter("title");
			String start = request.getParameter("start");
			String end = request.getParameter("end");

			FullVO vo = new FullVO(title, start, end);
			dao.insertSchedule(vo);

		} else if (job.equals("delete")) {
			String title = request.getParameter("title");
			dao.deleteSchedule(title);
		}
	}

} //기능 다만들면 아작스 호출 만들기 !! (selectable.html)
