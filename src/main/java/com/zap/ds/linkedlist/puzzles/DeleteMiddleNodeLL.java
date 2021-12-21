package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

public class DeleteMiddleNodeLL {

    // Deletes middle node and returns
// head of the modified list
    static Node deleteMid(SinglyLinkedList linkedList)
    {
        // Base cases
        if (linkedList.first == null)
            return null;
        if (linkedList.first.next == null)
        {
            return null;
        }

        // Initialize slow and fast pointers to reach
        // middle of linked list
        Node slow_ptr = linkedList.first;
        Node fast_ptr = linkedList.first;

        // Find the middle and previous of middle.
        Node prev = null;

        // To store previous of slow_ptr
        while (fast_ptr != null && fast_ptr.next != null)
        {
            fast_ptr = fast_ptr.next.next;
            prev = slow_ptr;
            slow_ptr = slow_ptr.next;
        }

        //Delete the middle node
        prev.next = slow_ptr.next;

        return linkedList.first;
    }
}
