package com.appxstudioinc;

import java.util.Scanner;

public class Java_Conditional {
    public static void main(String[] args) {

        System.out.println("Enter Your Age :- ");
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();


        if(age >= 18) {
            System.out.println("You can make Passport and Travel aroound the World");
        }
        else {
            System.out.println("\nYou can\'t Boy. Go and Complete Your Homework");
        }
        }
    }