package com.walking.HomeWork_lesson26_task1;

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 * <p>
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		Integer length = sc.nextInt();
		System.out.println("Enter width: ");
		Integer width = sc.nextInt();
		sc.close();
		if(length < 1 || width < 1) {
			throw new Exception("Unnormal size!");
		}
		
		Rectangle r = new Rectangle(length, width);
		System.out.println(r.picture);
	}
	

	
}
