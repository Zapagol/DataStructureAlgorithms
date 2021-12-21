package com.zap.ds.hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class StackMaximumElmt {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Stack <StackItem> st = new Stack <> ();
        int n = sc.nextInt();//number of choice
        int choice;
        int max = 0;
        for (int i = 0; i<n; i++) {
            choice = sc.nextInt();
            if (choice == 1) {//insert/push an item
                int newInt = sc.nextInt();
                if (!st.isEmpty()) {
                    max = st.peek().currentMax;
                } else {
                    max = 0;
                }
                if (newInt > max) {
                    max = newInt;
                }
                StackItem item = new StackItem(newInt, max);
                st.push(item);
            } else if (choice == 2) {//pop
                if (!st.isEmpty()) st.pop();
            } else if (choice == 3) {//print the maximum item
                System.out.println(st.peek().currentMax);
            }
        }
    }
}
class StackItem {
    int val;
    int currentMax;
    StackItem(int val, int max) {
        this.val = val;
        this.currentMax = max;
    }
}
