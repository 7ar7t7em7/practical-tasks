package com.walking.HomeWork_lesson20_Exception;

import java.util.Objects;

public class MyFyle {
	private final 	FyleType 	fyleType;
	private 		String 		name;
	private			int			size;
	
	MyFyle(FyleType ft, String name, int size){
		this.fyleType = ft;
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return "MyFyle [fyleType=" + fyleType + ", name=" + name + ", size=" + size + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(fyleType, name, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyFyle other = (MyFyle) obj;
		return fyleType == other.fyleType && Objects.equals(name, other.name) && size == other.size;
	}
	
	static MyFyle findFyle(MyFyle[] ArrayOfFyles, String searchingName) throws FNFException{
		for(int i = 0; i < ArrayOfFyles.length; i++) {
			if(ArrayOfFyles[i].name.equals(searchingName)) {
				return ArrayOfFyles[i];
			}
		}
		throw new FNFException("Exc!\nNo such file");
	}
	
	MyFyle findFyleToString(MyFyle[] ArrayOfFyles, String searchingName){
		for(int i = 0; i < ArrayOfFyles.length; i++) {
			if(ArrayOfFyles[i].name.equals(searchingName)) {
				return ArrayOfFyles[i];
			}
		}
		return null;
	}
	
}
