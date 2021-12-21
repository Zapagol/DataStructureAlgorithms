package com.zap.ds.queue.main;

import com.zap.ds.queue.LinkedListQueue;

public class LinkedListQueueMain {
    public static void main(String[] args){
        LinkedListQueue queue = new LinkedListQueue();
        try {
            queue.enQueue(100);
            queue.enQueue(200);
            queue.enQueue(300);
            queue.enQueue(400);
            queue.enQueue(500);
            queue.enQueue(600);
            queue.display();
            System.out.println("Size = " + queue.size());
            System.out.println("First element in queue = " + queue.first());
            System.out.println("Last element in queue = " + queue.last());

            queue.deQueue();
            queue.deQueue();
            queue.display();
            System.out.println("First element in queue = " + queue.first());
            System.out.println("Size = " + queue.size());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
