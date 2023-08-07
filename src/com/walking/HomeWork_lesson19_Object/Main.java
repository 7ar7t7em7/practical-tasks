package com.walking.HomeWork_lesson19_Object;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Car[] cars = {
						new Car("Daewoo", "Lanos", "V123RK", "123ZZZ"),
						new Car("Daewoo", "Sens", "V222RK", "123XXX"),
						new Car("Toyota", "Rav4", "Z456Rv", "qweXXX"),
						new Car("Mercedes", "G450", "V422RK", "asdXXX"),
						new Car("Lada", "Granta", "V444RK", "1zxcXXX"),
						new Car("Chevrolet", "Aveo", "V334RK", "123Xyu")};
		Car[] findCars = new Car[cars.length];
		String str = "";
		do {
			System.out.println("Search by:\n");
			System.out.println("1 - brand, 2 - model, 3 - number, 4 - VIN");
			int searchBy = sc.nextInt();
			if (searchBy != 1 && searchBy != 2 && searchBy != 3 && searchBy != 4) {
				System.out.println("Incorrect!\n Try again");
				System.exit(0);
			}
			if(searchBy == 1) {
				System.out.println("Enter brand:\n");
				str = sc.next();
			}else if(searchBy == 2) {
				System.out.println("Enter model:\n");
				str = sc.next();
			}else if(searchBy == 3) {
				System.out.println("Enter number:\n");
				str = sc.next();
			}else if(searchBy == 4) {
				System.out.println("Enter VIN:\n");
				str = sc.next();
			}
			findCars = Car.findCar(cars, str, searchBy);
		} while ((findCars[0] != null && findCars[1] == null) && findCars[0] == null);
		for (Car car : findCars) {
			if(car == null) {
				continue;
			}
			System.out.println(car.toString());
		}
	}
	
}
