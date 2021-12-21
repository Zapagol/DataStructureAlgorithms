package com.zap.ds.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StaticArrayTest {

    StaticArrayStack staticArrayStack = new StaticArrayStack(5);

    @BeforeEach
    void init() throws Exception {
        staticArrayStack.push(10);
        staticArrayStack.push(20);
        staticArrayStack.push(50);
    }

    @Test
    public void pushFunctionTest() throws Exception{

        Assertions.assertEquals(3, staticArrayStack.size());
        staticArrayStack.push(30);
        staticArrayStack.push(40);

        Assertions.assertEquals(5, staticArrayStack.size());
    }

    @Test
    public void peakFunctionTest() throws Exception {
        int peekValue = staticArrayStack.peak();

        Assertions.assertEquals(50, peekValue);
        Assertions.assertEquals(3, staticArrayStack.size());
    }

    @Test
    public void popFunctionAndExceptionTest() throws Exception {
        int poppedValue = staticArrayStack.pop();

        Assertions.assertEquals(50, poppedValue);
        Assertions.assertEquals(2, staticArrayStack.size());
    }

    @Test
    public void emptyStackExceptionTest() throws Exception{
        staticArrayStack.pop();
        staticArrayStack.pop();
        staticArrayStack.pop();

        Exception thrown =
                Assertions.assertThrows(Exception.class,
                        () -> staticArrayStack.pop(),
                        "Expected Stack Empty Exception -->");

        Assertions.assertTrue(thrown.getMessage().contains("Stack is empty"));
    }

    @Test
    public void fullStackExceptionTest() throws Exception{
        staticArrayStack.push(70);
        staticArrayStack.push(80);

        Exception thrown =
                Assertions.assertThrows(Exception.class,
                        () -> staticArrayStack.push(100),
                        "Expected Stack Full Exception -->");

        Assertions.assertTrue(thrown.getMessage().contains("Stack is full"));
    }
}
