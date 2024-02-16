package com.walking.HomeWork_lesson39_1;

public class Node<N> {
	private N node;
	private Node next;
	
	Node(N n){
		this.node = n;
	}

	public N getNode() {return node;}
	public Node getNext() {return next;}
	public void setNode(N node) {this.node = node;}
	public void setNext(Node next) {this.next = next;}
	
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
