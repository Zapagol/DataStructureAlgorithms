package com.zap.ds.hashTable.main;

import com.zap.ds.hashTable.LinkedListHashTable;

public class LinkedListHashTableMain {

    public static void main(String[] args){
        LinkedListHashTable hashTable = new LinkedListHashTable(11);
        hashTable.put("Messi", "Argentina");
        hashTable.put("Ronaldo", "Portugal");
        hashTable.put("Pique", "Spain");
        hashTable.put("Beckham", "England");
        hashTable.put("Rooney", "England");
        hashTable.put("Neymar", "Brazil");
        hashTable.printHashTable();
        System.out.println("Size = "+hashTable.size());

        System.out.println(hashTable.get("Messi"));
        System.out.println(hashTable.get("Rooney"));
        //System.out.println(hashTable.get("Modric"));

        hashTable.remove("Pique");
        hashTable.remove("Rooney");
        hashTable.printHashTable();
        System.out.println("Size = "+hashTable.size());

        System.out.println(hashTable.containsKey("Messi"));
        System.out.println(hashTable.containsKey("Ronaldo"));
        System.out.println(hashTable.containsKey("Pique"));
        System.out.println(hashTable.containsKey("Rooney"));
    }
}
