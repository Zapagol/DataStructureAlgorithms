package com.zap.ds.linkedlist;

public class GenericNode<E> {

    public E data;
    public GenericNode next = null;

    public void displayNode(){
        System.out.print(data + " ");
    }
}
