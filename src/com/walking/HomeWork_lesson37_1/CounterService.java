package com.walking.HomeWork_lesson37_1;

//import java.util.ArrayList;
import java.util.Vector;

public class CounterService {
	
	private Vector<Counter> counters;
	
	CounterService(){
		this.counters = new Vector<>(10);
	}
	
	//добавление счетчика
	public void addCounter(Counter c) {
		counters.add(c);
	}

	//удаление счетчика
	public void deleteCounter(Counter c) {
		if (counters.contains(c)) {
			counters.remove(c);
		}
		else {throw new CounterNotFoundException("No such counter!");}
	}
	
	//показания всех счетчиков
	void printCounters(){
		if(counters.size() > 0) {
			for (Counter counter : counters) {
				System.out.println(counter.toString());
			}
		}
		else {System.out.println("No counters available!");}
	}
	
	//показания одного счетчика
	public int metersReading(Counter c) {
		int mr;
		if (counters.contains(c)) {
			mr = c.getValue();
		}
		else {throw new CounterNotFoundException("No such counter!");}
		return mr;
	}
	
	//установить показания одного счетчика
	public void setMeters(String name, int newMeters) {
		Counter c = this.findCounter(name);
		if (c != null) {
			c.setValue(newMeters);
		}
		else {throw new CounterNotFoundException("No such counter!");}
	}
	
	//поиск необходимого счетчика по имени
	//возвращает ссылку на него
	public Counter findCounter(String name) {
		for (Counter c : counters) {
			if(c.getName().equals(name)) {return c;}
		}
		return null;
	}
		
}
