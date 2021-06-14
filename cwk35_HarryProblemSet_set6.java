package com.appxstudioinc;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class cwk35_HarryProblemSet_set6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//
//
//        int outputUsingVarsArgs = sumVarArgs(5,5,5,5,5);   // in varargs one element is cumpulsory eg... int a, int ...array
//        System.out.println("The Answer is : "+outputUsingVarsArgs);

        // starpattern
//        starpattern(5);
//        starpattern1(5);
//       startrecursion(6);

//        printPatternRecur(5);
//        printPatternRecur(5);
        printPatternRowRecur(5);
    }

     static int sumVarArgs(int a, int ...arr){
         System.out.println("Size of Array : "+arr.length);
        int sum = 0;
        int arrLength = arr.length+1;
        for (int element:arr){
            sum += element;

        }
        return (sum+a)/arrLength;
    }

    static void starpattern(int n){ // Write a function to print the following pattern:using Recursion.

        for (int i=0;i<n;i++){
//            System.out.println("*");
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }


    }


    static void starpattern1(int n){
        System.out.println("-----------------");
        for (int i=5;i<n-1;i--){
//            System.out.println("*");
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }


    }








//    Repeat problem 4 using Recursion.
// function to print the 'n-th' row
// of the pattern recursively
static void printPatternRowRecur(int n)
{
    // base condition
    if (n < 1)
        return;

    // print the remnaining stars
    // of the n-th row recursively
    System.out.print( "* ");
    printPatternRowRecur(n - 1);
}

    static void printPatternRecur(int n)
    {
        // base condition
        if (n < 1)
            return;

        // print the stars of the n-th row
        printPatternRowRecur(n);

        // move to next line
        System.out.println ();

        // print stars of the
        // remaining rows recursively
        printPatternRecur(n - 1);

    }




    //Write a function to convert Celsius temperature into Fahrenheit.
//    static int
}
