package com.walking.HomeWork_lesson34_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter date (format - dd.MM.yyyy HH:mm:ss):");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		 
		if(LocalDateTime.now().isAfter(parseByFormatter(str))) {
			System.out.println(LocalDateTime.now() + " is after " + str);
		}else if (LocalDateTime.now().isBefore(parseByFormatter(str))) {
			System.out.println(LocalDateTime.now() + " is before " + str);
		}else {
			System.out.println("dates are equale");
		}
		}

	static LocalDateTime parseByFormatter(String s) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"); 
		return LocalDateTime.parse(s, dtf);

}

	
	}
	
	