package com.edu.nested;

public class Outer {
	//
	private String field1;
	private int field2;

	class Inner { // 멤버클래스.
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2()");
		}
	}
// 함수적 인터페이스 : 구현해야 할 메소드가 하나인것.
	interface Runnable {
		void run();
	}

	class Bus implements Runnable {

		@Override
		public void run() {
			System.out.println("Bus가 달립니다.");

		}

	}

	public String getFiled1() {
		return field1;
	}

	public void method1() {
		System.out.println("Outer.method()");
		Inner inner = new Inner();
		inner.method2();
	}

	public void method3() {
		System.out.println("Outer.method3()");

		class Local { // 로컬클래스(메소드안에 클래스가 선언되도록).. 로컬클래스는 [메소드3]안에서만 호출가능

			void method4() {
				System.out.println("Local.method4()");
			}
		}
		Local local = new Local(); // 호출할때만 요렇게
		local.method4();

	}

	public void method4() {
		Runnable runnable = new Bus(); // 인터페이스의 구현 객체 가능.
		runnable.run();

		// 익명구현객체.
		// Lambda 표현식. 
		
		runnable = () -> System.out.println("임의의 객체를 실행합니다."); //function : 기능 //중요하다고..?!?????!!!!
		
//		runnable = new Runnable() {
//			@override
//			public void run() {
//				System.out.println("임의의 객체를 실행합니다,"); - 한번 선언하고 버림
//			}
//		};


		runnable.run();

	}

}
