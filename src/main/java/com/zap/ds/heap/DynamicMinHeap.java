package com.zap.ds.heap;

import java.util.Arrays;

public class DynamicMinHeap {
    int capacity = 5;
    int length = 0;
    int[] heapContainer = new int[capacity];

    public boolean isEmpty(){
        return length == 0;
    }
    public int size(){
        return length;
    }
    public int peek(){
        if(length == 0) throw new IllegalStateException();
        return heapContainer[0];
    }
    public void add(int data){
        ensureExtraCapacity();
        heapContainer[length] = data;
        length++;
        heapifyUp();
    }
    public int delete(){
        if(length == 0) throw new IllegalStateException();
        int item = heapContainer[0];
        heapContainer[0] = heapContainer[length - 1];
        length--;
        heapifyDown();
        return item;
    }
    private void heapifyUp(){
        int index = length - 1;
        while(hasParent(index) && parent(index) > heapContainer[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }
    private void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallerChildIndex = getRightChildIndex(index);
            }
            if(heapContainer[index] < heapContainer[smallerChildIndex]){
                break;
            }else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }
    private void swap(int id1, int id2){
        int temp = heapContainer[id1];
        heapContainer[id1] = heapContainer[id2];
        heapContainer[id2] = temp;
    }
    private int getParentIndex(int childIndex){return (childIndex - 1) / 2; }
    private int getLeftChildIndex(int parentIndex){return (2 * parentIndex + 1);}
    private int getRightChildIndex(int parentIndex) {return (2 * parentIndex + 2);}
    private boolean hasLeftChild(int index){return getLeftChildIndex(index) < length ;}
    private boolean hasRightChild(int index){return getRightChildIndex(index) < length ;}
    private boolean hasParent(int index){return getParentIndex(index) >= 0 ;}
    private int leftChild(int index){return heapContainer[getLeftChildIndex(index)];}
    private int rightChild(int index){return heapContainer[getRightChildIndex(index)];}
    private int parent(int index){return heapContainer[getParentIndex(index)];}

    private void ensureExtraCapacity(){
        if(length == capacity){
            heapContainer = Arrays.copyOf(heapContainer, capacity * 2);
            capacity *= 2;
        }
    }

    public int[] heapArray(){ return heapContainer; }
}
