package com.zap.ds.heap;

public class Practice {
    class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data){
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    Node[] heapContainer;
    int length;
    public Practice(int capacity){
        this.heapContainer = new Node[capacity];
        this.length = 0;
    }
    void insert(int data){
        Node newNode = new Node(data);
        heapContainer[length++] = newNode;
        heapifyUp(length);
    }

    void heapifyUp(int index){
        int parentIndex = getParentIndex(index);
        while(hasParent(index) && heapContainer[getParentIndex(index)].data > heapContainer[index].data){
            heapContainer[index] = heapContainer[parentIndex];
            index = parentIndex;
            parentIndex = getParentIndex(index);
        }
    }

    int getParentIndex(int index){
        return (index - 1) / 2;
    }
    boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }
}
