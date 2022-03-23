package com.edu.collect;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer","123");
		map.put("fall", "1234");
		map.put("winter", "12345");    //아이디와 비밀번호를 저장 !!!!
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 입력 >> ");
			String id = scanner.next();
			
			System.out.println("비밀번호 입력>> ");
			String password = scanner.next();
			System.out.println();

			if(map.containsKey(id)) { //ID가 존재하는지 확인
				if(map.get(id).equals(password)) { //비밀번호 비교
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");  //아이디가 있다면 else
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다."); //아이디가 없다면
			}
		
		}
		
		
	}
}
