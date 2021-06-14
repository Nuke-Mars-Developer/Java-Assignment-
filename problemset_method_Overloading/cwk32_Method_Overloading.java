package com.appxstudioinc.problemset_method_Overloading;

import java.util.Scanner;

public class cwk32_Method_Overloading {
    public static void main(String[] args) {

        // Method overloading is a simply using same method name with different parameters

        greeting();
        greeting(54900);

        askDetails();



    }

    static void askDetails(){
        System.out.println("I am Krishna Kumar Mukhiya");
        System.out.println("Whats your name ?\n");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is : "+name);
    }

  static void greeting (){
      System.out.println("Good Morning Dear Acer Aspire 7");
  }
  static void greeting (int a){
      System.out.println("You are too expensive Dear Acer Aspire 7 i.e Rs: "+a);
  }

}
