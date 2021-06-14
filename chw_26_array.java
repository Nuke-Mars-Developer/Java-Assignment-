package com.appxstudioinc;

import java.util.Arrays;

public class chw_26_array {
    public static void main(String[] args) {

        // Array Declaration
        int[] marks;
//        int[] rollno;
        marks = new int[15];
        marks[0] = 1500;
        marks[1] = 175;
        marks[2] = 155;
        marks[3] = 105;
        marks[4] = 75;
        int[] rollno = {25, 48, 65, 98, 78, 547, 36, 25, 8, 5, 46, 9, 10, 15, 7};
//        System.out.println(marks);
        System.out.println(Arrays.toString(marks));
//        System.out.println("\nCount : " + Arrays.stream(marks).count());
        System.out.println("\nLength : " + marks.length);
        System.out.println("\nAverage : " + Arrays.stream(marks).average());
//        System.out.println("\nMin : " + Arrays.stream(marks).min());
        System.out.println("Another Array is  " + Arrays.toString(rollno));

        // Transvering Array
        for (int j : rollno) {
            System.out.println(j);
        }
//
//            // Transvering Array
//        for (int i = 0; i < rollno.length; i++) {
//                System.out.println(rollno[i]);
//            }
        System.out.println("---------REVERSE--------");

        // Transvering Array in reverse order
        int length = rollno.length;
        for (int i = 0; i < length; length--) {
            System.out.println(rollno[i]);
        }

    }
}