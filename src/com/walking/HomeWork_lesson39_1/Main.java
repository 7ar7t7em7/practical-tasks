package com.walking.HomeWork_lesson39_1;

public class Main {

	public static void main(String[] args) {
		
		mySLL<String> a = new mySLL<>();
		a.add("A");
		a.add("B");
		System.out.println(1);
//		a.add("B");
		a.add("C");
		a.add("D");
		a.printSLL();
		System.out.println(2);
	}
}
