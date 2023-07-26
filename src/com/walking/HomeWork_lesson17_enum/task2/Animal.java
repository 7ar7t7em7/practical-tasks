package com.walking.HomeWork_lesson17_enum.task2;

public enum Animal {
	DOG("woof"), CAT("meow"), COW("moo");
	
	private final String sound;
	
	Animal(String str){
		this.sound = str;
	}
	
	void sound() {
		System.out.println(sound);
	}
}
