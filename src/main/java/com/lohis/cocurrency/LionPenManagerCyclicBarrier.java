package com.lohis.cocurrency;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManagerCyclicBarrier {

    private void removeAnimals(){
        System.out.println("Removing animals");
    }
    private void cleaningPen(){
        System.out.println("Cleaning Pen");
    }
    private void addingAnimals(){
        System.out.println("Adding animals");
    }

    public void performTasks(CyclicBarrier cb1, CyclicBarrier cb2){
        try {
            removeAnimals();
            cb1.await();
            cleaningPen();
            cb2.await();
            addingAnimals();
        }catch (InterruptedException | BrokenBarrierException e){

        }
    }

    public static void  main(String[] args){

        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(4);
            LionPenManagerCyclicBarrier manager = new LionPenManagerCyclicBarrier();
            CyclicBarrier cb1 = new CyclicBarrier(4);
            CyclicBarrier cb2 = new CyclicBarrier(4,()-> System.out.println("***  Pen Cleared ***"));
            for(int i = 0 ; i < 4; i ++)
                service.submit(()->manager.performTasks(cb1,cb2));
        }
        finally {
            if(service!=null)
                service.shutdown();
        }
    }
}
