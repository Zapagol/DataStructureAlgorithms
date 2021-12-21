package com.zap.ds.linkedlist.main;

import com.zap.ds.linkedlist.Node;

public class NodeMain {

    public static void main(String[] args){
        Node node1 = new Node(5);

        Node node2 = new Node(7);

        Node node3 = new Node(9);

        node1.next = node2;
        node2.next = node3;

        System.out.println(length(node1));
        System.out.println(length(node2));
        System.out.println(length(node3));

    }

    public static int length(Node node){
        int size = 0;
        while(node != null){
            size++;
            node = node.next;
        }
        return size;
    }
}
