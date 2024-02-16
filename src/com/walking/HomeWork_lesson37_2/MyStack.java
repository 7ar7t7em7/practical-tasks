package com.walking.HomeWork_lesson37_2;

import java.util.Collection;
import java.util.Iterator;

public class MyStack<E> implements Collection<E>{
	private E[] elements;
	E top;
	int mySize;
		
	@SuppressWarnings("unchecked")
	public MyStack() {
		top = null;
		mySize = 0;
		elements = (E[]) new Object[2];
	}

	@Override
	public int size() {return mySize;}

	@Override
	public boolean isEmpty() {
		if(mySize == 0) {return true;}
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for (E e : elements) {
			if(e == o) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		Object[] objs = new Object[this.elements.length];
		int i = 0;
		for (E e : elements) {
			objs[i] = e;
			i++;
		}
		
		return objs;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		if(mySize >= this.elements.length) {
			growMyStack();
			elements[mySize] = e;
			top = e;
			mySize++;
			return true;
		}else {elements[mySize] = e;
				top = e;
				mySize++;
				return true;}
		
	}

	@Override
	public boolean remove(Object o) {
		if(this.contains(o)) {
			int i = 0;
			for (E e : elements) {
				if(e == o) {
					mySize--;
					continue;
				}
			elements[i] = e;
			top = elements[mySize-1];
			i++;
			}
			return true;
		}else {return false;}
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		for (int i = 0; i < elements.length; i++) {
			elements[i] = null;
		}
		this.mySize = 0;
		this.top = null;
	}
	
	public void growMyStack() {
		mySize = 0;
		E[] newArr = (E[]) new Object[elements.length * 2];
		for (E e : elements) {
			newArr[mySize] = e;
			mySize++;
		}
		this.elements = newArr;
	}
}
