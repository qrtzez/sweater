package com.example.sweater;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void test(){
        int x = 5;
        int y = 20;

        Assert.assertEquals(25, x+y);
        Assert.assertEquals(40, x*y);
    }
}
