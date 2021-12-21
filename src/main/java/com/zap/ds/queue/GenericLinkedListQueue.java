package com.zap.ds.queue;

import com.zap.ds.linkedlist.GenericNode;

public class GenericLinkedListQueue<E> {
    private int size;
    private GenericNode front;
    private GenericNode rear;

    public GenericLinkedListQueue(){
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void enQueue(E data){
        GenericNode newNode = new GenericNode();
        newNode.data = data;
        if(isEmpty()){
            front = newNode;
        }else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }
    public Object deQueue() throws Exception{
        GenericNode temp = front;
        Object data = temp.data;
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        front = temp.next;
        size--;
        return data;
    }
    public Object first() throws Exception{
        GenericNode current = front;
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return current.data;
    }
    public Object last(){
        GenericNode temp = rear;
        return temp.data;
    }
    public void display(){
        System.out.print("Elements in Queue : ");
        GenericNode current = front;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
