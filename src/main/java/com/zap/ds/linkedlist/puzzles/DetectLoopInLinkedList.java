package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

import java.util.HashSet;

/**
 * There are many ways to detect loop in linked list.
 *
 *  1. Use Hashing
 *  2. Using Floyds cycle finding algorithm
 */
public class DetectLoopInLinkedList {

    /**
     * Using Floyds cycle finding algorithm
     *
     * 1. Traverse linked list using two pointers.
     * 2. Move one pointer(slow_p) by one and another pointer(fast_p) by two.
     * 3. If these pointers meet at the same node then there is a loop. If pointers do not
     * meet then linked list doesn’t have a loop
     *
     * @param linkedList
     * @return
     */
    public Boolean hasLoop(SinglyLinkedList linkedList){

        Node slowPtr = linkedList.first;
        Node fastPtr = linkedList.first;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr){
                return true;
            }
        }
        return false;
    }

    /**
     * Using hashSet
     *
     * @param linkedList
     * @return
     */
    public Boolean detectLoop(SinglyLinkedList linkedList){

        Node ptr = linkedList.first;
        HashSet set = new HashSet();
        while (ptr != null && ptr.next != null){
            if(set.contains(ptr.data)){
                return true;
            }
            set.add(ptr.data);
            ptr = ptr.next;
        }
        return false;
    }
}
