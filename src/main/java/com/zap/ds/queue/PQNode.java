package com.zap.ds.queue;

public class PQNode {
    public int data;
    public int priority;
    public PQNode next;

    PQNode(int data, int priority){
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}
