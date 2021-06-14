package com.appxstudioinc.problemset_method;

public class cwk31_methodHarry {
    public static void main(String[] args) {
        int a=15;
        int b=40;

        System.out.println("The Total sum is of a & b is : "+sum(a,b));
        System.out.println("The Total difference is of a & b is : "+difference(a,b));
        System.out.println("The Total multiply is of a & b is : "+multiply(a,b));

        // Method invocation
        Calculate obj = new Calculate();
        int total = obj.calculateSum(45, 26, 12);
        System.out.println("Total sum is : "+total);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int difference(int a, int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }

    int calculateSum(int a, int b, int c){
        return (a+b+c)*12;
    }
}
