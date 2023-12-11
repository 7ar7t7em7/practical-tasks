package com.walking.HomeWork_lesson28_task4;

import java.util.Objects;

public class MyStack<Q>{
	private MyNode<Q> top;
	private Integer size;
	
	public MyStack() {
		size = 0;
		top = null;
	}
	
	void add(Q q){
		if (size == 0) {
			size++;
			top = new MyNode<>(q);
		} else {
			size++;
			top = new MyNode<>(q, top);
		}
	}
	
	boolean find(Q q) {
		MyNode<Q> mn = top;
		if(Objects.equals(q, mn.t)) {
			return true;
		}
		while(mn.getPrev() != null) {
			if(Objects.equals(q, mn.t)) {
				return true;
			}
			mn = mn.getPrev();
		}
		return false;
	}
	
	Q getTop() {
		return top.t;
	}
	
	void delete(Q q) throws MyException {
		if(size == 1 && !Objects.equals(q, top.t)) {
			throw new MyException("Element not found in stack");
		}
		MyNode<Q> temp = top;
		if(Objects.equals(temp.t, q)) {
			top = top.prev;
			size--;
			return;
		}
		
		while(temp != null) {
			if(Objects.equals(temp.t, q)) {
				temp = temp.prev;
				size--;
				return;
			}
			temp = temp.getPrev();
			
		}
		
		throw new MyException("Element not found in stack");
	}
	
	String print() {
		if (size == 0) {return "empty stack";}
		if (size == 1) {return "[" + top.toString() + "]";}
		String str = "[";
		MyNode<Q> temp = this.top;
		for(int i = this.size; i > 0; i--) {
			str += temp.toString() + ", ";
			temp = temp.getPrev();
		}
		return str = str.substring(0, str.length() - 2) + "]";
	}
	
	private static class MyNode<T>{
		private T t;
		private MyNode<T> prev;
		
		MyNode(T t){
			this.t = t;
			this.prev = null;
		}
		
		public MyNode(T t, MyNode<T> n) {
			this.t = t;
			this.prev = n;
		}
		
		MyNode<T> getPrev() {
			return this.prev;
		}
		
		
		@Override
		public String toString() {
			return t.toString();
		}

		@Override
		public int hashCode() {
			return Objects.hash(prev, t);
		}

//		@Override
//		public boolean equals(Object o) {
//			if (this == t)
//				return true;
//			if (t == null)
//				return false;
//			if (getClass() != t.getClass())
//				return false;
//			return Objects.equals(this.t, o);
//		}
		
		
	}

}


