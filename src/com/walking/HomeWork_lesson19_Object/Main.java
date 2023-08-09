package com.walking.HomeWork_lesson19_Object;

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
		//Car[] findCars = new Car[cars.length];
		String str = "";
		while (cars.length != 1) {
			System.out.println("Search by:\n");
			System.out.println("1 - brand, 2 - model, 3 - number, 4 - VIN\n");
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
			cars = Car.findCar(cars, str, searchBy);
			if(cars == null) {
				System.out.println("No such car in base");
				break;}
			cars = Main.cutArrayOfCars(cars);
				
			for (Car car : cars) {
				if(car == null) {
					continue;
				}
			System.out.println(car.toString());
			
		}
			
		}
		sc.close();
	}
	
	private static Car[] cutArrayOfCars(Car[] cars) {
		
		if (cars.length == 0) {
			return null;
		}
		//считаем непустые ссылки в массиве
		int count = 0;
		for (Car car : cars) {
			if(car != null) {
				count++;
			}
		}
		
		
		Car[] carsForReturn = new Car[count];
		count = 0;
		
		for (Car car : cars) {
			if(car == null) {
				continue;
			}else {
				carsForReturn[count] = car;
				count++;
			}			
		}
		
		return carsForReturn; 
	}
	
}
