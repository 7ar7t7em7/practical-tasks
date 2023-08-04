package com.walking.HomeWork_lesson19_Object;

import java.util.Objects;

public class Car {
	private final 	String 	brand;
	private final 	String	model;
	private final 	String	VIN;
	private 		int 	number;
	
	
	Car(String brand, String model, int number, String vin){
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
	
	
}
