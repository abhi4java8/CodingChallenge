package com.lohis.problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoSums {

    static Integer[] nums = new Integer[]{2,4,5,8,9,12};
    static Integer target = 21;
    public static void main(String[] args){
        TwoSums ts = new TwoSums();
        //Using brute force method
        String result = ts.findTwoSums(nums,target);
        System.out.println(result);
        //Efficient method
        String result1 = ts.findTwoSums1(nums,target);
        System.out.println(result1);
    }

    public  String findTwoSums1(Integer[] nums, Integer target) {
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <nums.length; i ++){
            Integer delta = target - nums[i];
            if(map.containsKey(delta)){
                 return sb.append("[").append(map.get(delta)).append(",").append(i).append("]").toString();
            }
            else {
                map.put(nums[i],i);
            }
        }
        return sb.append("[").append("-1").append(",").append("-1").append("]").toString();
    }

    public  String findTwoSums(Integer[] nums, Integer target) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length ;  i ++){
            Integer sum = 0;
            for(int j = i+1; j < nums.length; j ++){
                sum = nums[i] + nums[j];
                if(sum.equals(target)){
                    sb.append("[").append(i).append(",").append(j).append("]");
                    break;
                }
            }
        }
        return sb.toString();
    }

}
