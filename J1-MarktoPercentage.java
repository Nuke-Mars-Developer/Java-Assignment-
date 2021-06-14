package com.appxstudioinc;
import java.util.Scanner;               // Code is Written By Krishna Kumar on 2020-09-08
class MarktoPercentage {
    public static void main(String[] args) {
        System.out.println("||| Mark to Percentage ||| ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Mark Of Science : ");
        float science = input.nextFloat();
        System.out.println("Enter The Mark Of Math : ");
        float math = input.nextFloat();
        System.out.println("Enter The Mark Of English : ");
        float english = input.nextFloat();
        System.out.println("Enter The Mark Of Nepali : ");
        float nepali = input.nextFloat();
        System.out.println("Enter The Mark Of G.K. : ");
        float gk = input.nextFloat();

        float sum = (science+nepali+math+english+gk);           // Total Mark
        System.out.println("Your Total Mark Out Of 500 is : "+ sum);

        float percentage = (sum/500)*100;           // Percentage Calculation
        System.out.println("You scored "+ percentage+ "%");

// Next Problem
        System.out.println("Enter Your Name Dear :");
        String name = input.next();
        System.out.println("Good Morning "+ name+ "\n!!! Happy Birthday !!!");


    }
}
