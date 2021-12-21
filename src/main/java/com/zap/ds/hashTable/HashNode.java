package com.zap.ds.hashTable;

public class HashNode {
    public KeyValueBean data;
    public HashNode next;

    public HashNode(KeyValueBean data){
        this.data = data;
        this.next = null;
    }
}
