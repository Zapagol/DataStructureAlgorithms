package com.zap.ds.linkedlist.puzzles;

public class SortLLOf0s1s2s {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Sort a linked list of 0s, 1s and 2s
    // by changing pointers.
    public static Node sortList(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        // Create three dummy nodes to point to
        // beginning of three linked lists. These
        // dummy nodes are created to avoid many
        // null checks.
//        Node zeroD = new Node(0);
//        Node oneD = new Node(0);
//        Node twoD = new Node(0);

        // Initialize current pointers for three
        // lists and whole list.
        Node zero = null, one = null, two = null;
        Node zeroPointer = null;
        // Traverse list
        Node curr = head;
        while (curr != null)
        {
            if (curr.data == 0)
            {
                if(zero == null){
                    zero = new Node(0);
                    zeroPointer = zero;
                }else {
                    zero.next = new Node(0);
                    //zero = zero.next;

                }
                curr = curr.next;
            }
            else if (curr.data == 1)
            {
                if(one == null){
                    one = new Node(1);
                }else {
                    one.next = new Node(1);
                    one = one.next;
                }
                curr = curr.next;
            }
            else
            {
                if(two == null){
                    two = new Node(2);
                }else {
                    two.next = new Node(2);
                    two = two.next;
                }
                curr = curr.next;
            }
        }
//        if(one != null){
//            one.next = two;
//        }
//        if(two != null){
//            two.next = null;
//        }
        // Attach three lists
        if (zeroPointer != null){
            one.next = two;
            zeroPointer.next = one;
        }
        // Updated head
        head = zero;
        return head;
    }

    // function to create and return a node
    public static Node newNode(int data)
    {
        // allocating space
        Node newNode = new Node(data);
        newNode.next = null;
        return newNode;
    }

    /* Function to print linked list */
    public static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(0);
        System.out.println(" Linked List Before Sorting");
                printList(head);
        head = sortList(head);
        System.out.println(" \nLinked List After Sorting");
                printList(head);
    }
}
