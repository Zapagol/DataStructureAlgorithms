package com.zap.ds.queue.main;

import com.zap.ds.queue.GenericCircularArrayQueue;

public class GenericCircularArrayQueueMain {
    public static void main(String[] args){
        GenericCircularArrayQueue<Integer> intQueue = new GenericCircularArrayQueue<>(3);
        GenericCircularArrayQueue<String> stringQueue = new GenericCircularArrayQueue<>(3);
        GenericCircularArrayQueue mixedQueue = new GenericCircularArrayQueue(3);
        try{
            // INTEGER QUEUE -->
            System.out.println(intQueue.isEmpty());
            intQueue.enQueue(100);
            intQueue.enQueue(200);
            intQueue.enQueue(300);
            System.out.println(intQueue.toString());
            System.out.println("Size of Queue = " + intQueue.size());
            //intQueue.enQueue(400); -- it throws exception as intQueue is full.

            intQueue.deQueue();
            intQueue.deQueue();
            System.out.println(intQueue.toString());
            System.out.println("Size of Queue = " + intQueue.size());

            //This won't throw any exception because we are using Circular array.
            //We have removed 2 elements from intQueue and added 2 elements.
            intQueue.enQueue(400);
            intQueue.enQueue(500);
            System.out.println(intQueue.toString());
            System.out.println("Size of Queue = " + intQueue.size());
            System.out.println(intQueue.isEmpty());

            // STRING QUEUE -->
            System.out.println(stringQueue.isEmpty());
            stringQueue.enQueue("R");
            stringQueue.enQueue("JavaScript");
            stringQueue.enQueue("Python");
            System.out.println(stringQueue.toString());
            System.out.println("Size of Queue = " + stringQueue.size());
            //intQueue.enQueue(400); -- it throws exception as intQueue is full.

            stringQueue.deQueue();
            stringQueue.deQueue();
            System.out.println(stringQueue.toString());
            System.out.println("Size of Queue = " + stringQueue.size());

            //This won't throw any exception because we are using Circular array.
            //We have removed 2 elements from intQueue and added 2 elements.
            stringQueue.enQueue("Scala");
            stringQueue.enQueue("Java");
            System.out.println(stringQueue.toString());
            System.out.println("Size of Queue = " + stringQueue.size());
            System.out.println(stringQueue.isEmpty());

            // MIXED QUEUE -->
            mixedQueue.enQueue("I am String");
            mixedQueue.enQueue(100);
            mixedQueue.enQueue('C');

            System.out.println(mixedQueue.toString());
            System.out.println("Size of Queue = " + mixedQueue.size());

            mixedQueue.deQueue();
            mixedQueue.enQueue(3.142);
            System.out.println(mixedQueue.toString());


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
