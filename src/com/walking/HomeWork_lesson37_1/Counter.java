package com.walking.HomeWork_lesson37_1;

public class Counter {
	private final String COUNTER_NAME;
	private int value;
	
	Counter(String name){
		this.COUNTER_NAME = name;
		this.value = 0;
	}
	
	Counter(String name, int value){
		this.COUNTER_NAME = name;
		this.value = value;
	}
	
	public String toString() {
		return this.COUNTER_NAME + " = " + this.value;
	}
	
	public String getName() {return this.COUNTER_NAME;}
	
	public void setValue(int value) {this.value = value;}
	
	public int getValue() {return this.value;}
	
	
	//проверка только по имени
	@Override
	public boolean equals(Object o) {
		if(this.getClass() != o.getClass()) {return false;}
		boolean result = false;
		Counter c = (Counter) o;
		if (this.COUNTER_NAME.equals(c.getName())) {return true;}
		return result;
	}
	
}
