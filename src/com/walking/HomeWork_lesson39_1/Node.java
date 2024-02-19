package com.walking.HomeWork_lesson39_1;

public class Node<N> {
	private N n;
	private Node<N> next;
	
	public N 		getValue() 					{return n;}
	public Node<N> 	getNext()	 				{return next;}
	public void 	setValue(N n)	 			{this.n = n;}
	public void 	setNext(Node<N> next) 		{this.next = next;}
	
	Node(N n){this.n = n;}
	
	boolean hasNext() {
		return next != null;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + 1;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
