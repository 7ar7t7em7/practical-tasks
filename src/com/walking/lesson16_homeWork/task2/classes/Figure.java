package com.walking.lesson16_homeWork.task2.classes;

public class Figure implements Drawable{
	
	public static final String EMPTY_ELEMENT = " ";
    public static final String EMPTY_STRING = "";
    public static final char NEW_LINE_SYMBOL = '\n';

    protected final int length;

    protected Figure(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

	@Override
	public String drawFigure() {
		return "Unknown shape";
	}
}
