package com.zap.ds.hashTable.main;

import com.zap.ds.hashTable.DoublyHashingHashTable;

public class DoublyHashingHashTableMain {
    public static void main(String[] args){
        DoublyHashingHashTable hashTable = new DoublyHashingHashTable(11);

        System.out.println("Put element into Hash Table ---->");
        hashTable.put("Google", "Sundar Pichai");
        hashTable.put("MicroSoft", "Satya Nadella");
        hashTable.put("Amazon", "Jeff Bezos");
        hashTable.put("Facebook", "Mark Zukerberg");
        hashTable.put("FlipKart", "Kalyan Krishnamurthy");

        hashTable.display();
        System.out.println(hashTable.size());
        System.out.println(hashTable.isEmpty());

        System.out.println();
        System.out.println("Get element into Hash Table ---->");
        System.out.println("Key = Google" + "Value =" +hashTable.get("Google"));
        System.out.println("Key = FlipKart" + "Value =" +hashTable.get("FlipKart"));

        System.out.println();
        System.out.println("Contains Value in Hash Table ---->");
        System.out.println("For Value Sundar Pichai = " + hashTable.containsValue("Sundar Pichai"));
        System.out.println("For Value Pichai = " + hashTable.containsValue("Pichai"));
        System.out.println("For Value Kalyan Krishnamurthy = " + hashTable.containsValue("Kalyan Krishnamurthy"));

        System.out.println();
        System.out.println("Contains Key in Hash Table ---->");
        System.out.println("For Key Google = " + hashTable.containsKey("Google"));
        System.out.println("For Key Ola = " + hashTable.containsKey("Ola"));

        System.out.println();
        System.out.println("Remove elements from Hash Table ---->");
        hashTable.remove("Amazon");
        hashTable.remove("Facebook");
        hashTable.display();
        System.out.println("Size = " + hashTable.size());
    }
}
