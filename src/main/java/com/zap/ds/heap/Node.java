package com.zap.ds.heap;

public class Node {
    private int key;
    //Constructor
    public Node(int data){
        this.key = data;
    }
    //Setter and Getter
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
