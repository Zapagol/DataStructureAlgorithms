package com.zap.ds.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenericDynamicArrayStackTest {

    GenericDynamicArrayStack<String> stringStack = new GenericDynamicArrayStack<>(4);
    GenericDynamicArrayStack<Integer> integerStack = new GenericDynamicArrayStack<>(4);

    @BeforeEach
    void init(){
        stringStack.push("Google");
        stringStack.push("MicroSoft");

        integerStack.push(1998);
        integerStack.push(1975);
    }

    @Test
    void genericPushFunctionTest(){
        stringStack.push("IBM");
        integerStack.push(1911);

        Assertions.assertEquals(3, stringStack.size());
        Assertions.assertEquals(3, integerStack.size());
    }

    @Test
    void genericPopFunctionTest() throws Exception{
        String value = stringStack.pop();

        Assertions.assertEquals("MicroSoft", value);
        Assertions.assertEquals(1, stringStack.size());
    }

    @Test
    void genericPeekFunctionTest() throws Exception{
        int peekValue = integerStack.peek();

        Assertions.assertEquals(1975, peekValue);
    }

    @Test
    void emptyStackExceptionTest() throws Exception{
        stringStack.pop();
        stringStack.pop();

        Exception thrown =
                Assertions.assertThrows(Exception.class,
                        () -> stringStack.pop(),
                        "Expected Stack Empty Exception -->");
       Assertions.assertTrue(thrown.getMessage().contains("Stack is empty"));
    }
}
