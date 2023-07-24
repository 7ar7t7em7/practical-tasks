package com.walking.lesson16_homeWork.task1;

import java.util.Scanner;

import com.walking.lesson16_homeWork.task1.classes.*;

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
		
        String shapeString = createShapeString(length, figure);
        System.out.println(shapeString);
		
	}
	
	public static void end() {
		System.exit(0);
	}
	
    private static String createShapeString(int length, int type) {
        Figure shape;

        switch (type) {
            case 1:
                shape = new Square(length);
                break;
            case 2:
                shape = new Triangle(length);
                break;
            default:
                return "Unknown shape";
        }

        return shape.createFigure();
    }
	
}
