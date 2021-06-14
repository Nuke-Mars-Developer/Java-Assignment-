package com.appxstudioinc.problemset_method;

//import com.appxstudioinc.author;

import java.util.Scanner;

public class harry_problemset {
//    String str;

    //Write a Java method to print the multiplication table of a number n.
    public static void main(String[] args) {
//        System.out.println(author.author());

        System.out.println("Enter any number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Multiplication Table of "+n+" is ");
        mupliplication_table(n);

    }
    static void mupliplication_table(int n){
        String str;
        if (n==0){
            System.out.println("Type Correctly");
        }
        else {
            for (int i=0;i<=10;++i){
                System.out.println(n+ "*" + i + " = " +n*i);
//                System.out.format(%d X)
            }
            System.out.println();

        }
    }

}
