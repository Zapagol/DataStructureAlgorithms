package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

/**
 * - Have three nodes i.e previousNode,currentNode and nextNode
 * - When currentNode is starting node, then previousNode will be null
 * - Assign currentNode.next to previousNode to reverse the link.
 * - In each iteration move currentNode and previousNode by  1 node.
 */
public class ReverseLinkedList {

    public SinglyLinkedList reverse(SinglyLinkedList linkedList){
        Node prev = null;
        Node current = linkedList.first;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        linkedList.first = prev;
        return linkedList;
    }
}
