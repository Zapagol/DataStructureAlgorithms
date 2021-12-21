package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

public class MergeTwoSortedLL {
    public static void main(String[] args){
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.insertFirst(5);
        linkedList1.insertFirst(15);
        linkedList1.insertFirst(20);

        SinglyLinkedList linkedList2 = new SinglyLinkedList();
        linkedList2.insertFirst(40);
        linkedList2.insertFirst(30);
        //linkedList.insertFirst(100);
        mergeTwoLL(linkedList1, linkedList2);
    }

    static void mergeTwoLL(SinglyLinkedList head1, SinglyLinkedList head2){
        Node temp = head1.first;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head2.first;
        //return head1;
        head1.display();
    }
}
