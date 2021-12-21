package com.zap.ds.hashTable;

public class GenericHashNode {
    public Entry data;
    public GenericHashNode next;

    public GenericHashNode(Entry data){
        this.data = data;
        this.next = null;
    }
}
