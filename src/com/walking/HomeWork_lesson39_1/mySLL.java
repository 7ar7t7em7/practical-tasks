package com.walking.HomeWork_lesson39_1;

import java.util.ArrayList;

public class mySLL<T> {
	private Node<T> head;
	private int size;

	private Node<T> 	getHead() {return head;}
	private void 	setHead(Node<T> node) {this.head = node;}


	mySLL() {
		size = 0;
	}

	int size() {
		return size;
	}
	
	void printSLL() {
		Node<T> node = head;
		System.out.println(node);
		while (node.getPrev() != null) {
			node = node.getPrev();
			System.out.println(node);

		}
	}

	void delete(T t) {
		Node<T> nodeForDelete = new Node<>(t);
		Node<T> node = head;
		if (nodeForDelete.equals(node)) {
			head = head.getPrev();
			size--;
		} else {
			while (node.getPrev()!=null) {
				if (node.getPrev().equals(nodeForDelete)) {
					node.setPrev(node.getPrev().getPrev());
					size--;
					break;
				}
				node = node.getPrev();
			}
		}
	}
	
	void printSLL_With_Hash() {
		Node<T> node = head;
		System.out.println("\"" + node + "\"" +", hash = " + node.hashCode());
		while (node.getPrev() != null) {
			node = node.getPrev();
			System.out.println("\"" + node + "\"" +", hash = " + node.hashCode());

		}
	}

	void add(T t) {
		Node<T> newNode = new Node<>(t);
		if (size == 0) {
			head = newNode;
		} else {
			Node<T> prev = head;
			head = newNode;
			head.setPrev(prev);
		}
		size++;
	}

	void reverse() {
		ArrayList<Node<T>> arr = new ArrayList<>(size);
		Node<T> node = head;
		arr.add(node);
		while (node.getPrev() != null) {
			node = node.getPrev();
			arr.add(node);
		}
		setHead(null);
		size = 0;
		System.out.println(arr);
		for(int i = 0; i < arr.size(); i++) {
			add(arr.get(i).getValue());
		}
	}

}
