package com.edu.generic;

//ArrayList<Integer>
//Type Parameter : 매개변수
public class Box<T> { //어떤 타입일지 모르지만 선언하는 시점에 타입을 정하겠다.    
	T obj;
	
	public void setObj(T obj) { //모든 형태의 변수 사용할 수 있도록 object
		this.obj = obj;
		
	}
	
	public T getObj() {
		return this.obj;
	}
}
