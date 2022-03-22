package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
	
		Member m1 = new Member ("user1", "홍길동");
		Member m2 =new Member ("user1", "홍길순");
		
		if(m1.equals(m1)) {
			System.out.println("논리적으로 같습니다.");
		} else {
			System.out.println("논리적으로 다릅니다.");
		}
		
		// 배열 > 컬렉션(ArrayList, HashSet, HashMap) : 여러개의 값을 저장.
		Member[] memberAry = new Member[5]; //Member의 인스턴트 최대 5개 저장.
											// 크기 초과하면 새로운 배열 선언. 원래 있던 배열을 복사해서 담아둬야함.
		ArrayList<Member> memList = new ArrayList<Member> ();
		memList.add(new Member("user1", "홍길동"));
		memList.add(new Member("user1", "홍길동"));
		for(int i=0; i<memList.size();i++) {
			System.out.println(memList.get(i));
		}
		
		HashSet<Member> memSet = new HashSet<Member>();
		memSet.add(new Member("user1", "홍길동")); //hashCode(), equals()
		memSet.add(new Member("user1", "홍길동"));
		
		System.out.println(memSet.size());
		
//		Member obj1 = new Member("blue");
//		Member obj2 = new Member("blue");
//		Member obj3 = new Member("red");
//
//		if(obj1.equals(obj2)) {
//			System.out.println("obj1과 obj2는 동등합니다.");
//		} else {
//			System.out.println("obj1과 obj2는 동등하지 않습니다.");
//		}
//	
//		if(obj1.equals(obj3)) {
//			System.out.println("obj1과 obj3은 동등합니다.");
//		} else {
//			System.out.println("obj1과 obj3은 동등하지 않습니다. ");
//		}
//		
	}
}