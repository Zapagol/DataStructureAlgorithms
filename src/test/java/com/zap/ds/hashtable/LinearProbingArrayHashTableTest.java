package com.zap.ds.hashtable;

import com.zap.ds.hashTable.LinearProbingArrayHashTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinearProbingArrayHashTableTest {

    LinearProbingArrayHashTable lpHashTable = new LinearProbingArrayHashTable();

    @Test
    void putSpec(){
        Assertions.assertEquals(0, lpHashTable.size());
        Assertions.assertTrue(lpHashTable.isEmpty());

        lpHashTable.put("One", 1);
        lpHashTable.put("two", 2);
        lpHashTable.put("three", 3);
        lpHashTable.put("four", 4);
        lpHashTable.put("five", 5);

        Assertions.assertEquals(3, lpHashTable.size());
        Assertions.assertFalse(lpHashTable.isEmpty());
    }

    @Test
    void getSpec(){
        Assertions.assertEquals(0, lpHashTable.size());
        Assertions.assertTrue(lpHashTable.isEmpty());

        lpHashTable.put("One", 1);
        lpHashTable.put("two", 2);

        Object value = lpHashTable.get("One");

        Assertions.assertEquals(1, value);
        Assertions.assertEquals(2, lpHashTable.size());
    }

    @Test
    void containsValueSpec(){
        lpHashTable.put("One", 1);
        lpHashTable.put("two", 2);

        boolean result = lpHashTable.containsValue(2);
        Assertions.assertTrue(result);
    }

    @Test
    void removeSpec(){
        Assertions.assertEquals(0, lpHashTable.size());
        Assertions.assertTrue(lpHashTable.isEmpty());

        lpHashTable.put("One", 1);
        lpHashTable.put("two", 2);
        lpHashTable.put("four", 4);

        Assertions.assertEquals(3, lpHashTable.size());

        Object result = lpHashTable.remove("two");

        Assertions.assertEquals(2, result);
        Assertions.assertEquals(2, lpHashTable.size());
    }
}
