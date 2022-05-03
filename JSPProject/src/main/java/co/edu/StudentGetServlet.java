package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/StudentGetServlet") // 주소 표시줄에 치면 얘를 실행하겠다..
public class StudentGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentGetServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//Get:cmd=search, cmd=null -> JSON 형태로 반환.
		response.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		
		// cmd라는 값이 무엇인지 읽겠다.
		String cmd = request.getParameter("cmd");

		if (cmd != null && cmd.equals("search")) {
			String id = request.getParameter("user_id");
			StudentDAO dao = new StudentDAO();
			Student student = dao.searchStudent(id);
			
//			String name = request.getParameter("user_name");
			if(student != null) {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println("<form action='StudentGetServlet' method='post'>");
			response.getWriter().println("<h3>학생번호 : " + student.getStudentNo() + "</h3>");
			response.getWriter().println("<h3>이름 : " + student.getStudentName()+ "</h3>");
//			response.getWriter().println("<h3>영어 : " + student.getEngScore()+ "</h3>");
			response.getWriter().println("<h3>수정할 영어 점수 : <input type='number'name='eng_score' value='"+student.getEngScore()+"'> </h3>");
//			response.getWriter().println("<h3>국어 : " + student.getKorScore()+ "</h3>");
			response.getWriter().println("<h3>수정할 국어 점수 : <input type='number' name='kor_score' value = '"+student.getKorScore()+"'> </h3>");
			response.getWriter().println("<input type='hidden' name='cmd' value='mod'>");
			response.getWriter().println("<input type='hidden' name='user_id' value="+student.getStudentNo()+">");
			response.getWriter().println("<input type='hidden' name='user_name' value="+student.getStudentName()+">");
			response.getWriter().println("<input type='submit' name='mod' value='수정'>");
			response.getWriter().println("</form>");
						
			} else {
				response.getWriter().println("<h3>조회된 데이터가 없습니다.</h3>");
			}
			
			response.getWriter().println("<a href='studentList.jsp'>목록으로 이동</a>");
			
		} else if (cmd != null && cmd.equals("list")) {
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");

			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);

			dao.addStudent(stud);

			response.getWriter().print("입력성공");

		} else {

			response.setContentType("text/json;charset=utf-8");
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList();
			// [{}, {}, {}]
			// 데이터 편하게 만들 수 있음
			Gson gson = new GsonBuilder().create();
			response.getWriter().print(gson.toJson(list));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		
		String cmd = request.getParameter("cmd");
		if(cmd != null && cmd.equals("add")) {
				
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");

			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));
				
			dao.addStudent(stud);
			response.getWriter().print("입력성공");
		} else if (cmd != null && cmd.equals("del")) {
			String id = request.getParameter("user_id");
			
			StudentDAO dao = new StudentDAO();
			if(dao.removeStudent(id)) {
				response.getWriter().print("<script>alert('삭제성공')</script>");
			} else {
				response.getWriter().print("<script>alert('삭제실패!')</script>");
			}
		} else if (cmd != null&& cmd.equals("mod")) {
			//사용자의 입력 파라메터 => 
			Student stud = new Student();
			
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");

			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));
			
			StudentDAO dao = new StudentDAO();
			dao.modifyStudent(stud);			
		}
		response.sendRedirect("studentList.jsp");
	} // end of doPost()

}
