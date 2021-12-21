package com.zap.ds.stack.puzzles;

import java.util.Stack;

/**
 *
 * Approach :
 *
 * Let’s say,  you have two stacks,  stack  and tempStack.
 * 1. Pop an element from stack and compare it with head of tempStack.
 * 2. If element it greater, push it to tempStack.
 * 3. If element is lesser than  head of tempStack, pop the element from tempStack
 * and push it to stack until you get the element which is greater than head of tempStack.
 * In the end,  tempStack will be sorted stack.
 */
public class SortStackUsingAnotherStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(10);
        stack.push(8);
        stack.push(2);

        Stack<Integer> tempStack = new Stack();
        while(!stack.isEmpty())
        {
            int currentData=stack.pop();
            while(!tempStack.isEmpty() && tempStack.peek() < currentData) {
                stack.push(tempStack.pop());
            }
            tempStack.push(currentData);
        }

        while (!tempStack.isEmpty()){
            System.out.print(tempStack.pop() + " ");
        }

    }
}
