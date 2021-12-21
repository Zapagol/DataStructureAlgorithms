package com.zap.ds.trees.binarytree;

public class Test {


     public static int solution(int[] A, String[] D) {
         // write your code in Java SE 8
         int totalAmount = 0;
         int totalMonth = 12;
         int consCount = 0;
         int amount = 0;
         for(int i = 0; i < A.length; i++){
             totalAmount = totalAmount + A[i];
         }
         for(int i = 0; i < D.length - 1; i++){
             if(D[i].substring(5, 7).equals(D[i+1].substring(5, 7)) && A[i] < 0){
                 if(i == D.length - 2){
                     amount = amount + A[i + 1];
                     consCount++;
                 }
                 amount = amount + A[i];
                 consCount++;
             }
             if(amount <= -100 && consCount >= 3){
                 consCount = 0;
                 amount = 0;
                 totalMonth = totalMonth - 1;
             }
         }
         int balance = totalAmount - (5 * totalMonth);
         return balance;
        }

    public static void main(String args[]){
        //System.out.println("2020-11-31".substring(5, 7));

        Test t = new Test();
        int[] arr = {180, -50, -25, -25};
        String[] arr1 = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};
        System.out.println(t.solution(arr, arr1));
    }
}
