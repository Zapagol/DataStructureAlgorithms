package com.zap.ds.stack;

public class StaticArrayStack {
    private int capaity;
    private int[] stack;
    private int top;

    public StaticArrayStack(int size){
        this.capaity = size;
        this.stack = new int[capaity];
        this.top = -1;
    }

    public int size(){
        return (top + 1);
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int data) throws Exception{
        if(size() == capaity){
            throw new Exception("Stack is full");
        }else{
            stack[++top] = data;
        }
    }

    public int pop() throws Exception{
        int data;
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }else{
           data = stack[top];
           top--;
        }
        return data;
    }

    public int peak() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return stack[top];
    }
}
