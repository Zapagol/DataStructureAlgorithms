package com.zap.ds.arraylist.main;

import com.zap.ds.arraylist.ArrayList;

import java.util.HashMap;

public class ArrayListMain {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        System.out.println(al.isEmpty()); // should return false
        al.add("10");
        al.add("20");
        al.add("30");
        al.add("50");
        al.add("60");
        al.add("80");
        al.displayArrayList();
        System.out.println("Size of array = " + al.size());
        System.out.println(al.isEmpty()); // should return true

        al.add(3,"40");
        al.add(6,"70");
        al.displayArrayList();

        al.add("90");
        al.add("100");
        al.add("100");
        al.add("110");
        al.add("110");
        al.add("120");
        al.displayArrayList();
        System.out.println("Size of array = " + al.size());

        System.out.println(al.contains("80")); // should return true
        System.out.println(al.contains("200")); // should return false

        System.out.println(al.indexOf("50")); // return first occurrence of index number
        System.out.println(al.indexOf("100"));

        System.out.println(al.lastIndexOf("100")); // return last occurrence of index number

        al.displayArrayList();
        al.remove(); // Removes last element from ArrayList
        al.remove(5); // Remove element from ArrayList with specified index number

        al.displayArrayList();
        System.out.println(al.size());

        System.out.println(al.get(7));

        al.displayArrayList();
        System.out.println(al.set(7, "500")); // Set element
        System.out.println(al.set(9, "1000"));
        al.displayArrayList();
        System.out.println(al.size());
        al.removeAll();
        al.displayArrayList();
        System.out.println(al.size());
        System.out.println(al.isEmpty());

        HashMap hm = new HashMap();
    }
}
