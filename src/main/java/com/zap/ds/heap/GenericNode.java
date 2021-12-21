package com.zap.ds.heap;

public class GenericNode<E> {
    private E key;
    //Constructor
    public GenericNode(E data){
        this.key = data;
    }
    //Setter and Getter
    public Object getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }
}
