package com.zap.ds.linkedlist.puzzles;

public class DeleteWithoutHeadPointer {
    static Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void printList(Node node){
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static void deleteNode(Node node){
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        System.gc();
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        DeleteWithoutHeadPointer list = new DeleteWithoutHeadPointer();
        list.head = new Node(1);
        list.head.next = new Node(12);
        list.head.next.next = new Node(1);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(1);

        System.out.println("Before Deleting ");
        list.printList(head);

        /* I m deleting the head itself.
         You can check for more cases */
        list.deleteNode(head);
        System.out.println("");
        System.out.println("After deleting ");
        list.printList(head);

        list.deleteNode(head.next);
        System.out.println("");
        System.out.println("After deleting ");
        list.printList(head);
    }
}
