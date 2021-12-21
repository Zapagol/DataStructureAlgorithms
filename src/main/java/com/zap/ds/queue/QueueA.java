package com.zap.ds.queue;

public class QueueA<T> {
    T[] data;
    int front, rear;
    int length;

    QueueA(T[] a){
        data = a;
        front = 0;
        rear = 0;
        length = a.length;
    }

    void enqueue(T a){
        if(rear >= length - 1){
            System.out.println("Queue Overflow");
        }else {
            rear++;
            data[rear] = a;
        }
    }

    T dequeue(){
        T x = null;
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return null;
        }else{
            x = data[front];
            front++;
            return x;
        }
    }

    boolean isEmpty(){
        if(front > rear)
            return true;
        else
            return false;
    }
}
