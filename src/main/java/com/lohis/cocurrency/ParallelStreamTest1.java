package com.lohis.cocurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamTest1 {

    public List<Integer> processAllData(List<Integer> data){
//       return data.stream().map(e->processRecord(e)).collect(Collectors.toList());            //  Task comppleted in 45.956 seconds
        return data.parallelStream().map(e->processRecord(e)).collect(Collectors.toList());     //  Task comppleted in 3.51 seconds
    }

    private int processRecord(int input) {
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){

        }
        return input +1;
    }

    public static void main(String[] args){
        ParallelStreamTest1 obj = new ParallelStreamTest1();
        List<Integer>  data = new ArrayList<Integer>();
        for(int i = 0 ; i < 4000;i ++)
            data.add(i);
        data.stream().forEach(e-> System.out.print(e + " "));
        System.out.println();
        long start  = System.currentTimeMillis();
        List<Integer>  processedData = obj.processAllData(data);
        double time = (System.currentTimeMillis() - start)/1000.0;
        processedData.stream().forEach(e-> System.out.print(e + " "));
        System.out.println();
        System.out.println("Task comppleted in " + time + " seconds");


    }
}
