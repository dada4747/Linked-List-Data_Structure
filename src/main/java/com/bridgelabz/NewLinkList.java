package com.bridgelabz;

public class NewLinkList {
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
