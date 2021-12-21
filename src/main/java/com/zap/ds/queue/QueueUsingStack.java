package com.zap.ds.queue;

import java.util.Stack;

/**
 * enQueue(q, x):
 *
 * - While stack1 is not empty, push everything from stack1 to stack2.
 * - Push x to stack1 (assuming size of stacks is unlimited).
 * - Push everything back to stack1.
 * Here time complexity will be O(n)
 *
 * deQueue(q):
 *
 * - If stack1 is empty then error
 * - Pop an item from stack1 and return it
 * Here time complexity will be O(1)
 */
public class QueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int data){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int dequeue(){
        // if first stack is empty
        if (stack1.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }

        // Return top of s1
        int x = stack1.peek();
        stack1.pop();
        return x;
    }
}
