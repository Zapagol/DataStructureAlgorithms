package com.zap.ds.queue.main;

import com.zap.ds.queue.CircularArrayQueue;

public class CircularArrayQueueMain {
    public static void main(String[] args){
        CircularArrayQueue queue = new CircularArrayQueue(3);
        try{
            System.out.println(queue.isEmpty());
            queue.enQueue(100);
            queue.enQueue(200);
            queue.enQueue(300);
            System.out.println(queue.toString());
            System.out.println("Size of Queue = " + queue.size());
            //queue.enQueue(400); -- it throws exception as queue is full.

            queue.deQueue();
            queue.deQueue();
            System.out.println(queue.toString());
            System.out.println("Size of Queue = " + queue.size());

            //This won't throw any exception because we are using Circular array.
            //We have removed 2 elements from queue and added 2 elements.
            queue.enQueue(400);
            queue.enQueue(500);
            System.out.println(queue.toString());
            System.out.println("Size of Queue = " + queue.size());
            System.out.println(queue.isEmpty());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
