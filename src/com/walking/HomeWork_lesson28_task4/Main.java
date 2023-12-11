package com.walking.HomeWork_lesson28_task4;

public class Main {

	public static void main(String[] args){
		
		MyStack<Integer> st = new MyStack<>();
		st.add(5);
		st.add(5);
		st.add(7);
		st.add(6);
		System.out.println(st.print());
		try {
			st.delete(5);
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println(st.print());


	}

}
