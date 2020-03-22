package com.lohis.streams;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStream1 {

    public static void main(String[] args){


        System.out.println(
                IntStream
                        .range(1,10)
                        .sum()
        );
        IntSupplier
                sup
                = () -> (int)(Math.random() * 10);
        DoubleSupplier dsup = () -> Math.random();
        System.out.println(sup.getAsInt());
        System.out.println(dsup.getAsDouble());

        Stream.of(5,3,8,1,9,6)
                .sorted((o1,o2)-> {
                            if (o2 > o1)
                                return -1;
                            else if (o2 < o1)
                                return 1;
                            else return 0;
                        }
                        )
                .findFirst()
                .ifPresent(System.out::println);



    }
}
