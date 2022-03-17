package com.dev;

public class IfExample { // 프로그램 이름 WhichExample, firstName, first_name (언더바로 구분)
	public static void main(String[] args) {
		// 조건문 if ..
		// 60점 이상이면 Pass
		int score = 83;
		if (score > 60) {
			System.out.println("Pass입니다.");
		} else {
			System.out.println("Fail입니다.");
		}

		// 90점이상이면 A, 80점이상 B, 70점이상 C, 60점이상 D, 그 외 F
	     if (score >= 90) {
	         if (score >= 95) {
	            System.out.println("A+입니다.");
	         } else {
	            System.out.println("A입니다.");
	         }

	         ;
	      } else if (score >= 80) {
	         if (score >= 85) {
	            System.out.println("B+입니다.");
	         } else {
	            System.out.println("B입니다.");
	         }
	         ;
	      } else if (score >= 70) {
	         if (score >= 75) {
	            System.out.println("C+입니다.");
	         } else {
	            System.out.println("C입니다.");
	         }
	         ;
	      } else if (score >= 60) {
	         if (score >= 65) {
	            System.out.println("D+입니다.");
	         } else {
	            System.out.println("D입니다.");
	         }
	         ;
	      } else {
	         System.out.println("F입니다.");
	      }

	      System.out.println("End of Program");
	   }

	}