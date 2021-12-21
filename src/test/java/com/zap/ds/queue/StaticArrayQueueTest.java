package com.zap.ds.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StaticArrayQueueTest {

    StaticArrayQueue staticArrayQueue = new StaticArrayQueue(4);

    @BeforeEach
    void init() throws Exception{
        Assertions.assertTrue(staticArrayQueue.isEmpty());
        Assertions.assertEquals(0, staticArrayQueue.size());
        staticArrayQueue.enQueue(5);
        staticArrayQueue.enQueue(10);
    }

    @Test
    void enQueueSpec()throws Exception{
        staticArrayQueue.enQueue(15);
        staticArrayQueue.enQueue(20);

        Assertions.assertEquals(4, staticArrayQueue.size());
        Assertions.assertFalse(staticArrayQueue.isEmpty());
    }

    @Test
    void enQueueFullException() throws Exception{
        staticArrayQueue.enQueue(15);
        staticArrayQueue.enQueue(20);

        Exception thrown =
                Assertions.assertThrows(Exception.class,
                        () -> staticArrayQueue.enQueue(15),
                        "Expected Queue Full Exception -->");

        Assertions.assertTrue(thrown.getMessage().contains("Queue is full"));
    }
    @Test
    void deQueueSpec()throws Exception{
        staticArrayQueue.enQueue(15);

        staticArrayQueue.deQueue();
        staticArrayQueue.deQueue();

        Assertions.assertEquals(1, staticArrayQueue.size());
        Assertions.assertFalse(staticArrayQueue.isEmpty());

        staticArrayQueue.deQueue();
        Assertions.assertEquals(0, staticArrayQueue.size());
        Assertions.assertTrue(staticArrayQueue.isEmpty());
    }

    @Test
    void deQueueEmptyQueueException() throws Exception{
        staticArrayQueue.deQueue();
        staticArrayQueue.deQueue();
        Assertions.assertEquals(0, staticArrayQueue.size());

        Exception thrown =
                Assertions.assertThrows(Exception.class,
                        () -> staticArrayQueue.deQueue(),
                        "Expected Queue Empty Exception -->");

        Assertions.assertTrue(thrown.getMessage().contains("Queue is empty"));
    }
}
