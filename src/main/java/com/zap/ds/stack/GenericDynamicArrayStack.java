package com.zap.ds.stack;

import java.util.Arrays;

public class GenericDynamicArrayStack<T> {

    private int capacity;
    private T[] stackArray;
    private int top;


    public GenericDynamicArrayStack(int initialSize){
        this.capacity = initialSize;
        this.stackArray = (T[])new Object[initialSize];
        this.top = -1;
    }

    public int size(){
        return (top + 1);
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        }else {
            return false;
        }
    }

    public void push(T data){
        if(size() == capacity){
            expand();
            stackArray[++top] = data;
        }else{
            stackArray[++top] = data;
        }
    }
    private void expand(){
        int length = capacity * 2;
        T[] newStack;
        newStack = Arrays.copyOf(stackArray, length);
        stackArray = newStack;
        this.capacity = length;
    }

    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }else {
            return stackArray[top--];
        }
    }
    public T peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }else {
            return stackArray[top];
        }
    }
}
