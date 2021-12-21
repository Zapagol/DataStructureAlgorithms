package com.zap.ds.queue;

/**
 * - Another variation of the queue is known as DEQueue(pronounced as Deck)
 * - The term dequeue is originated from Double Ended Queue
 * - In DEQueue, both insertion and deletion operations can be made at either end of the structure
 * - DeQueue is further divided into 2 type
 *  1. Input Restricted DEQueue
 *      - Deletion operation can be made from front end
 *      - Insertion and Deletion both operations can be made from rear end
 *  2. Output restricted DEQueue
 *      - Deletion operation can be made from rear end
 *      - Insertion and Deletion both operations can be made from front end
 */
public class InputRestrictedDeQueue {
    int[] qContainer;
    int capacity;
    int front;
    int rear;
    int size;

    InputRestrictedDeQueue(int initCapacity){
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.capacity = initCapacity;
        this.qContainer = new int[initCapacity];
    }

    void enQueue(int data){
        if(size >= capacity){
            System.out.println("Queue is full");
        }else {
            qContainer[rear] = data;
            rear++;
            size--;
        }
    }

    int fifoDequeue(){
        int data = -1;
        if(size == 0){
            System.out.println("Queue is empty");
        }else{
            data = qContainer[front];
            front++;
            size--;
        }
        return data;
    }
    int lifoDequeue(){
        int data = -1;
        if(size == 0){
            System.out.println("Queue is empty");
        }else{
            data = qContainer[rear];
            rear--;
            size--;
        }
        return data;
    }
}
