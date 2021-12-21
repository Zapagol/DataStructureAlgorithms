//package com.zap.ds.hackerrank;
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Stack;
//
//
//
//public class EqualStack {
//
//    /*
//     * Complete the equalStacks function below.
//     */
//    static int equalStacks(int[] a1, int[] a2, int[] a3) {
//        /*
//         * Write your code here.
//         */
//        Stack<Integer> s1 = arrayToStack(a1);
//        Stack<Integer> s2 = arrayToStack(a2);
//        Stack<Integer> s3 = arrayToStack(a3);
//
//        int h1Sum = sum(s1);
//        int h2Sum = sum(s2);
//        int h3Sum = sum(s3);
//
//        while(h1Sum != h2Sum && h2Sum != h3Sum){
//           if(!s1.isEmpty()){
//               int p1 = s1.pop();
//               h1Sum = h1Sum - p1;
//           }
//           if(h1Sum != h2Sum){
//               if(!s2.isEmpty()){
//                   int p2 = s2.pop();
//                   h2Sum = h2Sum - p2;
//               }
//
//           }
//           if(h1Sum != h3Sum){
//               if(s3.isEmpty()){
//                   int p3 = s3.pop();
//                   h3Sum = h3Sum - p3;
//               }
//           }
//        }
//
//        return h1Sum;
//    }
//
//    static Stack<Integer> arrayToStack(int[] h){
//        Stack stack = new Stack();
//        int size = h.length - 1;
//        while (size >= 0){
//            stack.push(h[size]);
//            size --;
//        }
//        return stack;
//    }
//    static int sum(Stack stack){
//        int sum = 0;
//        Stack<Integer> tempStack = new Stack<Integer>();
//        tempStack.addAll(stack);
//        while (!tempStack.isEmpty()){
//            sum += tempStack.pop();
//        }
//        return sum;
//    }
//
//
//
//    public static void main(String[] args) throws IOException {
//
//
//        int[] arr1 = {1, 1, 1, 1, 2};
//        int[] arr2 = {3, 7};
//        int[] arr3 = {1, 3, 1};
//
////        //Stack1
////        stack1.push(1);
////        stack1.push(1);
////        stack1.push(1);
////        stack1.push(2);
////        stack1.push(3);
////
////        //stack2
////        stack2.push(2);
////        stack2.push(3);
////        stack2.push(4);
////
////        //stack3
////        stack3.push(1);
////        stack3.push(4);
////        stack3.push(1);
////        stack3.push(1);
//
//
//        int result = equalStacks(arr1, arr2, arr3);
//
//        System.out.println(result);
//    }
//}
