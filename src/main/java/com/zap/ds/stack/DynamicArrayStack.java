package com.zap.ds.stack;

import java.util.Arrays;

public class DynamicArrayStack {
    private int capacity;
    private int[] stackArray;
    private int top;

    public DynamicArrayStack(int initialSize){
        this.capacity = initialSize;
        this.stackArray = new int[capacity];
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
    public void push(int data){
        if(size() == capacity){
            expand();
            stackArray[++top] = data;
        }else{
            stackArray[++top] = data;
        }
    }
    private void expand(){
        int length = capacity * 2;
        int[] newStack;
        newStack = Arrays.copyOf(stackArray, length);
        stackArray = newStack;
        this.capacity = length;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }else {
            return stackArray[top--];
        }
    }
}
