package com.walking.HomeWork_lesson37_2;

public class Main {

	public static void main(String[] args) {
		
		MyStack<String> ms = new MyStack<String>();
		ms.add("A");
		ms.add("B");
		ms.add("C");
		
		ms.remove("A");
		ms.remove("C");
		
		ms.add("A");
		ms.add("C");
		ms.remove("C");
		
		Object[] o = ms.toArray();
		for (Object obj : o) {
			System.out.println(obj);
		}
		
		
		ms.clear();
		
		o = ms.toArray();
		for (Object obj : o) {
			System.out.println(obj);
		}
		
		ms.add("A");
		ms.add("B");
		ms.add("C");
		
		o = ms.toArray();
		for (Object obj : o) {
			System.out.println(obj);
		}
		System.out.println("\nsize = " + ms.mySize);
		System.out.println("Top element = " + ms.top);
		
		

	}

}
