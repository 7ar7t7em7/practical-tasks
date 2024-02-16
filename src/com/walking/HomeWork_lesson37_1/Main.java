package com.walking.HomeWork_lesson37_1;

public class Main {
		
	public static final String waterCounterName = "Water counter";
	public static final String lightCounterName = "Light counter";
	public static final String gasCounterName = "Gas counter";
		
	public static void main(String[] args) {

		CounterService cs =  initializeCounters();
		cs.printCounters();
		
		cs.setMeters(waterCounterName, 20);
		
		cs.printCounters();
		
	}

	private static CounterService initializeCounters() {
		CounterService cs = new CounterService();
		Counter waterCounter = new Counter(waterCounterName, 18);
		Counter gasCounter = new Counter(gasCounterName, 15);
		Counter lightCounter = new Counter(lightCounterName, 500);
		
		cs.addCounter(waterCounter);
		cs.addCounter(gasCounter);
		cs.addCounter(lightCounter);
		
		return cs;
	}

}
