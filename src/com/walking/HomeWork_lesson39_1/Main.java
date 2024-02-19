package com.walking.HomeWork_lesson39_1;

public class Main {

	public static void main(String[] args) {
		
		mySLL<String> a = new mySLL<>();
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		System.out.println("Size is " + a.size());
		a.printSLL();
		System.out.println();
		
		a.printSLL();
		
	}
}
