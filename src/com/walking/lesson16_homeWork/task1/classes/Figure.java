package com.walking.lesson16_homeWork.task1.classes;

public abstract class Figure {
	
	public abstract String createFigure();
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
}
