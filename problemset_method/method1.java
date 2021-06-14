package com.appxstudioinc.problemset_method;

import java.util.Scanner;

public class method1 {
     static int middlenumber(int num1){
         int z;

         z = num1*num1;

         return z;
     }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        Integer num1 = scanner.nextInt();



//        System.out.println(num1);
        int c = middlenumber(num1);
        System.out.println("After applying all method answer is : "+c);


    }
}
