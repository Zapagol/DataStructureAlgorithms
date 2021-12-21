package com.zap.ds.queue;

/**
 * After performing some insertion and deletion the initial slots of Array will be wasted.Staic(Simple) Array
 * implementation for queue is not efficient.
 *
 * To solve this problem we should use circular arrays. That means, we treat the last element and the first array
 * elements as contiguous. With this representation, if there are any free slots at the beginning, the
 * rear pointer can easily go to its next free slot.
 */
public class StaticArrayQueue {
    private int capacity;
    private int size;
    private int front;
    private int rear;
    private int[] queueContainer;

    public StaticArrayQueue(int initialCap){
        this.capacity = initialCap;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.queueContainer = new int[capacity];
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
    public void enQueue(int data) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }else {
            queueContainer[rear] = data;
            rear++;
            size++;
        }
    }
    public int deQueue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }else {
            int data = queueContainer[front];
            front++;
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
