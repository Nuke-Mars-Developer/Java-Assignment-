package com.appxstudioinc;

import java.util.Scanner;

public class quiz_Java_conditional_switch {
    public static void main(String[] args) {


//        System.out.print("------------------------");

     /*
        //  1. What will be the output of this program

        int a = 11;

        if (a == 11)
        {
            System.out.println("I am 11");
        }
        else
            {
            System.out.println("I am not 11");
            }

       */


/*

        //  2.
        //  Write a program to find out whether a student is pass or fail;
        //  if it requires total 40% and at least 33% in each subject to pass.
        //  Assume 3 subjects and take marks as an input from the user.


        System.out.println("Enter Your Mark Out of 100 ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Math Mark :- ");
        int math = sc.nextInt();
        System.out.print("Enter Science Mark :- ");
        int science = sc.nextInt();
        System.out.print("Enter English Mark :- ");
        int english = sc.nextInt();
        float sum = math+science+english;
        float average = (math+english+math)/3.2f;
        System.out.println(average);
        float pass_percent = (sum/300)*100;
        System.out.println("You scored "+pass_percent+"%");

        if (pass_percent>=40 && math>=33 && science>=33 && english>=33) {
            System.out.println("You have passed, Congrats");
        }
        else
            {
                System.out.println("You have failed in exam.");
            }


*/

/*


        //  3.  Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        //
        //      Note that there is not tax below 2.5L. Take the input amount as input from the user.


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Annual Income :- ");
        int income = sc.nextInt();
        System.out.println("Your Income is :  "+income);

        //# for 5 %
        float five_per= (float) (income*0.05);

        //# for 20 %
        float twenty_per=(float) (income*0.20);

        //# for 30 %
        float thirty_per=(float) (income*0.30);


        if (income < 250000){
            System.out.println("You don't need to pay Tax !!!");
        }
        else if (income<500000)
        {
            System.out.println("You have to 5% Tax " + "i.e "+ "Rs. "+five_per);
        }
        else if (income<1000000)
        {
            System.out.println("You have to 20% Tax  " + "i.e "+ "Rs. "+ twenty_per);
        }
        else {
            System.out.println("You have to 30% Tax " + "i.e. "+ "Rs. "+ thirty_per);
        }
*/

/*

        // 4. Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]

        System.out.print("Enter Days Number :- ");
        Scanner ds = new Scanner(System.in);
        int day = ds.nextInt();



        //                day = 1;
        //                day = 2;
        //                day = 3;
        //                day = 4;
        //                day = 5;
        //                day = 6;
        //                day = 7;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");

         //  case 10:
         // System.out.println(" HEX ");

            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            case 8 -> System.out.print("Weekend");
        }

*/

        /*
        // 5. Write a Java program to find whether a year entered by the user is a leap year or not.


        System.out.print("Enter Year :- ");
        Scanner yr = new Scanner(System.in);
        int year = yr.nextInt();
        if (year%400==0){
            System.out.println("Leap year");
        }
        else if (year%4==0){
            System.out.println("Leap Year");
        }
        else if (year%100==0){
            System.out.println("Not Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }

        */

        /*
        // 6. Write a program to find out the type of website from the URL:
        // .com – commercial website
        //
        //.org – organization website
        //
        //.in – Indian website


        System.out.print("Enter Any Website:- ");
        Scanner wb = new Scanner(System.in);
        String website = wb.nextLine();
        System.out.println(website);

        if (website.endsWith(".com")){
            System.out.println(" It is Commercial Website");
        }
        else if (website.endsWith(".org")){
            System.out.println(" It is Organizational Website");
        }
        else if (website.endsWith(".in")){
            System.out.println(" It is Indian Website");
        }
        else {
            System.out.println("Invalid Domain Name !!! Kindly Check !!!");
        }


*/


    }
}
