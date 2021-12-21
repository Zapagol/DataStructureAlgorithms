package com.zap.ds.queue;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class DynamicCircularArrayQueue {
    private int size;
    private int front;
    private int rear;
    private int capacity;
    private int[] queueContainer;

    public DynamicCircularArrayQueue(int initialCap){
        this.capacity = initialCap;
        this.size = 0;
        this.queueContainer = new int[initialCap];
        this.front = 0;
        this.rear = -1;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void enQueue(int data){
        if(isFull()) {
            expand();
        }
        size++;
        rear = (rear + 1) % capacity;
        queueContainer[rear] = data;
    }
    public int deQueue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }else {
            int data = queueContainer[(front % capacity)];
            front = (front + 1) % capacity;
            size--;
            return data;
        }
    }
    private void expand(){
        int length = capacity * 2;
        int[] newQueueContainer = new int[length];
        for(int i=front; i<= rear; i++ ){
            newQueueContainer[i - front] = queueContainer[i % capacity];
        }
        queueContainer = newQueueContainer;
        System.out.println(front + ", " + rear);
        front = 0;
        rear = size - 1;
        this.capacity = length;
    }
    public String toString(){
        String result = "Elements : ";
        for(int i = 0; i<size; i++ ){
            result += queueContainer[(front + i) % capacity];
            if(i < size -1){
                result += ", ";
            }
        }
        return result;
    }
}
