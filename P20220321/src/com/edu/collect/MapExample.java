package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//Map : {key:value}, {key1:value1},... 각각의 제너릭을 선언해줘야함.
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("야홍", 100);
		map.put("어흥", 83);
		map.put("야옹", 85);
		map.put("야옹", 87);
		//컬렉션 : 여러값을 저장. => 여러요소 접근.
		
		
		Integer val = map.get("야옹");   // 중복된 값이 들어가면 제일 최신의 값으로 덮음.
		System.out.println(val);

		Set<String> keySet = map.keySet(); //map 컬렉션에 저장된 요소들의 키에 해당 값을 set컬렉션에 담아준
		// 1)
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key:%5s, value:%5d \n", key, value);  
		}
		
		// 2) for( : ) 확장for
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.printf("key:%5s, value:%5d \n", key, value);  
		}
		
		
		
		System.out.println("end of program");
	}
}
