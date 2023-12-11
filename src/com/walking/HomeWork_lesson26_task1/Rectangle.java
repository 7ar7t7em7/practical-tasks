package com.walking.HomeWork_lesson26_task1;

public class Rectangle {
	final StringBuilder CORNER = 				new StringBuilder(" ");
	final StringBuilder HORIZONTAL_SYMBOL = 	new StringBuilder("-");
	final StringBuilder VERTICAL_SYMBOL = 		new StringBuilder("|");
	final StringBuilder SPACE_SYMBOL = 			new StringBuilder("o");
	StringBuilder picture = new StringBuilder();
	
	Rectangle(Integer l, Integer w){
		this.picture = this.picture.append(this.drawHorizontalLine(w)).append(this.drawVerticalLine(l, w)).append(this.drawHorizontalLine(w));
	}
	
	StringBuilder drawHorizontalLine(Integer width) {
		StringBuilder sb = new StringBuilder(CORNER);
		
		for (int i = 0; i < width; i++) {
			sb.append(HORIZONTAL_SYMBOL);
		}
		
		sb.append(CORNER);
		sb.append("\n");
		
		return sb;
	}
	
	StringBuilder drawVerticalLine(Integer length, Integer width) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append(VERTICAL_SYMBOL);
			for (int j = 0; j < width; j++) {
				sb.append(SPACE_SYMBOL);
			}
			sb.append(VERTICAL_SYMBOL);
			sb.append("\n");
		}
		
		return sb;
	}
	
}
