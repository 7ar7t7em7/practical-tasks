package com.walking.lesson39_queue1.task2.collection;

import com.walking.HomeWork_lesson39_1_new_model.mySinglyLinkedList;

public class Stack<E> {
    private final mySinglyLinkedList<E> list = new mySinglyLinkedList<>();

    public void push(E e) {
        list.add(e);
    }

    public E pop() {
        E result = list.getHead();
        list.remove(result);

        return result;
    }
}
