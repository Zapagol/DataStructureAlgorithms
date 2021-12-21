package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

/**
 * You can add two numbers represented using LinkedLists in the same way you add two numbers by hand.
 *
 * Iterate over the linked lists, add their corresponding elements, keep a carry just the way you do while adding
 * numbers by hand, add the carry-over from the previous addition to the current sum
 */
public class AddTwoNumbersUsingLL {

    static SinglyLinkedList addNumbers(Node head1, Node head2){
        SinglyLinkedList result = new SinglyLinkedList();
        int carry = 0;

        while (head1 != null || head2 != null){
            int sum = 0;

            if(head1 != null){
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2 != null){
                sum += head2.data;
                head2 = head2.next;
            }

            sum += carry;

            int value = sum % 10;
            carry = sum / 10;
            result.insertFirst(value);
        }
        if(carry > 0) {
            result.insertFirst(carry);
        }

        return result;
    }

    public static void main(String[] args){
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();

        l1.insertFirst(6);
        l1.insertFirst(4);
        l1.insertFirst(9);
        l1.insertFirst(5);
        l1.insertFirst(7);

        //l2.insertFirst(2);
        l2.insertFirst(4);
        l2.insertFirst(8);

        SinglyLinkedList result = addNumbers(l1.first, l2.first);

        result.display();
    }
}
