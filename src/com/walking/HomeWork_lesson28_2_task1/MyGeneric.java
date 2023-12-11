package com.walking.HomeWork_lesson28_2_task1;

public class MyGeneric<T> {
	T type;
	
	public MyGeneric(T t) {
		this.type = t;
	}
	
	public T getValue() {
		return type;
	}
	
}
