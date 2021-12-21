package com.zap.ds.queue;

import com.zap.ds.linkedlist.Node;

public class LinkedListQueue {
    private int size;
    private Node front;
    private Node rear;

    public LinkedListQueue(){
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void enQueue(int data){
        // Create new Node
        Node newNode = new Node(data);
        newNode.data = data;
        //If queue is empty, then new node is front and rear both.
        if(isEmpty()){
            front = rear = newNode;
        }
        // Add new node at the end of the queue.
        rear.next = newNode;
        rear = newNode;
        size++;
    }
    public int deQueue() throws Exception{
        int data;
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }else {
            Node temp = front;
            data = temp.data;
            front = temp.next;
            size--;
        }
        return data;
    }
    public int first() throws Exception{
        Node current = front;
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return current.data;
    }
    public int last(){
        Node temp = rear;
        return temp.data;
    }
    public void display(){
        System.out.print("Elements in Queue : ");
        Node current = front;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
