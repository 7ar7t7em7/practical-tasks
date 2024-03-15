package com.walking.HomeWork_lesson39_1;

import java.util.Objects;

public class Node<N> {
	private N node;
	private Node<N> prev;
	
	Node(N n){
		this.node = n;
	}

	public N getValue() {return node;}
	public Node<N> getPrev() {return prev;}
	public void setNode(N node) {this.node = node;}
	public void setPrev(Node<N> next) {this.prev = next;}
	
	boolean hasPrev() {return prev != null;}
	
	@Override
	public int hashCode() {
		return Objects.hash(node);
	}
	
	@Override
	public String toString() {return node.toString();}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node<?> other = (Node<?>) obj;
		return Objects.equals(node, other.node);
	}
	
	
}
