package com.walking.HomeWork_lesson28_task2;

public class Main {

	public static void main(String[] args) {
		
		Number n = new Integer(5);
		n = null;
		
		try {
			AnyObject<Object> ao = new AnyObject<Object>(n);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
