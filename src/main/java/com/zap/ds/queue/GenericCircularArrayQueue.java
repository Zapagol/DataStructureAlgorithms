package com.zap.ds.queue;

public class GenericCircularArrayQueue<T> {

    private int size;
    private T[] queueContainer;
    private int front;
    private int rear;
    private int capacity;

    public GenericCircularArrayQueue(int queueCapacity){
        this.size = 0;
        this.front = 0;
        this.rear = 0;
        this.capacity = queueCapacity;
        this.queueContainer = (T[])new Object[queueCapacity];;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void enQueue(T data) throws Exception{
        if(isFull()){
            throw new Exception("Queue is flow --> ");
        }else {
            queueContainer[rear] = data;
            size++;
            rear = (rear + 1) % capacity;
        }
    }
    public Object deQueue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty --> ");
        }else {
            Object data = queueContainer[(front % capacity)];
            front = (front + 1) % capacity;
            size--;
            return data;
        }
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
