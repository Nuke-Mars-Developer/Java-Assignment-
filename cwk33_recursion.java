package com.appxstudioinc;

public class cwk33_recursion {
    public static void main(String[] args) {

        int y = 5;
        System.out.println(" >>-- Learning Recursion -->>");
        System.out.println("Sum of Fibonacci Series of "+ fibonacci(y) );
    }

    static int fibonacci(int num){
        if (num==0){
            return 0;
        }
        else{

           return  num+fibonacci(num-1);

        }
    }
}
