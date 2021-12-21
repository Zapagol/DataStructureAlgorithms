package com.zap.ds.hashTable.main;

import com.zap.ds.hashTable.GenericDoublyHashingHashTable;

public class GenericDoublyHashingHashTableMain {
    public static void main(String[] args){
        GenericDoublyHashingHashTable<String, String> stringStringHT = new GenericDoublyHashingHashTable<>(11);

        System.out.println("============================ <String, String> ===========================================");
        System.out.println("Put element into Hash Table ---->");
        stringStringHT.put("Google", "Sundar Pichai");
        stringStringHT.put("MicroSoft", "Satya Nadella");
        stringStringHT.put("Amazon", "Jeff Bezos");
        stringStringHT.put("Facebook", "Mark Zukerberg");
        stringStringHT.put("FlipKart", "Kalyan Krishnamurthy");
        //stringStringHT.put("FlipKart", 100); -- Wrong. won't compile
        //stringStringHT.put(99.99, "FlipKart"); -- Wrong. won't compile

        stringStringHT.display();
        System.out.println(stringStringHT.size());
        System.out.println(stringStringHT.isEmpty());

        System.out.println();
        System.out.println("Get element into Hash Table ---->");
        System.out.println("Key = Google" + "Value =" +stringStringHT.get("Google"));
        System.out.println("Key = FlipKart" + "Value =" +stringStringHT.get("FlipKart"));

        System.out.println();
        System.out.println("Contains Value in Hash Table ---->");
        System.out.println("For Value Sundar Pichai = " + stringStringHT.containsValue("Sundar Pichai"));
        System.out.println("For Value Pichai = " + stringStringHT.containsValue("Pichai"));
        System.out.println("For Value Kalyan Krishnamurthy = " + stringStringHT.containsValue("Kalyan Krishnamurthy"));

        System.out.println();
        System.out.println("Contains Key in Hash Table ---->");
        System.out.println("For Key Google = , " + stringStringHT.containsKey("Google"));
        System.out.println("For Key Ola = , " + stringStringHT.containsKey("Ola"));

        System.out.println();
        System.out.println("Remove elements from Hash Table ---->");
        stringStringHT.remove("Amazon");
        stringStringHT.remove("Facebook");
        stringStringHT.display();
        System.out.println("Size = " + stringStringHT.size());

        System.out.println("============================ <String, Int> ==============================================");
        GenericDoublyHashingHashTable<String, Integer> stringIntegerHT = new GenericDoublyHashingHashTable<>(11);

        System.out.println("Put element into Hash Table ---->");
        stringIntegerHT.put("Google", 1998);
        stringIntegerHT.put("MicroSoft", 1975);
        stringIntegerHT.put("Amazon", 1994);
        stringIntegerHT.put("Facebook", 2004);
        stringIntegerHT.put("FlipKart", 2007);
        //stringIntegerHT.put("MicroSoft", "Satya Nadella"); -- Wrong. won't compile
        //stringIntegerHT.put("Amazon", "Jeff Bezos"); -- Wrong. won't compile

        stringIntegerHT.display();
        System.out.println(stringIntegerHT.size());
        System.out.println(stringIntegerHT.isEmpty());

        System.out.println();
        System.out.println("Get element into Hash Table ---->");
        System.out.println("Key = Google" + "Value =" +stringIntegerHT.get("Google"));
        System.out.println("Key = FlipKart" + "Value =" +stringIntegerHT.get("FlipKart"));

        System.out.println();
        System.out.println("Contains Value in Hash Table ---->");
        System.out.println("For Value 1998 = " + stringIntegerHT.containsValue(1998));
        System.out.println("For Value 1990 = " + stringIntegerHT.containsValue(1990));
        System.out.println("For Value 2007 = " + stringIntegerHT.containsValue(2007));

        System.out.println();
        System.out.println("Contains Key in Hash Table ---->");
        System.out.println("For Key Google = " + stringIntegerHT.containsKey("Google"));
        System.out.println("For Key Ola = " + stringIntegerHT.containsKey("Ola"));

        System.out.println("============================ <Integer, String> ===========================================");
        GenericDoublyHashingHashTable<Integer,String> integerStringHT = new GenericDoublyHashingHashTable<>(11);

        System.out.println("Put element into Hash Table ---->");
        integerStringHT.put(1998, "Google");
        integerStringHT.put(1975, "MicroSoft");
        integerStringHT.put(1994, "Amazon");
        integerStringHT.put(2004, "Facebook");
        integerStringHT.put(2007, "FlipKart");
        //stringIntegerHT.put("MicroSoft", "Satya Nadella"); -- Wrong. won't compile
        //stringIntegerHT.put("Amazon", "Jeff Bezos"); -- Wrong. won't compile

        integerStringHT.display();
        System.out.println(integerStringHT.size());
        System.out.println(integerStringHT.isEmpty());

        System.out.println();
        System.out.println("Get element into Hash Table ---->");
        System.out.println("Key = 1998" + "Value =" +integerStringHT.get(1998));
        System.out.println("Key = 2007" + "Value =" +integerStringHT.get(2007));

        System.out.println();
        System.out.println("Contains Value in Hash Table ---->");
        System.out.println("For Value Google = " + integerStringHT.containsValue("Google"));
        System.out.println("For Value Apple = " + integerStringHT.containsValue("Apple"));
        System.out.println("For Value FlipKart = " + integerStringHT.containsValue("FlipKart"));

        System.out.println();
        System.out.println("Contains Key in Hash Table ---->");
        System.out.println("For Key 1998 = " + integerStringHT.containsKey(1998));
        System.out.println("For Key 2010 = " + integerStringHT.containsKey(2010));
    }
}
