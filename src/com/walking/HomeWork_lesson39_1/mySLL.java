package com.walking.HomeWork_lesson39_1;

public class mySLL<T> {
	private Node<T>	head;
	//private Node<T>	tail;
	private int 	size;
	
//	public void setNode(Node node) {}
	public Node<T> getHead() {return head;}
	public void setHead(Node<T> node) {this.head = node;}
	//public Node<T> getTail() {return tail;}
	//public void setTail(Node<T> tail) {this.tail = tail;}
	
	mySLL(){
		//tail = new Node<T>(null);
		head = new Node<T>(null);
		//tail.setNext(null);
		//head.setNext(tail);
		size = 0;
	}
	
	int size() {return size;}
	
	boolean has(T t) {
		Node<T> node = head.getNext();
		while (node.getNext()!=null) {
			if(node.getValue() == t) {return true;}
			node = node.getNext();
		}
		
		return false;
	}
	
	void printSLL() {
			Node<T> node = head.getNext();
			while (node.getNext()!=null) {
				System.out.println(node.getValue());
				node = node.getNext();
			}
	}
	
	
	void add(T t){
		size++;
		Node<T> newNode = new Node<>(t);
//		if(head.getNext() == tail) {
//			newNode.setNext(tail);
//			head.setNext(newNode);}
//		else {
//			newNode.setNext(head.getNext());
//			head.setNext(newNode);
//		}
		
		
	}

	
}
