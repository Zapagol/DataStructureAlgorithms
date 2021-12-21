package com.zap.ds.heap;

/**
 * Mean heap is a binary tree such that data contained in each node is less than
 * or equal to the data in that node's children
 */
public class MinHeap {
    private Node[] heapContainer;
    private int length; // Number of elements in Heap
    private int capacity; // Size of the heap

    public MinHeap(int heapSize){
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

    /**
     * Steps:
     *  1. Create a new node at the end of heap.
     *  2. Assign new value to the node.
     *  3. Compare the value of this child node with its parent.
     *  4. If value of parent is less than child, then swap them.
     *  5. Repeat step 3 & 4 until Heap property holds.
     * @param data
     */
    public void insert(int data) {
        Node newNode = new Node(data);
        if (capacity == length) {
            throw new ArrayStoreException("Heap is full");
        }
        heapContainer[length] = newNode;
        //heapify tree now
        heapifyUp(length);
        length++;
    }

    /**
     * Step:
     *  1 − Remove root node.
     *  2 − Move the last element of last level to root.
     *  3 − Compare the value of this child node with its parent.
     *  4 − If value of parent is less than child, then swap them.
     *  5 − Repeat  3 & 4 until Heap property holds.
     *
     * @return
     */
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
        heapifyDown1();

        return dataToBeDeleted;
    }
    public void removeAll(){
        length = 0;
        heapContainer = null;
        heapContainer = new Node[capacity];
    }
    private void heapifyDown(int n){
        int max = n;
        int leftChildIndex = getLeftChildIndex(n);
        int rightChildIndex = getRightChildIndex(n);
        if(leftChildIndex < length && heapContainer[leftChildIndex].getKey() < heapContainer[max].getKey())
            max = leftChildIndex;
        if(rightChildIndex < length && heapContainer[rightChildIndex].getKey() < heapContainer[max].getKey())
            max = rightChildIndex;
        if(max != n){
            Node temp = heapContainer[n];
            heapContainer[n] = heapContainer[max];
            heapContainer[max] = temp;
            heapifyDown(max);
        }
    }

    private void swap(int indexOne, int indexTwo){
        Node temp = heapContainer[indexOne];
        heapContainer[indexOne] = heapContainer[indexTwo];
        heapContainer[indexTwo] = temp;
    }

    private void heapifyDown1(){
        int index = 0;
        while (getLeftChildIndex(index) < length){
            int smallerChildIndex = getLeftChildIndex(index);
            if(getRightChildIndex(index) < length && heapContainer[getRightChildIndex(index)].getKey() < heapContainer[index].getKey()){
                smallerChildIndex = getRightChildIndex(index);
            }
            if(heapContainer[index].getKey() < heapContainer[smallerChildIndex].getKey()){
                break;
            }else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    private void heapifyUp(int index){
        int parentIdex = getParentIndex(index);
        Node recordToInsert = heapContainer[index];
        while (index > 0 && heapContainer[parentIdex].getKey() > recordToInsert.getKey()) {
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
    private boolean hasLeftChild(int index) {return getLeftChildIndex(index) < length ;}
    private boolean hasRightChild(int index) {return getRightChildIndex(index) < length ;}
    private boolean hasParent(int index) {return getParentIndex(index) >= 0 ;}
    //private int leftChild(int index) {return }
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
