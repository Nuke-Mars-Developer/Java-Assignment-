package com.appxstudioinc;

import java.util.Arrays;
import java.util.Scanner;

public class cwk29_Array_ProblemSet {
    public static void main(String[] args) {
        System.out.println("|---- Problem Solving On Array ----|");

        //Problem 1
        // Create an array of 5 floats and calculate their sum
        float[] heightOfStudent = {5.7f, 8.6f, 4.6f, 6.5f, 8.9f};
        System.out.println(Arrays.toString(heightOfStudent));

        float sumOfArray = 0;
        for (int i = 0; i < heightOfStudent.length; i++) {
            sumOfArray = sumOfArray + heightOfStudent[i];
        }
        System.out.println(sumOfArray);
        System.out.println("The sum of Array is : " + sumOfArray);

/*
        //Problem 2
        // Write a program to find whether a given integer is present in an array or not
        System.out.println("\n Problem 2");
        int[] arrayOfInteger = {25, 68, 78, 35, 712, 23, 75};
        System.out.println(Arrays.toString(arrayOfInteger));
        // using scanner class to take input from user

        System.out.println("Enter any Integer : ");
        Scanner scanner = new Scanner(System.in);
        int integerCheck = scanner.nextInt();

        for (int i : arrayOfInteger) {
            System.out.println(i);
        }

        for (int element : arrayOfInteger) {
            if (integerCheck == element) {
                System.out.println("Found Successfully!!!");
            }
            else {
                System.out.println("Not Found !!!");
            }
        }

        // By Another method
        boolean is_in_array = false;
        for (int element : arrayOfInteger) {
            if (integerCheck == element){
                is_in_array = true;
                break;
            }

        }
        if (is_in_array){
            System.out.println("We got that piece of shit in Array");
        }
        else {
            System.out.println("Not Found Yet");
        }

                    */

        // Problem set 3
        //calculate the average mark from an array containing marks of all
        // students in physics using for-each loop

        float sumOfTotal = 0;
        int [] physicsmarks = {14, 65, 89, 54, 69, 75, 95, 82, 87, 75};
        for (int i = 0; i <physicsmarks.length;i++){
            System.out.println();
//             sumOfArray = sumOfArray +
        }

















}
}