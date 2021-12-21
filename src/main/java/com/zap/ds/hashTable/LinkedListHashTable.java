package com.zap.ds.hashTable;

import java.util.NoSuchElementException;

public class LinkedListHashTable {
    private int arraySize;

    private int length;
    private HashNode[] hashTableContainer;

    public LinkedListHashTable(int initialCapacity){
        this.arraySize = initialCapacity;
        this.length = 0;
        this.hashTableContainer = new HashNode[initialCapacity];
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void put(String key, String value) {
        int hashedKey = findHashkey(key);
        HashNode newHashNode = new HashNode(new KeyValueBean(key, value));
        if(hashTableContainer[hashedKey] == null){
            hashTableContainer[hashedKey] = newHashNode;
        }else{
            newHashNode.next = hashTableContainer[hashedKey];
            hashTableContainer[hashedKey] = newHashNode;
        }
        length++;
    }
    public String get(String key){
        int hashedKey = findHashkey(key);
        HashNode hashNode = hashTableContainer[hashedKey];
        if(hashNode == null){
            throw new NullPointerException("Sorry there is no value for the kaey : " + key);
        }else {
            while (hashNode.next != null) {
                if (hashNode.data.key.equals(key)) {
                    return hashNode.data.value;
                }
                hashNode = hashNode.next;
            }
        }
        return hashNode.data.value;
    }
    public void remove(String key){
        int pos = findHashkey(key);
        HashNode start = hashTableContainer[pos];
        HashNode end = start;
        if (start == null){
            throw new NoSuchElementException("Not valid Key = " + key);
        }
        if (start.data.key.equals(key))
        {
            length--;
            hashTableContainer[pos] = start.next;
            return;
        }
        while (end.next != null && !end.next.data.key.equals(key)){
            end = end.next;
        }
        length--;
        end.next = end.next.next;
    }
    public boolean containsKey(String key){
        int hashedKey = findHashkey(key);
        HashNode hashNode = hashTableContainer[hashedKey];
        if(hashNode != null){
            //Check for first element of LinkedList
            if (hashNode.data.key.equals(key))
            {
                return true;
            }
            //Remaining element of linked list. Iterator LinkedList still we found matched key.
            while (hashNode.next != null && !hashNode.next.data.key.equals(key)){
                hashNode = hashNode.next;
            }
            if(hashNode.next != null){
                return true;
            }
        }

        return false;
    }
    private int findHashkey(String value){
        int hashCode = value.hashCode();
        hashCode = hashCode % arraySize;
        if(hashCode < 0){
            hashCode += arraySize;
        }
        return hashCode;
    }
    public void printHashTable ()
    {
        System.out.println();
        for (int i = 0; i < hashTableContainer.length; i++)
        {
            //System.out.print ("Bucket " + i + ":  ");
            HashNode start = hashTableContainer[i];
            while(start != null)
            {
                System.out.println("Bucket " + i + ":  " + "Key = " + start.data.key + ", Value = " + start.data.value +" ");
                start = start.next;
            }
            //System.out.println();
        }
    }

}
