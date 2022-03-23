package com.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		

	Date today = new Date("2022/01/01 00:00:00");
//	today.setYear(1); // 기준 시작점이 1900년, ex) 1을 넣으면 1901년이 기준..
	System.out.println(today);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	System.out.println(sdf.format(today)); //포맷 도움받아서 출력ㅜㅜ
	
	LocalDateTime time = LocalDateTime.now();
	System.out.println(time.getYear());
	}
}
