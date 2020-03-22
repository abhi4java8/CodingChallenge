package com.lohis.javabasics;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args){

        List<String> l1 = new ArrayList<String>();
        l1.add("Apple");
        l1.add("Cat");
        l1.add("Dog");
        l1.add("Rat");
        Vector v = new Vector(l1);
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        e = v.elements();
        while (e.hasMoreElements()){
            String s = (String) e.nextElement();
            if(s.equals("Cat"))
                v.remove(s);
        }
        System.out.println(v.size());
        e=v.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
