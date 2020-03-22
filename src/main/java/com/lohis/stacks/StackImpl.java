package com.lohis.stacks;

public class StackImpl {

    public static void main(String[] args){
        Stack s1 = new Stack(3);
//        s1.pop();
        s1.push(2);
        s1.push(4);
        s1.push(6);
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        s1.push(8);
        s1.push(10);
//        s1.push(12);

    }
}
