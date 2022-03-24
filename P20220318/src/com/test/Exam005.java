package com.test;

import java.util.Scanner;

public class Exam005 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("제목입력>> ");
		String title = scn.next();

		System.out.println("저자입력>> ");
		String author = scn.next();

		System.out.println("출판사입력>> ");
		String press = scn.next();

		System.out.println("가격입력>> ");
		int price = scn.nextInt();

		Book book = new Book(title, author, press, price); //이름 통일
		book.showInfo2();
	}
}