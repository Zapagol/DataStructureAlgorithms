package com.zap.ds.stack.puzzles;

import java.util.Stack;

/**
 * 1. Create a stack and push all the id’s in the stack.
 * 2. Run a loop while there are more than 1 element in the stack.
 * 3. Pop top two element from the stack (represent them as A and B)
 * 4. Check if A knows B, then A can’t be a celebrity and push B in stack. Check if A doesn’t know B, then B can’t be
 * a celebrity push A in stack
 * 5. Assign the remaining element in the stack as the celebrity
 * 6. Run a loop from 0 to n-1 and find the count of persons who knows the celebrity and the number of people whom the
 * celebrity knows. if the count of persons who knows the celebrity is n-1 and the count of people whom the celebrity
 * knows is 0 then return the id of celebrity else return -1.
 */
public class CelebrityProblem {

    static int MATRIX[][] = { { 0, 0, 1, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 } };

    public static void main(String[] args){
        int n = 4;
        int result = findCelebrity(n);
        if (result == -1)
        {
            System.out.println("No Celebrity");
        }
        else
            System.out.println("Celebrity ID " +
                    result);

    }

    public static int findCelebrity(int n){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++)
            stack.push(i);

        while (stack.size() > 1) {
            // Step 2 :Pop off top
            // two persons from the
            // stack, discard one
            // person based on return
            // status of knows(A, B).
            int a = stack.pop();
            int b = stack.pop();

            // Step 3 : Push the
            // remained person onto stack.
            if (knows(a, b)) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }
        int c = stack.pop();
        // Step 5 : Check if the last
        // person is celebrity or not
        for (int i = 0; i < n; i++)
        {
            // If any person doesn't
            //  know 'c' or 'a' doesn't
            // know any person, return -1
            if (i != c && (knows(c, i) ||
                    !knows(i, c)))
                return -1;
        }

        return c;
    }
    static boolean knows(int a, int b){
        return MATRIX[a][b] == 1 ;
    }
}
