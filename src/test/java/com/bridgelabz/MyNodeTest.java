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
    @Test
    public void given3Numbers_WhenAppendedToLinkedList_should_BeAddedToLinkedList() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        NewLinkList linkedList = new NewLinkList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNodes();
        boolean res = linkedList.head.equals(firstNode) && linkedList.head.getNext().equals(secondNode) && linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void given3Numbers_WhenInsertedToLinkedList_ShouldBeAddedInBetween() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        NewLinkList linkedList = new NewLinkList();
        linkedList.add(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode, secondNode);
        boolean res = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void Given3Numbers_WhenDeleted_ToLinkedListShould_Become2_Numbers() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        NewLinkList linkedList = new NewLinkList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.pop();
        linkedList.printNodes();
        boolean res = linkedList.head.equals(secondNode) &&
                linkedList.head.getNext().equals(thirdNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void given3Numbers_WhenDeletedLastNumberFromLinkedList_shouldBecome2_Numbers() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        NewLinkList linkedList = new NewLinkList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.popLast();
        boolean res = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode);
        Assertions.assertTrue(res);
    }
    @Test
    public void given3Numbers_WhenSearchAnyNumber_shouldReturnTrue() {
        Node<Integer> firstNode = new Node<Integer>(56);
        Node<Integer> secondNode = new Node<Integer>(30);
        Node<Integer> thirdNode = new Node<Integer>(70);
        NewLinkList linkedList = new NewLinkList();
        linkedList.add(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        boolean res = linkedList.search(30);
        Assertions.assertTrue(res);
    }
}
