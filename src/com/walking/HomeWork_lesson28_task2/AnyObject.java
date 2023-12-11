package com.walking.HomeWork_lesson28_task2;

public class AnyObject<T> {
	private final T t;
	
	public AnyObject(T t) throws Exception {
		if(this.isNull(t)) {
			throw new Exception("Object is null");
		}
		this.t = t;
	}
	
	boolean isNull(Object obj) {
		if (obj == null) {
			return true;
		}
		return false;
	}
	
}
