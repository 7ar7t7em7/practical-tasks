package com.walking.HomeWork_lesson17_enum.task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int length = sc.nextInt();
		if (length <= 0) {
			System.out.println("Incorrect length! Terminating program...");
			end();
		}
		
		System.out.println("What figure do you want? (1 - Square; 2 - Triangle) ");
		int figure = sc.nextInt();
		
		if (figure != 1 && figure != 2) {
			System.out.println("Incorrect figure! Terminating program...");
			end();
		}
		
		sc.close();
		System.out.println();

	}
	
	public static void end() {
		System.exit(0);
	}

}
