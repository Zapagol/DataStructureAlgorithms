package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

public class OccurenceOfInteger {
    public int occurenceOfInteger(SinglyLinkedList linkedList, int number){
        int count = 0;
        Node current = linkedList.first;
        while(current != null){
            if(current.data == number){
                count++;
            }
            current = current.next;
        }
        return count;
    }
}
