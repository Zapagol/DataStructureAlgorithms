package com.zap.ds.stack.puzzles;

import java.util.Arrays;
import java.util.Stack;

public class SpecialStack extends Stack<Integer> {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();

    public void push(int data){
        if(isEmpty()){
            super.push(data);
            minStack.push(data);
            maxStack.push(data);
        }else {
            super.push(data);
            if(data < minStack.peek()){
                minStack.push(data);
            }else{
                maxStack.push(data);
            }
        }
    }
    public int getMin(){
        return minStack.peek();
    }
    public int getMax(){
        return maxStack.peek();
    }

    public Integer pop(){
        int x = super.pop();
        int y = minStack.pop();
        int z = maxStack.pop();

        /* Push the popped element y back only if it is not equal to x */
        if ( y != x ) {
            minStack.push(y);
            //maxStack.push(y);
        }else if(z != x){
            maxStack.push(z);
        }
        return x;
    }



    public static void main(String[] args){
        SpecialStack s = new SpecialStack();
        s.push(20);
        s.push(10);
        s.push(30);
        System.out.println(s.getMin());
        System.out.println(s.getMax());
        s.push(5);
        s.push(50);
        System.out.println(s.getMin());
        System.out.println(s.getMax());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.getMin());
        System.out.println(s.getMax());

    }
}
