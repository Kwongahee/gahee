package co.edu.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.edu.full.FullVO;

@WebServlet("/todoServlet")
public class todoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public todoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 전체조회
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json; charset=utf-8");

		todoDAO dao = new todoDAO();
		List<todoVO> list = dao.getList();

		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 입력, 삭제, 수정
		request.setCharacterEncoding("utf-8");
		String good = request.getParameter("good");

		todoDAO dao = new todoDAO();

		if (good.equals("insert")) {
			String todo = request.getParameter("todo");

			todoVO vo = new todoVO(todo);
			dao.insertTodo(vo);
		} else if (good.equals("delete")) {
			String todo = request.getParameter("todo");
			dao.deleteTodo(todo);
			
		} else if (good.equals("update")) {
			String todo = request.getParameter("todo");			
			todoVO vo = new todoVO(todo);
			dao.updateTodo(vo);
		}
		

	}

}
