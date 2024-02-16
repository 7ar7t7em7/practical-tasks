package com.walking.HomeWork_lesson38_2;

public class Car implements Comparable<Car>{
    //    Уникальным идентификатором будет объект immutable класса CarIdentifier
    private final CarIdentifier identifier;

    private String color;
    private boolean actualTechnicalInspection;

    public Car(String number, int year, String color, boolean actualTechnicalInspection) {
        this(new CarIdentifier(number, year), color, actualTechnicalInspection);
    }

    public Car(CarIdentifier identifier, String color, boolean actualTechnicalInspection) {
        this.identifier = identifier;
        this.color = color;
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public CarIdentifier getIdentifier() {
        return identifier;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActualTechnicalInspection() {
        return actualTechnicalInspection;
    }

    public void setActualTechnicalInspection(boolean actualTechnicalInspection) {
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    @Override
    public String toString() {
//        Метод formatted() у String позволяет создать строку с использованием спецификаторов
//        (как в System.out.printf()). До Java 15 вместо него использовался статический метод String.format().
//        Здесь он использован для большей наглядности кода, менее красиво, но с тем же успехом,
//        можно было обойтись обычной конкатенацией строк
        return "number: %s		year: %d		color: %s		actualTechnicalInspection: %s\n".formatted(
                identifier.getNumber(), identifier.getYear(), color,
                actualTechnicalInspection ? "actual" : "not actual");
    }

	@Override
	public int compareTo(Car o) {
		//если номера авто совпали, тогда сравниваем года
		if(identifier.getNumber().equals(o.identifier.getNumber())) {
			if(identifier.getYear() > o.identifier.getYear()) {return 1;}
			else if(identifier.getYear() < o.identifier.getYear()) {return -1;}
			else {return 0;}
		}
		//если номера авто разные, то сравниваем по ним
		return identifier.getNumber().compareTo(o.identifier.getNumber());
	}
}
