//package com.test;
//
//import java.util.Scanner;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
//public class Exam05 {
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//
//		Book[] books = new Book[4];
//
//		while (true) {
//			System.out.println("1. 책정보 입력 2. 리스트 3. 종료");
//			System.out.print("선택 > ");
//			int menu = scn.nextInt();
//			if (menu == 1) {
//				System.out.print("책제목을 입력하세요. >");
//				String name = scn.next();
//				System.out.print("책저자를 입력하세요. >");
//				String write = scn.next();
//				System.out.print("출판사를 입력하세요. >");
//				String com = scn.next();
//				System.out.print("가격을 입력하세요. >");
//				int price = scn.nextInt();
//
//				Book b1 = new Book(name, write, com, price);
//				for (int i = 0; i < books.length; i++) {
//					if (books[i] == null) {
//						books[i] = b1;
//						break;
//					}
//				}
//				System.out.println("저장완료");
//			} else if (menu == 2) {
//				for (int i = 0; i < books.length; i++) {
//					if (books[i] != null) {
//						System.out.println(books[i].showinfo2());
//
//					}
//				}
//			} else if (menu == 3) {
//				System.out.println("프로그램 종료");
//
//				break;
//			}
//
//		}
//
//	}
//}
