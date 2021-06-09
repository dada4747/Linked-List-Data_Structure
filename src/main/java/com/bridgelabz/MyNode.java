package com.bridgelabz;

public class MyNode<K> {
    private MyNode next;
    private K key;
    public MyNode(K key) {
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
