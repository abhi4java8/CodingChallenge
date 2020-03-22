package com.lohis.cocurrency;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamTest {

    public static void main (String[] args){

        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(e->System.out.print(e + " " ));
        System.out.println();
        Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().forEach(e->System.out.print(e+ " "));
        System.out.println();
        Arrays.asList(1,2,3,4,5,6,7,8,9,10).parallelStream().forEach(e->System.out.print(e + " "));
        System.out.println();
        Arrays.asList(1,2,3,4,5,6,7,8,9,10).parallelStream().forEachOrdered(e->System.out.print(e+ " "));

    }
}
