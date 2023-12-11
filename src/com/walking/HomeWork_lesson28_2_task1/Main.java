package com.walking.HomeWork_lesson28_2_task1;

public class Main {

	public static void main(String[] args) {
			MyGeneric<String> gn1 = new MyGeneric<String>("String");
			System.out.println(getter(gn1, "AnotherString"));
			
			MyGeneric<String> gn2 = new MyGeneric<String>(null);
			System.out.println(getter(gn2, "AnotherString"));
		}

	private static <T> T getter(MyGeneric<T> val1, T val2) {
		return val1.getValue() != null ? val1.getValue() : val2;
	}

}
