package com.zap.ds.hashTable.main;

import com.zap.ds.hashTable.GenericLinkedListHashTable;

public class GenericLinkedListHashTableMain {
    public static void main(String[] args){
        System.out.println("================= <String, Integer> =============================================");
        GenericLinkedListHashTable<String, Integer> stringIntegerHT = new GenericLinkedListHashTable<>(11);
        stringIntegerHT.put("Messi", 10);
        stringIntegerHT.put("Ronaldo", 7);
        stringIntegerHT.put("Pique", 3);
        stringIntegerHT.put("Beckham", 23);
        stringIntegerHT.put("Rooney", 10);
        stringIntegerHT.put("Neymar", 10);
        stringIntegerHT.printHashTable();
        System.out.println("Size = "+stringIntegerHT.size());

        System.out.println(stringIntegerHT.get("Messi"));
        System.out.println(stringIntegerHT.get("Rooney"));
        //System.out.println(hashTable.get("Modric"));

        stringIntegerHT.remove("Pique");
        stringIntegerHT.remove("Rooney");
        stringIntegerHT.printHashTable();
        System.out.println("Size = "+stringIntegerHT.size());

        System.out.println(stringIntegerHT.containsKey("Messi"));
        System.out.println(stringIntegerHT.containsKey("Ronaldo"));
        System.out.println(stringIntegerHT.containsKey("Pique"));
        System.out.println(stringIntegerHT.containsKey("Rooney"));

        System.out.println("================= <String, String> =============================================");
        GenericLinkedListHashTable<String, String> hashTable = new GenericLinkedListHashTable<>(11);
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
