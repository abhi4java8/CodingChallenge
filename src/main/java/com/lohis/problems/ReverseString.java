package com.lohis.problems;

public class ReverseString {

    public static void main(String[] args){
        String name ="abhilash";
        ReverseString rs = new ReverseString();
        String reversedString = rs.reverseString(name);
        System.out.println(reversedString);
    }

    public String reverseString(String name) {
        StringBuilder sb = new StringBuilder();
        if(name == null)
            return null;
        for(int i = name.length() -1; i >= 0 ; i--){
            sb.append(name.charAt(i));
        }
        return sb.toString();
    }


}
