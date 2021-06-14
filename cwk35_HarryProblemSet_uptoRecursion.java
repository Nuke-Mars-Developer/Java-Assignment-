package com.appxstudioinc;

import java.util.Scanner;

public class cwk35_HarryProblemSet_uptoRecursion {
    public static void main(String[] args) {
        int x =5;
        Scanner scanner = new Scanner(System.in);

//        1. Write a Java method to print the multiplication table of a number n.
//        multiplicationTable(5);

/*        2. Write a program using functions to print the following pattern:
             *
            **
           ***
          ****
 */
        pattern(7);

        // 3. sum of natural numbers using recursion
//        sumOfNatural(5);

        /* 4.
        * Write a function to print the following pattern:
             ****
             ***
             **
             *
   */

//        decrementstar(x);
//        fibonacciSeries(x);
//        System.out.println(outcome);
//        demo(x);

        // qn 6 answew
//        int n = scanner.nextInt();








    }
 static void demo(int n){
        int count = 0;
        for (int i=1;i<=n;i++)
            count  = i;
            System.out.println("Count : "+count);

 }



    // 1.  Method for multiplication table
    static void multiplicationTable(int n){
        for (int i=0;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }

    // 2. method for pattern
    static void pattern(int pn){
//        for (int i=1; i<=pn; i++){
//           for (int j=0;j<=pn;j++){
//               System.out.print("* ");
//           }
//            System.out.println();
//        }
        for (int i = 1; i <= pn; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    //3. Write a recursive function to calculate the
    // sum of first n natural numbers.

    static int sumOfNatural (int n){
        int total = 0;
        if(n<0){
            return 0;
        }
        else{
            total = n+sumOfNatural(n-1);
            System.out.println(total);
            return total;
        }
        /* n= 5
                n+n-1

        */

    }


    //4.Write a function to print the following pattern:

    static void decrementstar(int dnumstar){

//        for (int i= 1; i>=dnumstar;i++){
//            for (int j=0;j<dnumstar;j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

        for (int i = 1; i <= dnumstar; i++)
            for (int j = 1; j <=i+1; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }


        static int fibonacciSeries(int n) {
        if (n == 1 || n==2){
            return  n-1;
        }
        else {
            int result = fibonacciSeries(n-1)+fibonacciSeries(n-2);
//                return fibonacciSeries(n-1)+fibonacciSeries(n-2);
                return result;
            }


        }


// qn 6





}