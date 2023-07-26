package com.walking.HomeWork_lesson17_enum.task1;

public enum Question {
	HI("Hi", "Hello"), 
	BYE("Bye", "Good Bye"), 
	HOWAREYOU("How are you", "How are your doing"), 
	UNKNOWN(null, "I don't uderstand"),;
	
	final String question;
	final String answer;
	Question(String question, String answer){
		this.question = question;
		this.answer = answer;
	};
	
	@Override
	public String toString() {
		return answer;
	}
}
