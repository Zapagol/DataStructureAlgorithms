package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;
import com.zap.ds.linkedlist.SinglyLinkedList;

import java.util.HashMap;

public class UnionOf2LL {

    static SinglyLinkedList getUnion(Node head1, Node head2)
    {
        // HashMap that will store the
        // elements of the lists with their counts
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Node n1 = head1;
        Node n2 = head2;
        SinglyLinkedList result = new SinglyLinkedList();

        // loop inserts the elements and the count of
        // that element of list1 into the hmap
        while (n1 != null) {
            if (hmap.containsKey(n1.data)) {
                int val = hmap.get(n1.data);
                hmap.put(n1.data, val + 1);
            }
            else {
                hmap.put(n1.data, 1);
            }
            n1 = n1.next;
        }

        // loop further adds the elements of list2 with
        // their counts into the hmap
        while (n2 != null) {
            if (hmap.containsKey(n2.data)) {
                int val = hmap.get(n2.data);
                hmap.put(n2.data, val + 1);
            }
            else {
                hmap.put(n2.data, 1);
            }
            n2 = n2.next;
        }

        // Eventually add all the elements
        // into the result that are present in the hmap
        for (int a : hmap.keySet()) {
            result.insertFirst(a);
        }
        return result;
    }

    public static void main(String[] args){
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();
        SinglyLinkedList result;

        l1.insertFirst(10);
        l1.insertFirst(50);
        l1.insertFirst(30);
        l1.insertFirst(40);

        printList(l1.first);

        l2.insertFirst(15);
        l2.insertFirst(30);
        l2.insertFirst(40);

        printList(l2.first);

        result = getUnion(l1.first, l2.first);

        printList(result.first);

    }

    static void printList(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


}
