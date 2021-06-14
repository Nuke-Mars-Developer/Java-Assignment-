package com.appxstudioinc;
//import math.util;
import java.util.Arrays;

public class cwk27_forEachLoop {
    public static void main(String[] args) {
        // For each loop

        float[] heightOfStudent = {5.4f, 3.5f, 8.5f, 9.7f, 10.3f, 4.9f, 5.1f};
        for (float height : heightOfStudent) {
            System.out.println(height);
        }
        System.out.println();
        System.out.println("Length of height Array is : " + heightOfStudent.length);

// 2nd Testing for revesing array

        // creating new array of 10 random number
        int[] randomNumber = {540, 98, 23, 78, 52, 73, 115, 8058, 54900, 3200};
        System.out.println("<- | Printing Array in Reverse Order |-->");
        // Printing the array in reverse order using for loop
        System.out.println(Arrays.toString(randomNumber));

        for (int random = randomNumber.length-1; random>=0 ;random--){
//            System.out.println("Printing in Reverse Order : "+randomNumber[random] );
            System.out.println(randomNumber[random] );

        }




//        System.out.println("<----| Before Reversing Array |---->");
//        int[] Price = {254, 658, 7584, 254, 368, 985, 7546, 2523, 586, 714};
//        System.out.println(Arrays.toString(Price));
//        System.out.println("\n");
//
//        for (int i= Price.length-1;i>=0;i--) {
//
//            System.out.println((Price[i]));
//        }
//        System.out.println("\n");
//        System.out.println("<----| After Reversing Array |---->");
//
//        System.out.println(Arrays.toString(Price));
    }
}