package com.lohis.cocurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {

    private void removeAnimals(){
        System.out.println("Removing animals");
    }
    private void cleaningPen(){
        System.out.println("Cleaning Pen");
    }
    private void addingAnimals(){
        System.out.println("Adding animals");
    }
    public void performTasks(){
        removeAnimals();
        cleaningPen();
        addingAnimals();
    }

    public static void  main(String[] args){

        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            for(int i = 0 ; i < 4; i ++)
                service.submit(()->manager.performTasks());
        }
        finally {
            if(service!=null)
                service.shutdown();
        }
    }
}
