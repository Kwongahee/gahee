package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp {

	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);

	// MemberService를 구현하는 구현클래스를 선언.
	class MemberServiceImpl implements MemberService {

		@Override
		public void addMember(Member member) {
			members.add(member);
		}

		@Override
		public void modifyMember(Member member) {
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getMemberId() == member.getMemberId()) {
					members.get(i).setPhone(member.getPhone());
				}
			}
		}

		@Override
		public List<Member> memberList() {
			return members;
		}

	}

	// 무슨반에 등록하고싶냐? > 정보 멤버즈에 추가
	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 도서반=> 기본정보 + 반장이름, 강의실정보 넣어야함
		// 축구반=> 기본정보 + 코치이름, 락커룸이름
		// 수영반 =>기본정보+ 강사이름, 수영등급
		MemberService member = new MemberServiceImpl();
		while (true) {
			System.out.println("1.등록  2.수정  3.전체리스트  9.종료  ");
			System.out.print("선택 >> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("어느반에 등록하시겠습니까?");				
				System.out.println("1.도서반 2.축구반 3.수영반");
				int cls = scn.nextInt();
				if (cls == 1) {
					System.out.println("회원번호를 입력하세요");
					int Id = scn.nextInt();
					System.out.println("회원이름을 입력하세요");
					String name = scn.next();
					System.out.println("연락처를 입력하세요");
					String number = scn.next();
					System.out.println("반장이름을 입력하세요");
					String ban = scn.next();
					System.out.println("강의실정보를 입력하세요");
					String cname = scn.next();

					Member m1 = new BookMember(Id, name, number, ban, cname);
					member.addMember(m1);
				
				} else if (cls == 2) {
					System.out.println("회원번호를 입력하세요");
					int Id = scn.nextInt();
					System.out.println("회원이름을 입력하세요");
					String name = scn.next();
					System.out.println("연락처를 입력하세요");
					String number = scn.next();
					System.out.println("코치이름을 입력하세요");
					String co = scn.next();
					System.out.println("락커룸정보를 입력하세요");
					String lname = scn.next();

					Member m1 = new SoccerMember(Id, name, number, co, lname);
					member.addMember(m1);

				} else if (cls == 3) {
					System.out.println("회원번호를 입력하세요");
					int Id = scn.nextInt();
					System.out.println("회원이름을 입력하세요");
					String name = scn.next();
					System.out.println("연락처를 입력하세요");
					String number = scn.next();
					System.out.println("강사이름을 입력하세요");
					String te = scn.next();
					System.out.println("수영등급을 입력하세요");
					String grade = scn.next();

					Member m1 = new SwimMember(Id, name, number, te, grade);
					member.addMember(m1); 
					
				}	
				} else if (menu == 2) {
					System.out.println("회원번호를 입력하세요.");
					int Id = scn.nextInt();
					System.out.println("변경하실 휴대폰번호를 입력하세요.");
					String number = scn.next();
					Member m1 = new Member(Id, null, number);
					member.modifyMember(m1);
					System.out.println("처리가 완료되었습니다.");

				} else if (menu == 3) {
					List<Member> list = member.memberList();
					for (Member m : list) {
						System.out.println(m.toString());
					}
				}

			 else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}

		}

	}
}
