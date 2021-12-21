package com.zap.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursionTest {

    Recursion recursion = new Recursion();

    @Test
    void factorialTest(){
        int result = recursion.factorial(5);
        Assertions.assertEquals(result, 120);
    }

    @Test
    void factTailTest(){
        int result = recursion.fact_tail(5);
        Assertions.assertEquals(result, 120);
    }

    @Test
    void fibonacciTest(){
        int result = recursion.fibonacci(6);
        Assertions.assertEquals(result, 13);
    }

    @Test
    void fibonacciTailTest(){
        int result = recursion.fibonacci_tail(9);
        Assertions.assertEquals(result, 34);
    }
}
