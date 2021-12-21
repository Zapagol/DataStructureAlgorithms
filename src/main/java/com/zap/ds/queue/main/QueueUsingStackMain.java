package com.zap.ds.queue.main;

import com.zap.ds.queue.QueueUsingStack;

public class QueueUsingStackMain {

    public static void main(String[] args)
    {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
