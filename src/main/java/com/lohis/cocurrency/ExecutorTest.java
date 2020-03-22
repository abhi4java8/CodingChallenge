package com.lohis.cocurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

    private int sheepCount = 0;
    private void incrementAndReport(){
        synchronized(this) {
            System.out.print(++sheepCount + "  ");
        }
    }
    public static void main(String[] args){

        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            ExecutorTest et = new ExecutorTest();

            for(int i = 0 ; i < 10; i ++)
                service.submit(()-> et.incrementAndReport());
        } finally {
            if(service!=null)
                service.shutdown();
        }
    }
}
