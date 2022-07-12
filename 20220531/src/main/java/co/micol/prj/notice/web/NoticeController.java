package co.micol.prj.notice.web;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import co.micol.prj.notice.service.NoticeService;
import co.micol.prj.notice.vo.NoticeVO;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeDao;

	@Autowired
	private String saveDir; // IoC에서 저장된 것을 가져온다.

	@RequestMapping("/noticeList.do") // 전체목록보기
	public String noticeList(Model model) {
		model.addAttribute("notices", noticeDao.noticeSelectList(1, "전체"));
		return "notice/noticeList";
	}

	@RequestMapping("/noticeInsertForm.do") // 글 등록
	public String noticeInsertForm() {
		return "notice/noticeInsertForm";
	}

	@PostMapping("/noticeInsert.do")
	public String noticeInsert(NoticeVO vo, MultipartFile file) {
		String fileName = file.getOriginalFilename();

		// 파일이 비어있지않으면 true가 return
		if (fileName != null && !fileName.isEmpty() && fileName.length() != 0) {
			// UUID : 범용 고유 식별자
			// UUID 사용하여 파일명 변경
			String uid = UUID.randomUUID().toString();
			String saveFileName = uid + fileName.substring(fileName.indexOf("."));
			// uuid.xml 형식으로 만들기 위해서!

			// UUID로 만든 파일명 넣기
			File target = new File(saveDir, saveFileName);

			vo.setNoticeAttech(fileName); // 파일명
			vo.setNoticeDir(saveFileName); // 실제저장담고

			try {
				FileCopyUtils.copy(file.getBytes(), target); // 실제 파일을 저장
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		noticeDao.noticeInsert(vo); // 파일이 있을때 파일을 먼저 업로드하고 DB저장
		return "redirect:noticeList.do";
	}

	@PostMapping("/getContent.do")
	public String getContent(NoticeVO vo, Model model) {
		// getContent.do?noticeId=3 .. noticeId를 int noticeId에 대입할 수 있음
		// public String getContent(@RequestParam int noticeId) {
		noticeDao.noticeHitUpdate(vo.getNoticeId());
		model.addAttribute("content", noticeDao.noticeSelect(vo));
		return "notice/noticeContent";
	}

	@RequestMapping("/downLoad.do")
	public void downLoad(@RequestParam("saveName") String saveName, @RequestParam("fileName") String fileName,
			HttpServletResponse resp) {
		try {
			// file을 배열로 전환! 짱어렵다
			byte fileByte[] = org.apache.commons.io.FileUtils
					.readFileToByteArray(new File(saveDir + File.separator + saveName));
			resp.reset();
			// 모든 타입의 데이터를 전송할 때 사용.. set Header까지 화면의 데이터를 다운받을수있게 설정하는 부분!
			resp.setContentType("application/octet-stream");
			// 파일 길이만큼 사이즈 설정(response크기 만드는것)
			resp.setContentLength(fileByte.length);
			// 파일을 다운 받기위해 설정
			resp.setHeader("Content-Disposition",
					"attachment; fileName=\"" + URLEncoder.encode(fileName, "UTF-8") + "\"");

			// 입출력스트림 활동끝나면 close로 닫기
			resp.getOutputStream().write(fileByte);
			resp.getOutputStream().flush();
			resp.getOutputStream().close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/noticeDelete.do")
	public String noticeDelete(NoticeVO vo) {

		noticeDao.noticeDelete(vo);
		return "redirect:noticeList.do";

	}

	@RequestMapping("/noticeModifyForm.do")
	public String noticeModifyForm(NoticeVO vo, Model model) {
		model.addAttribute("notice", noticeDao.noticeSelect(vo));
		return "notice/noticeModifyForm";
	}

	@RequestMapping("/noticeModify.do")
	public String noticeModify(NoticeVO vo, MultipartFile file) {
		String fileName = file.getOriginalFilename();

//		vo.setNoticeAttech("");
//		vo.setNoticeDir("");

		if (fileName != null && !fileName.isEmpty() && fileName.length() != 0) {

			String uid = UUID.randomUUID().toString();
			String saveFileName = uid + fileName.substring(fileName.indexOf("."));

			File target = new File(saveDir, saveFileName);

			vo.setNoticeAttech(fileName); // 파일명
			vo.setNoticeDir(saveFileName);

			try {
				FileCopyUtils.copy(file.getBytes(), target); // 실제 파일을 저장
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		noticeDao.noticeUpdate(vo); // 파일이 있을때 파일을 먼저 업로드하고 DB저장
		return "redirect:noticeList.do";

	}

	@PostMapping("ajaxSearchList.do")
	@ResponseBody
	public List<NoticeVO> ajaxSearchList(@RequestParam("state") int state, @RequestParam("key") String key) {
		return noticeDao.noticeSelectList(state, key);
	}
}
