package com.zap.ds.heap.main;

import com.zap.ds.heap.GenericHeap;

public class GenericHeapMain {
    public static void main(String[] args){
        GenericHeap<Integer> integerHeap = new GenericHeap<>();
        integerHeap.insert(25);
        integerHeap.insert(20);
        integerHeap.insert(15);
        integerHeap.insert(35);
        integerHeap.insert(10);
        integerHeap.insert(40);
        integerHeap.insert(5);
        integerHeap.insert(37);
        integerHeap.insert(50);
        integerHeap.insert(45);
        integerHeap.printHeap();
        System.out.println("Size of heap = " + integerHeap.size());

        integerHeap.remove();
        integerHeap.printHeap();

        integerHeap.remove();
        integerHeap.printHeap();
        System.out.println("Size of heap = " + integerHeap.size());

        integerHeap.removeAll();
        integerHeap.printHeap();
        System.out.println("Size of heap = " + integerHeap.size());

        integerHeap.insert(25);
        integerHeap.insert(20);
        integerHeap.insert(15);
        integerHeap.printHeap();
        System.out.println("Size of heap = " + integerHeap.size());

        System.out.println("<====== Heap<Double>========>");
        GenericHeap<Double> doubleHeap = new GenericHeap<>();
        doubleHeap.insert(25.3);
        doubleHeap.insert(20.0);
        doubleHeap.insert(15.4);
        doubleHeap.insert(35.2);
        doubleHeap.insert(10.9);
        doubleHeap.insert(40.0);
        doubleHeap.insert(5.99);
        doubleHeap.insert(37.0);
        doubleHeap.insert(50.34);
        doubleHeap.insert(45.56);
        doubleHeap.printHeap();
        System.out.println("Size of heap = " + doubleHeap.size());

        doubleHeap.remove();
        doubleHeap.printHeap();

        doubleHeap.remove();
        doubleHeap.printHeap();
        System.out.println("Size of heap = " + doubleHeap.size());

        doubleHeap.removeAll();
        doubleHeap.printHeap();
        System.out.println("Size of heap = " + doubleHeap.size());

        doubleHeap.insert(25.0);
        doubleHeap.insert(20.0);
        doubleHeap.insert(15.0);
        doubleHeap.printHeap();
        System.out.println("Size of heap = " + doubleHeap.size());

    }
}
