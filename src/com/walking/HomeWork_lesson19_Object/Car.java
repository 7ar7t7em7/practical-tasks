package com.walking.HomeWork_lesson19_Object;

import java.util.Objects;

public class Car {
	private final 	String 	brand;
	private final 	String	model;
	private final 	String	VIN;
	private 		String 	number;
	
	Car(){
		this.brand = "";
		this.model = "";
		this.number = "";
		this.VIN = "";
	}
	
	Car(String brand, String model, String number, String vin){
		this.brand = brand;
		this.model = model;
		this.VIN = vin;
		this.number= number;
	}


	@Override
	public int hashCode() {
		return Objects.hash(VIN, brand, model, number);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(VIN, other.VIN) && Objects.equals(brand, other.brand)
				&& Objects.equals(model, other.model) && number == other.number;
	}
	@Override
	public String toString() {
		return "Brand: " + this.brand + "\nModel: " + this.model + "\nNumber: " + this.number + "\nVIN: " + this.VIN + "\n";
	}
	
	public static Car[] findCar(Car[] carsForSearch, String str, int field) {
		Car[] carsForReturn = new Car[carsForSearch.length];
		if (field == 1) {
			int x = 0;
			for (Car car : carsForSearch) {
				if(car.brand.equalsIgnoreCase(str)) {
					carsForReturn[x] = car;
					x++;
				}
			}
			if(x==0) {
				return null;
			}
		}else if(field == 2) {
			int x = 0;
			for (Car car : carsForSearch) {
				if(car.model.equalsIgnoreCase(str)) {
					carsForReturn[x] = car;
					x++;
				}
			}
			if(x==0) {
				return null;
			}
		}else if(field == 3) {
			int x = 0;
			for (Car car : carsForSearch) {
				if(car.number.equalsIgnoreCase(str)) {
					carsForReturn[x] = car;
					x++;
				}
			}
			if(x==0) {
				return null;
			}
		}else if(field == 4) {
			int x = 0;
			for (Car car : carsForSearch) {
				if(car.VIN.equalsIgnoreCase(str)) {
					carsForReturn[x] = car;
					x++;
				}
			}
			if(x==0) {
				return null;
			}
		}
		return carsForReturn;
	}
	
}
