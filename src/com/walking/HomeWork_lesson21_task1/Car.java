package com.walking.HomeWork_lesson21_task1;

import java.util.Objects;

public class Car {
	private final	int			hash;
	private final 	CarDetails 	carDetails;
	private 		String 		number;
	
	Car(String brand, String model, String number, String VIN){
		this.hash = hashCode();
		this.carDetails =  new CarDetails(brand, model, VIN);
		this.number = number;
	}

	@Override
	public String toString() {
		return "Brand: " + this.carDetails.getBrand() + "\nModel: " + this.carDetails.getModel() + "\nNumber: " + this.number + "\nVIN: " + this.carDetails.getVIN() + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(carDetails, hash, number);
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
		return Objects.equals(carDetails, other.carDetails) && hash == other.hash
				&& Objects.equals(number, other.number);
	}


	
}
