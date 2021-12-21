package com.zap.ds.heap.main;

import com.zap.ds.heap.MaxHeap;

public class MaxHeapMain {
    public static void main(String[] args){
        MaxHeap heap = new MaxHeap(10);
        heap.insert(25);
        heap.insert(20);
        heap.insert(15);
        heap.insert(35);
        heap.insert(10);
        heap.insert(40);
        heap.insert(5);
        heap.insert(37);
        heap.insert(50);
        heap.insert(45);
        heap.printHeap();
        System.out.println("Size of heap = " + heap.size());

        heap.remove();
        heap.printHeap();

        heap.remove();
        heap.printHeap();
        System.out.println("Size of heap = " + heap.size());

        heap.removeAll();
        heap.printHeap();
        System.out.println("Size of heap = " + heap.size());

        heap.insert(25);
        heap.insert(20);
        heap.insert(15);
        heap.printHeap();
        System.out.println("Size of heap = " + heap.size());
    }
}
