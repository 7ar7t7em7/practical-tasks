package com.walking.HomeWork_lesson20_Exception_task3;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animals = {null,
							new Cat(),
							new Dog(),
							new Cat(),
							new Cow(),
							new Dog(),
							new Animal()
							};
		
		
		
			try {
				soundAll(animals);
			} catch (UnknownAnimalException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (ArrayValidationException e) {
				e.getMessage();
			}
		
}
	
	static void soundAll(Animal[] arr) throws ArrayValidationException, UnknownAnimalException {
		for (Animal animal : arr) {
			
			if(animal == null) {
				System.out.println("no animal");
				continue;
			}
			
			if(animal.getClass().equals(Animal.class)) {
				throw new UnknownAnimalException("exc! unknown animal");
			}
			
			System.out.println(animal.sound());
		}
	};

}
