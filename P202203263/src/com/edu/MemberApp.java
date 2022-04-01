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
		MemberService service = new MemberServiceImpl();

		while (true) {

			System.out.println("1.등록  2.수정  3.전체리스트  9.종료  ");
			System.out.print("선택 >> ");
			int menu = 0;
			try {
				menu = scn.nextInt();
			} catch (Exception e) {
			}
			if (menu == 1) {

				System.out.println("1.도서회원  2.축구회원  3.수영회원");
				int menu2 = scn.nextInt();
				System.out.println("회원아이디를 입력>>>");
				int memberId = scn.nextInt();
				System.out.println("회원이름 입력>>>");
				String membName = scn.next();
				System.out.println("연락처 입력>>>");
				String phone = scn.next();
				if (menu2 == 1) {

					System.out.println("반장이름 입력>>");
					String banName = scn.next();
					System.out.println("강의실 입력>>");
					String roomName = scn.next();

					BookMember mem = new BookMember(memberId, membName, phone, banName, roomName);
					service.addMember(mem);

				} else if (menu2 == 2) {

					System.out.println("코치이름 입력>>");
					String coachName = scn.next();
					System.out.println("락커룸 입력>>");
					String rockName = scn.next();

					SoccerMember mem = new SoccerMember(memberId, membName, phone, coachName, rockName);
					service.addMember(mem);

				} else if (menu2 == 3) {

					System.out.println("강사이름 입력>>");
					String teachName = scn.next();
					System.out.println("등급 입력>>");
					String grade = scn.next();

					SwimMember mem = new SwimMember(memberId, membName, phone, teachName, grade);
					service.addMember(mem);
				} else {
					System.out.println("잘못된 메뉴를 선택했습니다.");
				}

			} else if (menu == 2) {

			} else if (menu == 3) {
				List<Member> list = service.memberList();
				for (Member m : list) { // 리스트에 들어있는 만큼 반복하겠습니당
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
