/*
 * Задача 2: 
Реализуйте любой из вариантов Задачи 1 в уроке 16.

 * Реализуйте класс «Правильная фигура».
 * Для него создайте классы-наследники «Треугольник» и «Квадрат».
 * <p>
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * Программа должна нарисовать в консоли выбранную пользователем фигуру,
 * используя символы '-', '|', '/', '\'.
 
При некорректном вводе с клавиатуры выбрасывайте собственное исключение InputValidationException.
Не забудьте указать в описании, 
какой именно из вводов был некорректен - message исключения должен быть информативным. 
Предка исключения определите самостоятельно.
 * 
 */

package com.walking.HomeWork_lesson20_Exception_task2;

import java.util.Scanner;

import com.walking.HomeWork_lesson20_Exception_task2_model.Shape;
import com.walking.HomeWork_lesson20_Exception_task2_model.Square;
import com.walking.HomeWork_lesson20_Exception_task2_model.Triangle;

public class Main {
    public static void main(String[] args) throws InputValidationException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();
        if(length < 1) {
        	throw new InputValidationException("Incorrect length");
        }

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int shapeType = scanner.nextInt();

        scanner.close();

        try {	String shapeString = createShapeString(length, shapeType);
        		System.out.println(shapeString);
        }
        catch(InputValidationException ex) {
        		System.out.println(ex.getMessage());}
    }

    private static String createShapeString(int length, int type) throws InputValidationException{
        Shape shape;

        switch (type) {
            case 1:
                shape = new Square(length);
                break;
            case 2:
                shape = new Triangle(length);
                break;
            default:
                throw new InputValidationException("Incorrect type");
        }

        return shape.createShapeString();
    }
}
