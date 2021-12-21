package com.zap.ds.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicStaticArrayTest {

    DynamicArrayStack dynamicArrayStack = new DynamicArrayStack(2);

    @Test
    public void dynamicArrayStackTest() {

        dynamicArrayStack.push(11);
        dynamicArrayStack.push(22);
        Assertions.assertEquals(2, dynamicArrayStack.size());

        //Initial size of Stack is 2. When you try to insert data into stack then size of
        //stack should increase dynamically without any exceptions.
        dynamicArrayStack.push(33);
        dynamicArrayStack.push(44);
        Assertions.assertEquals(4, dynamicArrayStack.size());
    }
}
