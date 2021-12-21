package com.zap.ds.heap;

public class MaxHeap {
    private Node[] heapContainer;
    private int length; // Number of elements in Heap
    private int capacity; // Size of the heap

    public MaxHeap(int heapSize){
        this.length = 0;
        this.capacity = heapSize;
        this.heapContainer = new Node[capacity];
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (capacity == length) {
            throw new ArrayStoreException("Heap is full");
        }
        heapContainer[length] = newNode;
        hefipyUp(length);
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
        hepifyDown(0);

        return dataToBeDeleted;
    }
    public void removeAll(){
        length = 0;
        heapContainer = null;
        heapContainer = new Node[capacity];
    }
    private void hepifyDown(int n){
        int max = n;
        int leftChildIndex = getLeftChildIndex(n);
        int rightChildIndex = getRightChildIndex(n);
        if(leftChildIndex < length && heapContainer[leftChildIndex].getKey() > heapContainer[max].getKey())
            max = leftChildIndex;
        if(rightChildIndex < length && heapContainer[rightChildIndex].getKey() > heapContainer[max].getKey())
            max = rightChildIndex;
        if(max != n){
            Node temp = heapContainer[n];
            heapContainer[n] = heapContainer[max];
            heapContainer[max] = temp;
            hepifyDown(max);
        }
    }

    private void hefipyUp(int index){
        int parentIdex = getParentIndex(index);
        Node recordToInsert = heapContainer[index];
        while (index > 0 && heapContainer[parentIdex].getKey() < recordToInsert.getKey()) {
            heapContainer[index] = heapContainer[parentIdex];
            index = parentIdex;
            parentIdex = getParentIndex(parentIdex);
        }
        heapContainer[index] = recordToInsert;
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
