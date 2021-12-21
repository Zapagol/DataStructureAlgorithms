package com.zap.ds.linkedlist;

import com.zap.ds.linkedlist.puzzles.FindMiddleElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMiddleElementTest {

    FindMiddleElement middleElement = new FindMiddleElement();
    SinglyLinkedList linkedList = new SinglyLinkedList();

    @Test
    void findMiddleElementSpec(){
        linkedList.insertFirst(5);
        linkedList.insertFirst(10);
        linkedList.insertFirst(15);
        linkedList.insertFirst(20);
        linkedList.insertFirst(40);

        Node node = middleElement.findMiddleElement(linkedList);

        Assertions.assertEquals(15, node.data);
    }
}
