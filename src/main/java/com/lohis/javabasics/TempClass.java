package com.lohis.javabasics;

import java.util.Arrays;

public class TempClass {

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
