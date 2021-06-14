package com.appxstudioinc;

import java.util.Arrays;

public class cwk26_array {
    public static void main(String[] args) {
        // Array declaration
        String [] name;
        name = new String[3];
        name[0] ="Krishna";
        name[1] ="Dhiraj";
        name[2] ="Jyoti";
        System.out.println("The elements of name array are : " + Arrays.toString(name));
        System.out.println();
        System.out.println("The elements of name array are : " + name[1]);

        // Second Declaration type
        int [] Age = {15, 85, 98, 82, 64, 91};
        for (int i = 0; i <Age.length; i++){
            System.out.println("Array are : "+ Age[i]);
        }
        System.out.println();
        // Second Declaration type
        int [] rollno = {1, 8, 9, 2, 6, 3};
        for (int j : rollno) {
            System.out.println("Array are : " + j);
        }


        System.out.println();
        System.out.println("Another Method Age : "+ Arrays.toString(Age));


    }
}
