package com.zap.recursion;

/**
 * The process in which a function calls itself directly or indirectly is called recursion and
 * the corresponding function is called as recursive function.
 *
 * Example 1 : Factorial
 *  Fact(n) = n * (n-1) * (n-2) .......1
 *  Fact(4) = 4 * 3 * 2 * 1 = 4 * Fact(3)
 *
 * Example 2 : Fibonacci Series
 * Fib(n) = 0, 1, 1, 2, 3, 5, 8, 13, 21 .. n
 *
 *
 */
public class Recursion {

    public int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) return 1;
         else return fibonacci(n-1) + fibonacci(n-2); // recursive step
    }

    public int fact_tail(int n){
        return fact(n, 1);
    }

    private int fact(int n, int a){
        if(n == 0) return a;
        else return fact(n-1, n * a);
    }

    public int fibonacci_tail(int n){
        return fibo(n, 0, 1);
    }
    private int fibo(int n, int a, int b){
        if(n == 0 ) return a;
        else if(n == 1) return b;
        else return fibo(n-1, b,a + b);
    }
}


