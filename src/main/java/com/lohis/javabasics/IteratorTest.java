package com.lohis.javabasics;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args){
        List<String>  l1 = new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Cat", "Dog", "Rat"}));
        Vector v = new Vector(l1);
        Iterator itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        itr = v.iterator();
        while(itr.hasNext()){
            String e = (String) itr.next();
            if(e.equals("Cat"))
                v.remove(e);
        }
        itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
