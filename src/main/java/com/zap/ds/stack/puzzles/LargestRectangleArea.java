package com.zap.ds.stack.puzzles;

import java.util.Stack;

/**
 * 1) Create an empty stack.
 *
 * 2) Start from first bar, and do following for every bar ‘height[i]’ where ‘i’ varies from 0 to n-1.
 * ……a) If stack is empty or height[i] is higher than the bar at top of stack, then push ‘i’ to stack.
 * ……b) If this bar is smaller than the top of stack, then keep removing the top of stack while top of the
 * stack is greater. Let the removed bar be height[tp]. Calculate area of rectangle with height[tp] as smallest bar.
 * For height[tp], the ‘left index’ is previous (previous to tp) item in stack and ‘right index’ is ‘i’ (current index).
 *
 * 3) If the stack is not empty, then one by one remove all bars from stack and do step 2.b for every removed bar.
 */
public class LargestRectangleArea {

    static int getMaxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<Integer>();

        int max = 0;
        int i = 0;

        while (i < height.length) {
            //push index to stack when the current height is larger than the previous one
            if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                //calculate max value when the current height is less than the previous one
                int p = stack.pop();
                int h = height[p];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(h * w, max);
            }

        }

        while (!stack.isEmpty()) {
            int p = stack.pop();
            int h = height[p];
            int w = stack.isEmpty() ? i : i - stack.peek() - 1;
            max = Math.max(h * w, max);
        }

        return max;
    }

    public static void main(String[] args)
    {
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Maximum area is " + getMaxArea(hist));
    }
}
