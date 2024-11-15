package com.walking.HomeWork_lesson20_Exception_task2_model;

public class Square implements Shape{
	public static final String RECTANGLE_HORIZONTAL_ELEMENT = "-";
    public static final String RECTANGLE_VERTICAL_ELEMENT = "|";

    private final int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String createShapeString() {
        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length);

        return horizontalLine + verticalLines + horizontalLine;
    }

    private String createHorizontalLine(int length) {
        String horizontalLine = EMPTY_ELEMENT;

        for (int i = 0; i < length; i++) {
            horizontalLine += RECTANGLE_HORIZONTAL_ELEMENT;
        }

        horizontalLine += EMPTY_ELEMENT + NEW_LINE_SYMBOL;

        return horizontalLine;
    }

    private String createVerticalLines(int length) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = EMPTY_STRING;

        for (int i = 0; i < length; i++) {
            verticalLines += verticalLinesUnit;
        }

        return verticalLines;
    }

    private String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = RECTANGLE_VERTICAL_ELEMENT;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += EMPTY_ELEMENT;
        }

        verticalLinesUnit += RECTANGLE_VERTICAL_ELEMENT + NEW_LINE_SYMBOL;

        return verticalLinesUnit;
    }
}
