package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    @Test
    public void givenNumber_whenLinked_shouldReturnTrue(){
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        firstNode.setNext(secondNode);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        secondNode.setNext(thirdNode);
        boolean res = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(res);
    }
}
