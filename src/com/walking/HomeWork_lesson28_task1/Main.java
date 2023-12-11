package com.walking.HomeWork_lesson28_task1;

/*
	 * Создать обобщенный тип, принимающий в себя любого из наследников Number. 
	 * Создать метод, возводящий значение параметризованного типа в степень, 
	 * переданную параметром в метод.
 * */

public class Main {

	public static void main(String[] args) {
		MyNumber<Byte> mnByte = new MyNumber<>((byte)5);
		System.out.println(mnByte.makePow(2));
		
		MyNumber<Short> mnShort = new MyNumber<>((short)2);
		System.out.println(mnShort.makePow(2));
	}

}
