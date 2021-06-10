package com.bridgelabz;

public class NewLinkList<K> {
    public INode head;
    public INode tail;

    public NewLinkList() {
        this.head = head;
        this.tail = tail;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }

    }
    public void append(INode newNode){
        if(this.head == null) {
            this.head = newNode;
        }if(this.tail == null) {
            this.tail = newNode;
        }else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode node, INode newNode) {
        INode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    public boolean search(K key) {
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if(tempNode.getNext().getKey().equals(key)){
                return true;
            }
        }
        return false;
    }


    public void printNodes() {
        StringBuffer nodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            nodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) nodes.append("-->");
            tempNode = tempNode.getNext();
        }
        nodes.append(tempNode.getKey());
        System.out.println(nodes);
    }


}
