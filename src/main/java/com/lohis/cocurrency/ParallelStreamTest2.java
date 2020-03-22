package com.lohis.cocurrency;

import java.util.Arrays;

public class ParallelStreamTest2 {

    public static void main(String[] args){

        String name = "abhilash";

        String str = "AAABBCDDDa";
        String[] s1= str.split("");
        String[] a1 = name.split("");
        Arrays.stream(a1).map(e->e + e.toUpperCase()).forEach(e->System.out.print(e));
        System.out.println("------");
        System.out.println(Arrays.stream(a1).reduce("X",String::concat));                    //  Xabhilash
        System.out.println("------");
        System.out.println(Arrays.stream(a1).parallel().reduce("X",String::concat));         //  XaXbXhXiXlXaXsXh
        String t = s1[0];
        int ctr= 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s1.length; i ++){
            if(s1[i].equals(t)){
                ctr++;
            }
            else{
                sb.append(t).append(ctr);
                t=s1[i];
                ctr=1;
            }
       }
        sb.append(t).append(ctr);
        System.out.println(sb.toString());

    }
}
