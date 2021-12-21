package com.zap.ds.heap.main;

import com.zap.ds.heap.DynamicMaxMinHeap;

public class DynamicMaxMinHeapMain {
    public static void main(String[] args){
        //By default type of heap is MaxHeap and default heap capacity is 10.
        //Max Heap
        DynamicMaxMinHeap dynamicMaxHeap = new DynamicMaxMinHeap();
        System.out.println("<----- MaxHeap ------->");
        dynamicMaxHeap.insert(25);
        dynamicMaxHeap.insert(20);
        dynamicMaxHeap.insert(15);
        dynamicMaxHeap.insert(35);
        dynamicMaxHeap.insert(10);
        dynamicMaxHeap.insert(40);
        dynamicMaxHeap.insert(5);
        dynamicMaxHeap.insert(37);
        dynamicMaxHeap.insert(50);
        dynamicMaxHeap.insert(45);
        dynamicMaxHeap.printHeap();
        System.out.println("Size of heap = " + dynamicMaxHeap.size());

        //Now heap should expand capacity.
        dynamicMaxHeap.insert(48);
        dynamicMaxHeap.insert(65);
        dynamicMaxHeap.insert(11);

        dynamicMaxHeap.printHeap();
        System.out.println("Size of heap = " + dynamicMaxHeap.size());

        dynamicMaxHeap.remove();
        dynamicMaxHeap.remove();
        dynamicMaxHeap.printHeap();
        System.out.println("Size of heap = " + dynamicMaxHeap.size());

        //Min Heap
        DynamicMaxMinHeap dynamicMinHeap = new DynamicMaxMinHeap("min");
        System.out.println("<----- MinHeap ------->");
        dynamicMinHeap.insert(25);
        dynamicMinHeap.insert(20);
        dynamicMinHeap.insert(15);
        dynamicMinHeap.insert(35);
        dynamicMinHeap.insert(10);
        dynamicMinHeap.insert(40);
        dynamicMinHeap.insert(5);
        dynamicMinHeap.insert(37);
        dynamicMinHeap.insert(50);
        dynamicMinHeap.insert(45);
        dynamicMinHeap.printHeap();
        System.out.println("Size of heap = " + dynamicMinHeap.size());

        //Now heap should expand capacity.
        dynamicMinHeap.insert(48);
        dynamicMinHeap.insert(65);
        dynamicMinHeap.insert(11);

        dynamicMinHeap.printHeap();
        System.out.println("Size of heap = " + dynamicMinHeap.size());

        dynamicMinHeap.remove();
        dynamicMinHeap.remove();
        dynamicMinHeap.printHeap();
        System.out.println("Size of heap = " + dynamicMinHeap.size());
    }
}
