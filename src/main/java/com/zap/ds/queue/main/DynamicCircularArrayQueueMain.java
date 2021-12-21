package com.zap.ds.queue.main;

import com.zap.ds.queue.DynamicCircularArrayQueue;

public class DynamicCircularArrayQueueMain {
    public static void main(String[] args){
        DynamicCircularArrayQueue queue = new DynamicCircularArrayQueue(3);
        try{
            System.out.println(queue.isEmpty());
            queue.enQueue(100);
            queue.enQueue(200);
            queue.enQueue(300);
            System.out.println(queue.toString());
            System.out.println("Size of Queue = " + queue.size());

            //It shouldn't throw exception.
            queue.enQueue(400);
            queue.enQueue(500);
            queue.enQueue(600);
            queue.enQueue(700);
            queue.deQueue();
            queue.enQueue(800);
            queue.enQueue(900);
            System.out.println(queue.toString());
            System.out.println("Size of Queue = " + queue.size());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
