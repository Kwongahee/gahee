package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();  //Set : 중복값은 허용x,,,,,, 꺽새가 제너릭
		set.add("Hello");
		set.add("World");
		set.add("Good");
		set.add("World"); //중복된 값은 받아들이지 않음..
		
		
		set.remove("Good");
		
		
		System.out.println("set 크기: " + set.size());

		//iterator() < 반복자를 생성하는 메소드
		Iterator<String> iter= set.iterator(); //반복자 <반복되는 요소를 한개씩 끄집어내는 역할>
		while(iter.hasNext()) {
			String result = iter.next(); //하나를 가져오겠습니당
			System.out.println(result);
		}
		System.out.println("end of prog");
	}
}
