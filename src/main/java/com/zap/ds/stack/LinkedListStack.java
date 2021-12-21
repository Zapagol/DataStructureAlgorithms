package com.zap.ds.stack;

import com.zap.ds.linkedlist.Node;

public class LinkedListStack {
    private int length;
    private Node top;

    public LinkedListStack(){
        length = 0;
        top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = top;
        top = newNode;
        length++;
    }
    public boolean isEmpty(){
        return top == null;
    }

    public int pop() throws Exception{
        Node node = top;
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        top = node.next;
        node.next = null;
        length--;
        return node.data;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return top.data;
    }

    public int size(){
        return length;
    }

    public String toString(){
        String result = "";
        Node current = top;
        while (current != null){
            result = result + current.data + " ";
            current = current.next;
        }
        return result;
    }

}
