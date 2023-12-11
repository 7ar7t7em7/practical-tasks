package com.walking.HomeWork_lesson21_task1;

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
						new Car("Chevrolet", "Aveo", "V334RK", "123YYY"),
						new Car("1", "1", "1", "1")};
		
		System.out.println("Enter brand:\n");
		String strBrand = sc.nextLine();
		System.out.println("Enter model:\n");
		String strModel = sc.nextLine();
		System.out.println("Enter number:\n");
		String strNumber = sc.nextLine();
		System.out.println("Enter VIN:\n");
		String strVIN = sc.nextLine();
		
		sc.close();
		
		Car searchIt = new Car(strBrand, strModel, strNumber, strVIN);
		
		try {
			System.out.println(findCar(cars, searchIt));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static Car findCar(Car[] carsForSearch, Car searchingCar) throws CarNotFoundException{
		for (int i = 0; i < carsForSearch.length; i++) {
			if(carsForSearch[i].equals(searchingCar)) {
				return carsForSearch[i];
			}
		}
		throw new CarNotFoundException("Car is not found in database :-)");
	}

}
