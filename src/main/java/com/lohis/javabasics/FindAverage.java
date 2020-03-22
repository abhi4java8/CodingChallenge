package com.lohis.javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FindAverage {
    private String s = "a";

    public static void main(String [] args){
        Integer [] n1 = new Integer[] {2,4,6,8,10,1};
        Double avg = findAverage(n1);
        System.out.println(avg);
    }

    private static Double findAverage(Integer[] n1) {
        Double  avg = Arrays.stream(n1)
                .peek(e->System.out.println(e))
                .mapToDouble(e->e)
                .peek(t->System.out.println(t))
                .average()
                .getAsDouble();


        return avg;

    }
}
