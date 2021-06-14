package com.appxstudioinc.problemset_method;

        //1.
        //Write a program with a method named getTotal
        // that accepts two integers as an argument and
        // return its sum. Call this method from main( ) and
        //print the results.

public class cwk31_methodp1 {
    static int getTotal(int a, int b){
        int c;
        c = (a+b);
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Method in Java");

        int Total_sum = getTotal(55,95);
        System.out.println("Sum using method is : "+Total_sum);

    }
}
