package com.lohis.javabasics;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberToWord {
    Map<Integer, String> numberWords = new LinkedHashMap<Integer, String>();
    public NumberToWord(){
        numberWords.put(1,"ONE");
        numberWords.put(2,"TWO");
        numberWords.put(3,"THREE");
        numberWords.put(4,"FOUR");
        numberWords.put(5,"FIVE");
        numberWords.put(6,"SIX");
        numberWords.put(7,"SEVEN");
        numberWords.put(8,"EIGHT");
        numberWords.put(9,"NINE");
        numberWords.put(10,"TEN");
        numberWords.put(11,"ELEVEN");
        numberWords.put(12,"TWELVE");
        numberWords.put(13,"THIRTEEN");
        numberWords.put(14,"FOURTEEN");
        numberWords.put(15,"FIFTEEN");
        numberWords.put(16,"SIXTEEN");
        numberWords.put(17,"SEVENTEEN");
        numberWords.put(18,"EIGTHEEN");
        numberWords.put(19,"NINETEEN");
        numberWords.put(20,"TWENTY");
        numberWords.put(30,"THIRTY");
        numberWords.put(40,"FOURTY");
        numberWords.put(50,"FIFTY");
        numberWords.put(60,"SIXTY");
        numberWords.put(70,"SEVENTY");
        numberWords.put(80,"EIGHTY");
        numberWords.put(90,"NINETY");
        numberWords.put(100,"HUNDRED");
        numberWords.put(1000,"THOUSAND");
        numberWords.put(100000,"LAKH");

    }

    String  convertNumberTwoWord(Integer n){
        int q = 0;
        int r = 0;//1234
        int d = 0;
        int r1 = 0 ;
        String ns = n + "";
        StringBuilder sb = new StringBuilder();
        for(int i = ns.length();  i >0; i --){
            d  = (int) Math.pow(10,i-1);
            q = n/d;
            r = n%d;
            if(r>100)
            sb.append(q+ numberWords.get(d) + " ");
            else if(r>19)
                sb.append(q+ numberWords.get(d*r) + " ");
            else if(r>0)
                sb.append(q+ numberWords.get(r) + " ");

//            if(r > 20) {
//                r1 = r/10;
//                if(r1==0)
//                sb.append(numberWords.get(r));
//                else
//                    sb.append(numberWords.get(r) + " " ).append(numberWords.get(r1));
//            }
//            else
//                sb.append(numberWords.get(r));
//            if(r == 0)
//                break;
            n=r;
        }

        return sb.toString();
    }


}
