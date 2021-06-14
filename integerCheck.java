package com.appxstudioinc;
import java.util.Scanner;
public class integerCheck {
    public static void main(String[] args) {
        System.out.println("Enter a Number :\n");
        Scanner input = new Scanner(System.in);

//        int num = input.nextInt();
//        System.out.println("You have Entered : "+num);
//        System.out.println("!!! Let me check !!!");
        System.out.println(input.hasNextInt());        // To Check Whether the number is int or not

    }
}
