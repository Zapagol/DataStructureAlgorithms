package com.zap.ds.heap;

public class HackerRankMinHeap {

    private int capacity = 10;
    private int size = 0;
    private int[] heapContainer = new int[capacity];

    private int getParentIndex(int childIndex){return (childIndex - 1)/2; }
    private int getLeftChildIndex(int parentIndex){return (2 * parentIndex + 1); }
    private int getRightChildIndex(int parenetIndex){ return (2 * parenetIndex + 2); }

    private boolean hasParent(int index) { return getParentIndex(index) >= 0; }
    private boolean hasLetChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }

    private int leftChild(int index) { return heapContainer[getLeftChildIndex(index)]; }
    private int rightChild(int index) { return heapContainer[getRightChildIndex(index)]; }
    private int parent(int index) { return heapContainer[getParentIndex(index)]; }

    private void swap(int indexOne, int indexTwo){
        int temp = heapContainer[indexOne];
        heapContainer[indexOne] = heapContainer[indexTwo];
        heapContainer[indexTwo] = temp;
    }

    public void add(int value){
        heapContainer[size] = value;
        size++;
        heapifyUp();
    }

    private void heapifyUp(){
        int index = size - 1;
        while (hasParent(index) && parent(index) > heapContainer[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private int poll(){
        int item = heapContainer[0];
        heapContainer[0] = heapContainer[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    private void heapifyDown(){
        int index = 0;
        while (hasLetChild(index)){
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
}
