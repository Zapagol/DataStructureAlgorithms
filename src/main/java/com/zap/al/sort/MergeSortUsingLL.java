package com.zap.al.sort;

import com.zap.ds.linkedlist.Node;

public class MergeSortUsingLL {

    Node mergeSort(Node h){
        // Base case : if head is null
        if (h == null || h.next == null) {
            return h;
        }

        // get the middle of the list
        Node middle = getMiddle(h);
        Node nextofmiddle = middle.next;

        // set the next of middle node to null
        middle.next = null;

        // Apply mergeSort on left list
        Node left = mergeSort(h);

        // Apply mergeSort on right list
        Node right = mergeSort(nextofmiddle);

        // Merge the left and right lists
        Node sortedlist = merge(left, right);
        return sortedlist;
    }
    Node merge(Node a, Node b){
        Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = merge(a.next, b);
        }
        else {
            result = b;
            result.next = merge(a, b.next);
        }
        return result;
    }

    // Utility function to get the middle of the linked list
    public static Node getMiddle(Node head)
    {
        if (head == null)
            return head;

        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
