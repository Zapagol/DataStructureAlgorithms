package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

public class StartNodeOfLoopInLL {

    public Node findStartNodeofLoop(SinglyLinkedList linkedList){
        Node slowPtr = linkedList.first;
        Node fastPtr = linkedList.first;
        Boolean loopExists = false;
        while (fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                loopExists = true;
                break;
            }
        }
        if(loopExists){
            slowPtr = linkedList.first;
            while (slowPtr != fastPtr){
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
        }else {
            slowPtr = null;
        }
        return slowPtr;
    }
}
