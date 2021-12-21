package com.zap.ds.stack.puzzles;

import java.util.Stack;

/**
 * Approach 1 :
 *      - push() : Push element into main stack and push it to auxillary stack if empty or new element is
 *          less than or equal to current top element
 *
 *      - pop() : Remove element from main stack and remove element from auxillary stack only if it is eqaul to the
 *          current minimum element i.e top element of both stacks are same
 *
 *      - min() : Top of the auxiliary stack would always be minimum element
 *
 *
 * Approach 2 :
 *      - push() : Declare variable as 'min', if value is greater or equal to 'min' then push directly into stack. If
 *          it is less than 'min' then push (2 * value - min) and update 'min' = value
 *
 *      - pop() : If top is less than min then update min = 2 * min - top then pop or else pop directly
 *
 *      - min() : Variable 'min' would be always minimum element of the stack.
 */
public class MinElementStack {

    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> auxiliaryStack = new Stack<>();

    // variable to store minimum element - Approach 2
    private int min;
    private Stack<Integer> stack = new Stack<>();

    void push1(int data){
        mainStack.push(data);
        if(auxiliaryStack.isEmpty()){
            auxiliaryStack.push(data);
        }else if(data <= auxiliaryStack.peek()){
            auxiliaryStack.push(data);
        }

    }

    int pop1(){
        if(mainStack.isEmpty()){
            return -1;
        }
        if(mainStack.peek() == auxiliaryStack.peek()){
            auxiliaryStack.pop();
        }
        return mainStack.pop();
    }

    int min1(){
        if(auxiliaryStack.isEmpty()){
            return -1;
        }
        return auxiliaryStack.peek();
    }

    void push2(int x){
        if (stack.empty()) {
            stack.push(x);
            min = x;
        }
        else if (x > min) {
            stack.push(x);
        }
        else {
            stack.push(2 * x - min);
            min = x;
        }
    }
    int pop2(){
        if (stack.empty()) {
            System.out.println("Stack underflow!!");
        }

        int top = stack.peek();
        if (top < min)
            min = 2 * min - top;
        return stack.pop();
    }
    int min2(){
        return min;
    }

    public static void main(String[] args){
        MinElementStack s = new MinElementStack();

        s.push1(6);
        System.out.println(s.min1());	// prints 6

        s.push1(7);
        System.out.println(s.min1());	// prints 6

        s.push1(8);
        System.out.println(s.min1());	// prints 6

        s.push1(5);
        System.out.println(s.min1());	// prints 5

        s.push1(3);
        System.out.println(s.min1());	// prints 3
        s.pop1();
        System.out.println(s.min1());	// prints 5
        s.push1(10);
        System.out.println(s.min1());	// prints 5
        s.pop1();
        System.out.println(s.min1());	// prints 5
        s.pop1();
        System.out.println(s.min1());	// prints 6

        s.push2(3);
        s.push2(5);
        s.min2();
        s.push2(2);
        s.push2(1);
        s.min2();
        s.pop2();
        s.min2();
        s.pop2();

    }
}
