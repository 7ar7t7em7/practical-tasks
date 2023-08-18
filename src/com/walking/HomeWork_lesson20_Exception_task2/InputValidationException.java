package com.walking.HomeWork_lesson20_Exception_task2;

public class InputValidationException extends Exception{

	private static final long serialVersionUID = 1L;
	
	InputValidationException(String message){
		super(message);
	}
	
}