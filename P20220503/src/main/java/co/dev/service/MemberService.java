package co.dev.service;

import java.util.List;

import co.dev.dao.MemberDAO;
import co.dev.vo.MemberVO;

public class MemberService {
	MemberDAO dao = new MemberDAO(); // db CRUD작업.

	public MemberVO memberSearch(String id) {
		return dao.searchMember(id);
	}
	
	public void memberInsert(MemberVO member) {
		dao.insertMember(member);
	}

	public List<MemberVO> memberList() {
		return dao.listMember();
	}
	
	public void updateMember(MemberVO member) {
		dao.updateMember(member);
	}
	
	public void deleteMember(String id) {
		dao.deleteMember(id);
	}
}
