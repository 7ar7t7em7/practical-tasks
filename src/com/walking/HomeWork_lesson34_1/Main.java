package com.walking.HomeWork_lesson34_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		String str = "20.12.2022 20:16:34";
		LocalDateTime ldt = parseByFormatter(str);
		System.out.println(ldt);
		
		
	}
	
	static LocalDateTime parseByString(String s) {
		int day = Integer.parseInt((String) s.substring(0, 2));
		int month = Integer.parseInt((String) s.substring(3, 5));
		int year = Integer.parseInt((String) s.substring(6, 10));
		int hour = Integer.parseInt((String) s.substring(11, 13));
		int minutes = Integer.parseInt((String) s.substring(14, 16));
		int seconds = Integer.parseInt((String) s.substring(s.length()-2));
		//System.out.println(seconds);
		return LocalDateTime.of(year, month, day, hour, minutes, seconds);
	}
	
	static LocalDateTime parseByFormatter(String s) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"); 
		return LocalDateTime.parse(s, dtf);
	}
}
