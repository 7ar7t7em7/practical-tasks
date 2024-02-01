package com.walking.HomeWork_lesson32_1;

public class Car {
	private static final String CAR_SEPARATOR = "\n";
	private static final String FIELD_SEPARATOR = "~";
	
	private final String brand;
	private final String model;
	private final String number;
	private String color;
	
	Car(String brand, String model, String number, String color) {
		
		this.brand = brand;
		this.model = model;
		this.number = number;
		this.color = color;
	}
	
	String forSaving() {
		return 	this.getBrand() + FIELD_SEPARATOR + 
				this.getModel() + FIELD_SEPARATOR +
				this.getNumber() + FIELD_SEPARATOR + 
				this.getColor() + CAR_SEPARATOR;
	}
	
	@Override
	public String toString() {
		return "Car (brand=" + brand + ", model=" + model + ", number=" + number + ", color=" + color + ")" + CAR_SEPARATOR;
	}
	
	
	/*void saveCar() {
		File saveFile = new File("./resource/fileForCar.txt");

	try(	FileOutputStream fos = new FileOutputStream(saveFile, false)	){
		
		fos.write(this.forSaving().getBytes(), 0, this.forSaving().getBytes().length);
		System.out.println(this.toString() + " is saved!");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}*/

	public String getColor() {return color;}

	public void setColor(String color) {this.color = color;}

	public String getBrand() {return brand;}

	public String getModel() {return model;}

	public String getNumber() {return number;}
	
}
