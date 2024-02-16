package com.walking.HomeWork_lesson38_2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = initializeCars();
		//System.out.println(cars);
		Collections.sort(cars);
		System.out.println(cars);
		Collections.reverse(cars);
		System.out.println(cars);
	}

	static ArrayList<Car> initializeCars() {
		
		Car car1 = new Car("987", 2005, "red", true);
		Car car2 = new Car("222", 2016, "black", true);
		Car car3 = new Car("400", 2008, "red", true);
		Car car4 = new Car("300", 2007, "grey", true);
		Car car5 = new Car("564", 2006, "grey", false);
		Car car6 = new Car("774", 2005, "white", true);
		Car car7 = new Car("111", 2020, "pink", false);
		Car car8 = new Car("111", 2005, "blue", true);
		
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
