package com.walking.HomeWork_lesson17_enum.task1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your question: \n");
		
		String s = sc.nextLine();
		sc.close();
		if (s.equals(Question.BYE.question)) {
			System.out.println(Question.BYE);
		} else if(s.equals(Question.HI.question)) {
			System.out.println(Question.HI);
		} else if(s.equals(Question.HOWAREYOU.question)) {
			System.out.println(Question.HOWAREYOU);
		}else {
			System.out.println(Question.UNKNOWN);
		}
		
		
	}

}
