package com.zap.ds.heap;

public class GenericHeap<T extends Comparable<T>> {
    private int size;
    private int capacity;
    private T[] heapContainer;

    private static final int DEFAULT_CAPACITY = 10;

    public GenericHeap(){
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.heapContainer = (T[]) new Comparable[DEFAULT_CAPACITY];
    }
    public GenericHeap(int initialCapacity){
        this.size = 0;
        this.capacity = initialCapacity;
        this.heapContainer = (T[]) new Comparable[capacity];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void insert(T data) {
        if (capacity == size) {
            throw new ArrayStoreException("Heap is full");
        }
        heapContainer[size] = data;
        hefipyUp(size);
        size++;
    }

    public T remove(){
        //get top element
        T dataToBeDeleted = heapContainer[0];
        //get last element
        T lastElement = heapContainer[size - 1];
        //Place last element into top
        heapContainer[0] = lastElement;
        // Decrease size of heap by 1
        size--;
        //Heapify the the tree now
        hepifyDown(0);

        return dataToBeDeleted;
    }

    public void removeAll(){
        size = 0;
        heapContainer = null;
        heapContainer = (T[]) new Comparable[capacity];
    }

    private void hefipyUp(int index){
        int parentIdex = getParentIndex(index);
        T recordToInsert = heapContainer[index];
        while (index > 0 && heapContainer[parentIdex].compareTo(recordToInsert) < 0) {
            heapContainer[index] = heapContainer[parentIdex];
            index = parentIdex;
            parentIdex = getParentIndex(parentIdex);
        }
        heapContainer[index] = recordToInsert;
    }
    private void hepifyDown(int n){
        int max = n;
        int leftChildIndex = getLeftChildIndex(n);
        int rightChildIndex = getRightChildIndex(n);
        if(leftChildIndex < size && heapContainer[leftChildIndex].compareTo(heapContainer[max]) > 0)
            max = leftChildIndex;
        if(rightChildIndex < size && heapContainer[rightChildIndex].compareTo(heapContainer[max]) > 0)
            max = rightChildIndex;
        if(max != n){
            T temp = heapContainer[n];
            heapContainer[n] = heapContainer[max];
            heapContainer[max] = temp;
            hepifyDown(max);
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
        for(int i = 0; i<size; i++ ){
            if(heapContainer[i] != null) {
                result += heapContainer[i] + " ";
            }
        }
        System.out.println(result);
    }


}
