package com.edu;
//이름을 입력받도록..(String) > scn.nextLine();
//연락처 입력..(String) >scn.nextLine();
//나이 입력..(int) > scn.nextInt();
// 키 입력.. (double) > scn.nextDouble();
//몸무게 : 60
//적정몸무게: (키-100) * 0.9 > +-5키로
import java.util.Scanner;

// 이름은 : 연락처: 나이:  키:
public class TodayExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름");
		String name = scn.nextLine();
		System.out.println("연락처");
		String call = scn.nextLine();
		System.out.println("나이");
		int age = scn.nextInt();
		System.out.println("키");
		double tall = scn.nextDouble();
		System.out.println("몸무게");
		double wg = scn.nextDouble();
		
		System.out.println("이름: " + name + " 연락처: " + call + " 나이: " + age + " 키: " + tall + " 몸무게는?" + wg  );
		if( wg > (tall - 100) * 0.9) {
			System.out.println("과체중");
		} else {System.out.println("저체중");
		}
		scn.close();

		double weight = 67.5; //72.5~62.3. 사이에 적정
		double realWeigth  = 69.3; //30
		
		if (weight + 5 > realWeigth && weight-5 < realWeigth)			{
			System.out.println("적정몸무게입니다.");
		} else {
			System.out.println("비정상입니다");
		}
		
			
	}
}
