package com.zap.ds.heap;

import java.util.Arrays;

public class DynamicMaxMinHeap {
    private int length;
    private int capacity;
    private String heapType;
    private Node[] heapContainer;

    private static final int DEFAULT_CAPACITY = 10;

    /**
     *
     * @param heapType
     */
    public DynamicMaxMinHeap(String heapType){
        this.length = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.heapType = heapType;
        this.heapContainer = new Node[DEFAULT_CAPACITY];
    }

    /**
     *
     */
    public DynamicMaxMinHeap(){
        this.length = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.heapType = "max";
        this.heapContainer = new Node[DEFAULT_CAPACITY];
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void removeAll(){
        length = 0;
        heapContainer = null;
        heapContainer = new Node[capacity];
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if (capacity == length) {
            resizeHeap();
        }
        heapContainer[length] = newNode;
        hefipyUp(length, heapType);
        length++;
    }
    public int remove(){
        //get top element
        int dataToBeDeleted = heapContainer[0].getKey();
        //get last element
        int lastElement = heapContainer[length - 1].getKey();
        //Place last element into top
        heapContainer[0] = new Node(lastElement);
        // Decrease size of heap by 1
        length--;
        //Heapify the the tree now
        hepifyDown(0, heapType);

        return dataToBeDeleted;
    }
    private void resizeHeap(){
        Node[] newHeapContainer;
        newHeapContainer = Arrays.copyOf(heapContainer, capacity * 2);
        heapContainer = newHeapContainer;
        this.capacity = capacity * 2;
    }
    private void hefipyUp(int index, String heapType){
        int parentIdex = getParentIndex(index);
        Node recordToInsert = heapContainer[index];
        if(heapType.equals("max")){
            while (index > 0 && heapContainer[parentIdex].getKey() < recordToInsert.getKey()) {
                heapContainer[index] = heapContainer[parentIdex];
                index = parentIdex;
                parentIdex = getParentIndex(parentIdex);
            }
        }else{
            while (index > 0 && heapContainer[parentIdex].getKey() > recordToInsert.getKey()) {
                heapContainer[index] = heapContainer[parentIdex];
                index = parentIdex;
                parentIdex = getParentIndex(parentIdex);
            }
        }

        heapContainer[index] = recordToInsert;
    }
    private void hepifyDown(int n, String heapType){
        int max = n;
        int leftChildIndex = getLeftChildIndex(n);
        int rightChildIndex = getRightChildIndex(n);

        if(heapType.equals("max")){
            if(leftChildIndex < length && heapContainer[leftChildIndex].getKey() > heapContainer[max].getKey())
                max = leftChildIndex;
            if(rightChildIndex < length && heapContainer[rightChildIndex].getKey() > heapContainer[max].getKey())
                max = rightChildIndex;
        }else {
            if(leftChildIndex < length && heapContainer[leftChildIndex].getKey() < heapContainer[max].getKey())
                max = leftChildIndex;
            if(rightChildIndex < length && heapContainer[rightChildIndex].getKey() < heapContainer[max].getKey())
                max = rightChildIndex;
        }

        if(max != n){
            Node temp = heapContainer[n];
            heapContainer[n] = heapContainer[max];
            heapContainer[max] = temp;
            hepifyDown(max, heapType);
        }
    }
    private int getParentIndex(int index){
        return (index - 1) / 2;
    }
    private int getLeftChildIndex(int index){
        return 2 * index + 1;
    }
    private int getRightChildIndex(int index){
        return  2 * index + 2;
    }
    public void printHeap(){
        String result = "Elements : ";
        for(int i = 0; i<length; i++ ){
            if(heapContainer[i] != null) {
                result += heapContainer[i].getKey() + " ";
            }
        }
        System.out.println(result);
    }
}
