package com.walking.HomeWork_lesson28_task3.Model;

import java.util.Objects;

import com.walking.HomeWork_lesson28_task3.Exception.ExceptionOfNotFoundElementInMyArray;

public class MyArray<E> {
	E[] e;
	
	MyArray(E[] arr){
		this.e = arr;
	}
	
	public E search(E searchIt) throws ExceptionOfNotFoundElementInMyArray {
		for (E el : e) {
			if(Objects.equals(el, searchIt)){
				return el;
			}
		}
		throw new ExceptionOfNotFoundElementInMyArray("No such element");
	}
	
}
