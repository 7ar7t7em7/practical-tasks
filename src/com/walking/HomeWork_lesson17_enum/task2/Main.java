package com.walking.HomeWork_lesson17_enum.task2;

public class Main {


	
	public static void main(String[] args) {
		
		Animal[] a = {Animal.CAT, Animal.COW};
		
		soundAll(a);
		
		
	}
	
	private static void soundAll(Animal[] animals) {
		for (Animal animal : animals) {
			animal.sound();
		}
	}


}
