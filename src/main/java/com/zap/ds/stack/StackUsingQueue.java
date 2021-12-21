package com.zap.ds.stack;

import com.zap.ds.queue.LinkedListQueue;

/**
 * 1. Using 2 queues
 *      We requires extra queue to make sure that last entered item always ends up at the front of the queue.
 *
 *      a. To push am item in Stack,
 *          1. Move all the elements from 1st queue to 2nd queue.
 *          2. Push new item into the 1st queue
 *          3. Move all elements back to 1st queue
 *
 *      b. To Pop element from the Stack, simply return the front item from the first queue.
 */
public class StackUsingQueue {

    LinkedListQueue queue1 = new LinkedListQueue();
    LinkedListQueue queue2 = new LinkedListQueue();

    public void push(int data) throws Exception{
        while (!queue1.isEmpty()){
            queue2.enQueue(queue1.deQueue());
        }
        queue1.enQueue(data);
        while (!queue2.isEmpty()){
            queue1.enQueue(queue2.deQueue());
        }
    }

    public int pop() throws Exception{
        int data = 0;
        if(!queue1.isEmpty()){
            data = queue1.deQueue();
        }
        return data;
    }

    public static void main(String[] args){
        StackUsingQueue stackQueue = new StackUsingQueue();

        int[] keys = { 1, 2, 3, 4, 5 };

        try{
            // insert above keys into the stack
            for (int key : keys) {
                stackQueue.push(key);
            }
            for (int i = 0; i < keys.length; i++) {
                System.out.println(stackQueue.pop());
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
