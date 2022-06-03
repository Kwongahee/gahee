package co.micol.prj.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.micol.prj.service.boardService;
import co.micol.prj.vo.boardVO;

@Controller
public class boardController {

	@Autowired 
	private boardService boardDao;
	
	@RequestMapping("/boardList.do")
	public String boardList(Model model) {
		model.addAttribute("boards", boardDao.boardList());
		return "board/boardList";
	}
	
	@RequestMapping("/boardInsertForm.do")
	public String boardInsertForm() {
		return "board/boardInsertForm";
	}
	
	@RequestMapping("/boardInsert.do")
	public String boardInsert(boardVO vo) {
		boardDao.boardInsert(vo);
		return "redirect:boardList.do";
	}
	
	@RequestMapping("/boardContent.do")
	public String boardContent(boardVO vo, Model model) {
		boardDao.boardHitUpdate(vo.getBoardId());
		model.addAttribute("content", boardDao.boardSelect(vo));
		return "board/boardContent";
		
	}
	
	@RequestMapping("/boardDelete.do")
	public String boardDelete(boardVO vo) {
		boardDao.boardDelete(vo);
		return "redirect:boardList.do";
	}
}
