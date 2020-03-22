package com.lohis.cocurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    public static void main(String[] args){

//        Map<String,Object> foodData  = new HashMap<String,Object>();
        Map<String,Object> foodData  = new ConcurrentHashMap<String,Object>();
        foodData.put("dog", 1);
        foodData.put("cat",2);

        for(String key : foodData.keySet()){
            System.out.println("removing the key : " + key );
            foodData.remove(key);
        }

    }
}
