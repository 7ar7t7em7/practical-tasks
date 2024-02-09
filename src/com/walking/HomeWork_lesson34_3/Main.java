package com.walking.HomeWork_lesson34_3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Enter first date (format - dd.MM.yyyy HH:mm:ss):");
//		Scanner sc = new Scanner(System.in);
//		String str1 = sc.nextLine();
//		System.out.println("Enter second date (format - dd.MM.yyyy HH:mm:ss):");
//		String str2 = sc.nextLine();
//		sc.close();
		
		//System.out.println(str1 + "\n" + str2);
		
		String str1 = "20.11.2022 20:16:34";
		String str2 = "21.12.2023 21:17:35";
		
		LocalDateTime date1 = parseByFormatter(str1);
		LocalDateTime date2 = parseByFormatter(str2);
		
		if (date1.isEqual(date2)) {
			System.out.println("Dates are equale");
		}else if (date1.isBefore(date2)) {
			System.out.println(isBefore(date1, date2));
		}else if (date1.isAfter(date2)) {
			//System.out.println(isAfter());
		}

	}

	static LocalDateTime parseByFormatter(String s) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"); 
		return LocalDateTime.parse(s, dtf);
	}
	
	static String isBefore(LocalDateTime d1, LocalDateTime d2) {
		String str = "";
		LocalDateTime years = d1.minusYears(d1.getYear());
		str += "Years: " + years.toString();
		return str;
	}
}
