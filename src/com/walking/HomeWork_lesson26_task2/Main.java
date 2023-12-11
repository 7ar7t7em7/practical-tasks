package com.walking.HomeWork_lesson26_task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: " + "\n");
		String s = sc.nextLine();
		sc.close();
		Integer k = 0;
		s = s.trim();
		String[] array = s.split(" ");
		String[] result = new String[array.length];
		result[k] = array[0];
		for(int i = 1; i < array.length; i++) {
			if(!isInArray(result, array[i])) {
				k++;
				result[k] = array[i];
			}
		}
		System.out.println(++k);
	}
	
	static boolean isInArray(String[] arr, String str) {
		
		for (String string : arr) {
			if(string == null) {
				return false;
			}
			if(str.equalsIgnoreCase(string)) {
				return true;
			}
		}
		
		return false;		
	}
	
}
