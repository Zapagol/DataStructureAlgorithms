package com.zap.al.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

    @Test
    public void testLinearSearchValueFound(){
        LinearSearch lS = new LinearSearch();
        int[] arr = {20, 12, 30, 34, 40, 11};
        int result = lS.linearSearch(30, arr);

        Assertions.assertEquals(2, result);
    }

    @Test
    public void testLinearSearchValueNotFound(){
        LinearSearch lS = new LinearSearch();
        int[] arr = {20, 12, 30, 34, 40, 11};
        int result = lS.linearSearch(100, arr);

        Assertions.assertEquals(-1, result);
    }
}
