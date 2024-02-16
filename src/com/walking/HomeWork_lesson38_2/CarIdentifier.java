package com.walking.HomeWork_lesson38_2;

import java.util.Objects;

public final class CarIdentifier implements Comparable<CarIdentifier>{
    private final String number;
    private final int year;

    public CarIdentifier(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !getClass().equals(o.getClass())) {
            return false;
        }

        CarIdentifier identifier = (CarIdentifier) o;

//        Класс Objects содержит множество методов для работы с объектами.
//        equals(), hashcode(), проверки на null, сравнения и пр.
//        Удобен в тех случаях, когда мы не уверены, что значение (или хотя бы одно из значений)
//        не равно null
        return year == identifier.year && Objects.equals(number, identifier.number);
    }

    @Override
    public int hashCode() {
        int hashcode = number.hashCode();
        hashcode += 31 * year;

        return hashcode;
    }

//	@Override
//	public int compare(CarIdentifier o1, CarIdentifier o2) {
//		//если номера авто совпали, тогда сравниваем года
//		if(o1.getNumber().equals(o2.getNumber())) {
//			if(o1.getYear() > o2.getYear()) {return 1;}
//			else if(o1.getYear() < o2.getYear()) {return -1;}
//			else {return 0;}
//		}
//		//если номера авто разные, то сравниваем по ним
//		return o1.getNumber().compareTo(o2.getNumber());
//	}

	@Override
	public int compareTo(CarIdentifier o) {
		//если номера авто совпали, тогда сравниваем года
		if(this.getNumber().equals(o.getNumber())) {
			if(this.getYear() > o.getYear()) {return 1;}
			else if(this.getYear() < o.getYear()) {return -1;}
			else {return 0;}
		}
		//если номера авто разные, то сравниваем по ним
		return this.getNumber().compareTo(o.getNumber());
	}

}
