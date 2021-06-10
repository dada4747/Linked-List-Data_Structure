package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    @Test
    public void givenNumber_whenLinked_shouldReturnTrue(){
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<>(30);
        firstNode.setNext(secondNode);
        Node<Integer> thirdNode = new Node<>(70);
        secondNode.setNext(thirdNode);
        boolean res = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void given3Numbers_whenAdded_toLinkedListShouldAdded(){
        Node<Integer> firstNode = new Node<Integer>(70);
        NewLinkList linkList = new NewLinkList();
        linkList.add(firstNode);
        Node<Integer> secondNode = new Node<Integer>(30);
        linkList.add(secondNode);
        Node<Integer> thirdNode = new Node<Integer>(56);
        linkList.add(thirdNode);
        linkList.printNodes();
        boolean re = linkList.head.equals(thirdNode) && linkList.head.getNext().equals(secondNode) &&
                linkList.tail.equals(firstNode);
        Assertions.assertTrue(re);

        }
}
