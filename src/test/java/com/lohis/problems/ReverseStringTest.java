package com.lohis.problems;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    @DisplayName("Valid test 1")
    public void reverseStringTest(){
        ReverseString rs = new ReverseString();
        String name = "Abhilash";
        String expected  = "hsalihbA";
        String actual = rs.reverseString(name);
        Assert.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Null Test")
    public void reverseStringTest1(){
        ReverseString rs = new ReverseString();
        String name = null;
        String actual = rs.reverseString(name);
        Assert.assertNull(actual);
    }

    @Test
    @DisplayName("space Test")
    public void reverseStringTest2(){
        ReverseString rs = new ReverseString();
        String name = "";
        String expected  = "";
        String actual = rs.reverseString(name);
        Assert.assertEquals(expected,actual);
    }
}
