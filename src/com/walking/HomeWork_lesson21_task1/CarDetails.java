package com.walking.HomeWork_lesson21_task1;

import java.util.Objects;

public final class CarDetails {
	private final int		hash;
	private final String 	brand;
	private final String 	model;
	private final String	VIN;
	
	public CarDetails(String brand, String model, String VIN) {
		this.hash = hashCode();
		this.brand = brand;
		this.model = model;
		this.VIN = VIN;
	}

	public int getHash() {
		return hash;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getVIN() {
		return VIN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(VIN, brand, hash, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarDetails other = (CarDetails) obj;
		return Objects.equals(VIN, other.VIN) && Objects.equals(brand, other.brand) && hash == other.hash
				&& Objects.equals(model, other.model);
	}


	
}
