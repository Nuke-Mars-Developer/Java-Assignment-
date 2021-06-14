package com.appxstudioinc.problemset_method;

import java.util.Scanner;

//Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even,
// or false otherwise. Also write a program to test your method.
public class cwk31_methodp2 {



    static boolean isEven(int a){
        boolean result;
        if (a%2==0){
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Method in Java ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int number = scanner.nextInt();
        boolean checkIt = isEven(number);
        System.out.println("You Entered number is : "+number);
        System.out.println("Number is : "+checkIt);

    }
}
