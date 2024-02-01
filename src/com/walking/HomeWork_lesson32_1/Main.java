package com.walking.HomeWork_lesson32_1;

public class Main {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Lada", "Granta", "774", "black");
		Car car2 = new Car("Daewoo", "Lanos", "222", "white");
		Car car3 = new Car("BMW", "705", "111", "blue");
		Car car4 = new Car("Mercedes", "GLS", "987", "red");
		
		Car[] carsForSaving = new Car[4];
		carsForSaving[0] = car1;
		carsForSaving[1] = car2;
		carsForSaving[2] = car3;
		carsForSaving[3] = car4;
		
		CarRepository.saveCars(carsForSaving);
		
		Car[] carsForReading = new Car[carsForSaving.length];
		carsForReading = CarRepository.parseFile();
		
		for (Car car : carsForReading) {
			System.out.println(car);
		}
		
		car3.setColor("red");
		
		CarRepository.saveCars(carsForSaving);
		
		//Car[] carsForReading = new Car[carsForSaving.length];
		carsForReading = CarRepository.parseFile();
		
		for (Car car : carsForReading) {
			System.out.println(car);
		}
		
	}

}
