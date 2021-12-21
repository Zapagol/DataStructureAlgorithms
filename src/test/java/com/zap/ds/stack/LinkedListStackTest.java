package com.zap.ds.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListStackTest {

    LinkedListStack linkedListStack = new LinkedListStack();

    @BeforeEach
    void init() {
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(50);
    }

    @Test
    public void pushFunctionTest() throws Exception{

        Assertions.assertEquals(3, linkedListStack.size());
        linkedListStack.push(30);
        linkedListStack.push(40);

        Assertions.assertEquals(5, linkedListStack.size());
    }

    @Test
    public void peekFunctionTest() throws Exception {
        int peekValue = linkedListStack.peek();

        Assertions.assertEquals(50, peekValue);
        Assertions.assertEquals(3, linkedListStack.size());
    }

    @Test
    public void popFunctionAndExceptionTest() throws Exception {
        int poppedValue = linkedListStack.pop();

        Assertions.assertEquals(50, poppedValue);
        Assertions.assertEquals(2, linkedListStack.size());
    }

    @Test
    public void emptyStackExceptionTest() throws Exception{
        linkedListStack.pop();
        linkedListStack.pop();
        linkedListStack.pop();

        Exception thrown =
                Assertions.assertThrows(Exception.class,
                        () -> linkedListStack.pop(),
                        "Expected Stack Empty Exception -->");

        Assertions.assertTrue(thrown.getMessage().contains("Stack is Empty"));
    }
}
