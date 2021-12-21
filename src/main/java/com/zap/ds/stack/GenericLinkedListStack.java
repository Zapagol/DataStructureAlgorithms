package com.zap.ds.stack;

import com.zap.ds.linkedlist.GenericNode;

public class GenericLinkedListStack<E> {

    private int length;
    private GenericNode top;

    public GenericLinkedListStack(){
        length = 0;
        top = null;
    }

    public void push(E data){
        GenericNode newNode = new GenericNode();
        newNode.data = data;
        newNode.next = top;
        top = newNode;
        length++;
    }
    public boolean isEmpty(){
        return top == null;
    }

    public GenericNode pop() throws Exception{
        GenericNode node = top;
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        top = node.next;
        node.next = null;

        length--;

        return node;
    }
    public GenericNode peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return top;
    }

    public int size(){
        return length;
    }

    public String toString(){
        String result = "";
        GenericNode current = top;
        while (current != null){
            result = result + current.data + " ";
            current = current.next;
        }
        return result;
    }
}
