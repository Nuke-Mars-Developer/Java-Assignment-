package com.appxstudioinc.problemset_recursion;

public class factorial_recursion {
    public static void main(String[] args) {

//        int x = 40;
        System.out.println("Using Recursion the value is : "+factorial(50));
        System.out.println("Using Recursion the value is : "+factorial(25));


    }
    static long factorial ( int n){ // using recursion
        if(n==0 || n==1){
        return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
