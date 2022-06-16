package com.yedam.myserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.yedam.myserver.emp.vo.Employee;

public class LamdaTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		// 객체 초기화하고 생성시켜줌 (builder)(생성자없이)
		list.add(Employee.builder().email("a@a.c").salary(10000).build());
		list.add(Employee.builder().email("b@a.c").salary(1050).build());
		list.add(Employee.builder().email("c@a.c").salary(56000).build());
		list.add(Employee.builder().email("d@a.c").salary(10026).build());
		list.add(Employee.builder().email("e@a.c").salary(8500).build());

		Collections.sort(list, new Comparator<Employee>() { // 익명클래스 : 클래스 생성, 선언 한번에
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
		});

		// 람다식 : 부모인터페이스의 오버라이딩 1개인 경우만 가능
		Collections.sort(list, (Employee o1, Employee o2) -> o1.getSalary() - o2.getSalary());
		
		for (Employee emp : list) {
			System.out.println(emp.getEmail() + ":" + emp.getSalary());
		}

	}
}

class EmpComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}
}