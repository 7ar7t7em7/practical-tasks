package com.walking.HomeWork_lesson39_1;

public class Main {

	public static void main(String[] args) {
		
		mySLL<Integer> a = new mySLL<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		System.out.println("size =" + a.size());
		a.delete(6);
		a.delete(1);
		
		a.delete(8);
		System.out.println("size =" + a.size());
		
		
	}

}