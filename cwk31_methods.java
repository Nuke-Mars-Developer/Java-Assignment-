package com.appxstudioinc;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class cwk31_methods {
    //    private static int avg;

//    static int smallestnumber (int a ,int b ,int c ){
//
//        if (a<b && a<c){
//            z=a;
//            System.out.println(" A is smallest among all i.e =  "+a);
//        }
//        else if(b<c){
//            z=b;
//            System.out.println("B is smallest among all i.e = "+b);
//        }
//        else{
//            System.out.println("C is smallest among all i.e = "+b);
//            z=b;
//        }
//        return z;
//
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter any value : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter any value : ");
        int num3 = scanner.nextInt();

        System.out.print("\nNumber are : "+ num1 +" "+ num2 +" "+ num3);
        System.out.print("\nThe smallest number is : "+smallest(num1, num2, num3));
        System.out.print("\nThe greatest number is : "+greatest(num1, num2, num3));
//        System.out.print("The average number is : "+average(num1,num2,num3));

    }

    public static int smallest(int num1, int num2, int num3){
        return  Math.min((Math.min(num1 ,num2)),num3);
    }

       public static int greatest(int num1, int num2, int num3){
        return  Math.max((Math.max(num1 ,num2)),num3);
    }


}
