package com.zap.ds.queue.main;

import com.zap.ds.queue.GenericLinkedListQueue;

public class GenericLinkedListQueueMain {

    public static void main(String[] args){
        GenericLinkedListQueue<Integer> intQueue = new GenericLinkedListQueue<>();
        GenericLinkedListQueue<String> stringQueue = new GenericLinkedListQueue<>();
        GenericLinkedListQueue mixedQueue = new GenericLinkedListQueue();
        try {
            //INTEGER QUEUE
            intQueue.enQueue(100);
            intQueue.enQueue(200);
            intQueue.enQueue(300);
            intQueue.enQueue(400);
            intQueue.enQueue(500);
            intQueue.enQueue(600);
            intQueue.display();
            System.out.println("Size = " + intQueue.size());
            System.out.println("First element in queue = " + intQueue.first());
            System.out.println("Last element in queue = " + intQueue.last());

            intQueue.deQueue();
            intQueue.deQueue();
            intQueue.display();
            System.out.println("First element in queue = " + intQueue.first());
            System.out.println("Size = " + intQueue.size());

            //STRING QUEUE
            stringQueue.enQueue("Amazon");
            stringQueue.enQueue("Facebook");
            stringQueue.enQueue("PayTm");
            stringQueue.enQueue("OLA");
            stringQueue.enQueue("JIO");
            stringQueue.enQueue("FlipKart");
            stringQueue.display();
            System.out.println("Size = " + stringQueue.size());
            System.out.println("First element in queue = " + stringQueue.first());
            System.out.println("Last element in queue = " + stringQueue.last());

            stringQueue.deQueue();
            stringQueue.deQueue();
            stringQueue.display();
            System.out.println("First element in queue = " + stringQueue.first());
            System.out.println("Size = " + stringQueue.size());

            //GENERIC QUEUE
            mixedQueue.enQueue('G');
            mixedQueue.enQueue(99.999);
            mixedQueue.enQueue("Google");
            mixedQueue.enQueue(1998);
            mixedQueue.enQueue("Larry page and Sergey Brin");
            mixedQueue.enQueue("Sundar Pichai");
            mixedQueue.display();
            System.out.println("Size = " + mixedQueue.size());

            mixedQueue.deQueue();
            mixedQueue.deQueue();
            mixedQueue.display();
            System.out.println("Size = " + mixedQueue.size());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
