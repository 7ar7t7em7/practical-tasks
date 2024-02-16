package com.walking.HomeWork_lesson38_1;

import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Car {
	
	private final String brand;
	private final String model;
	private final Integer number;
	private final Integer year;
	private String color;
	
	Car(String brand, String model, Integer number, String color) {
		
		this.brand = brand;
		this.model = model;
		this.number = number;
		this.color = color;
		this.year = ThreadLocalRandom.current().nextInt(1980, 2020);
	}
	
	@Override
	public String toString() {
		return "Car (brand=" + brand + ", model=" + model + ", number=" + number + ", color=" + color + ", year="+ year +")\n";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public String getColor() {return color;}

	public void setColor(String color) {this.color = color;}

	public String getBrand() {return brand;}

	public String getModel() {return model;}

	public Integer getNumber() {return number;}

	public Integer getYear() {return year;}
	
}

class NumberComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		if (o1.getNumber() > o2.getNumber()) {
			return 1;
		}else if(o1.getNumber() < o2.getNumber()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}

class ColorComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getColor().compareTo(o2.getColor());
	}
	
}

class YearComparator implements Comparator<Car>{
	@Override
	public int compare(Car o1, Car o2) {
		if (o1.getYear() > o2.getYear()) {
			return 1;
		}else if(o1.getYear() < o2.getYear()) {
			return -1;
		}else {
			return 0;
		}
	}
}