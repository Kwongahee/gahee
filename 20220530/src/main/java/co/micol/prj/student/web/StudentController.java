package co.micol.prj.student.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.micol.prj.student.service.StudentService;
import co.micol.prj.student.vo.StudentVO;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentDao;

	@RequestMapping("/studentList.do") // 전체 회원 목록보기
	public String studentList(Model model) {

		model.addAttribute("students", studentDao.studentSelectList());
		return "student/studentList";
	}

	@RequestMapping("/studentJoinForm.do")
	public String studentJoinForm() {
		return "student/studentJoinForm";
	}
	
	@PostMapping("/studentJoin.do")
	public String studentJoin(StudentVO vo, Model model) {

		int n = studentDao.studentInsert(vo);
		if(n != 0) {
			model.addAttribute("message","회원가입이 성공적으로 처리되었습니다.");
		}else {
			model.addAttribute("message","회원가입 실패ㅜ^ㅜ");
		}
		return "student/studentJoin";
	}
	
	@GetMapping("/ajaxIdCheck.do")
	@ResponseBody
	public String ajaxIdCheck(String id) {
		boolean b = studentDao.idCheck(id);
		String data = "N"; // 존재하는 아이디
		if(!b) {
			data = "Y"; // 사용 할 수 있는 아이디
		}
		return data;
	}
}
