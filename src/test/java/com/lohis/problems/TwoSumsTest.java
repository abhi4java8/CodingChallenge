package com.lohis.problems;;;


import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSumsTest {

    @Test
    @DisplayName("Valid Test 1")
    public void findTwoSums1Test(){
        Integer [] a1 = new Integer[]{2,3,4,5,6,7,8};
        Integer target = 15;
        String expected = "[5,6]";
        TwoSums ts =  new TwoSums();
        String actual = ts.findTwoSums1(a1,target);
        Assert.assertEquals(expected,actual);

    }

    @Test
    @DisplayName("InValid Test 1")
    public void findTwoSums1Test1(){
        Integer [] a1 = new Integer[]{2,3,4,5,6,7,8};
        Integer target = 16;
        String expected = "[-1,-1]";
        TwoSums ts =  new TwoSums();
        String actual = ts.findTwoSums1(a1,target);
        Assert.assertEquals(expected,actual);

    }
}

