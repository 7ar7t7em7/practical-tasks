package com.walking.HomeWork_lesson38_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainFor38_1 {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = initializeCars();
		//System.out.println(cars);
			
		NumberComparator numComp = new NumberComparator();
		ColorComparator colComp = new ColorComparator();
		YearComparator yearComp = new YearComparator();
		Comparator<Car> numYearComp = new NumberComparator().thenComparing(yearComp);
		cars.sort(numComp);
		Collections.reverse(cars);
		
		System.out.println();
		System.out.println();
		
		
		System.out.println(cars);
	}
	
	static ArrayList<Car> initializeCars() {
		Car car1 = new Car("Lada", "Granta", 774, "black");
		Car car2 = new Car("Daewoo", "Lanos", 222, "white");
		Car car3 = new Car("BMW", "705", 111, "blue");
		Car car4 = new Car("Mercedes", "GLS", 987, "red");
		Car car5 = new Car("Lexus", "NX", 300, "grey");
		Car car6 = new Car("Lexus", "NX", 300, "grey");
		Car car7 = new Car("Daewoo", "Nexia", 564, "green");
		Car car8 = new Car("BMW", "500", 111, "pink");
		
		ArrayList<Car> arr = new ArrayList<>();
		arr.add(car1);
		arr.add(car2);
		arr.add(car3);
		arr.add(car4);
		arr.add(car5);
		arr.add(car6);
		arr.add(car7);
		arr.add(car8);
		
		return arr;
		
	}

}
