package com.appxstudioinc.OOPS;

import java.util.Random;
import java.util.Scanner;
public class cwk04_paperRock {
    public static void main(String[] args) {
        // rock paper scissors
        // 0 rock
        // 1 paper
        // 2 Scissors
        // 3 Try Again

        //scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Options\n0--> ROCK\n1-->PAPER\n2-->Scissors");
        int UserInput = scanner.nextInt();


        Random random = new Random();
        int ComputerInput = random.nextInt(3);
        System.out.println(ComputerInput);

        if (ComputerInput == UserInput){
            System.out.println(" ---- DRAWS ----");
        }
        else if (ComputerInput == 0 && UserInput == 1 || ComputerInput==1 && UserInput==2 ||
                    ComputerInput == 2 && UserInput==0) {
            System.out.println("-- You WIN --");
        }
        else{
            System.out.println("--- COMPUTER WIN ---");
        }
        if (ComputerInput ==0){
            System.out.println("Computer Choose : ROCKS");
        }
        if (ComputerInput ==1){
            System.out.println("Computer Choose : PAPER");
        }
        if (ComputerInput ==2){
            System.out.println("Computer Choose : SCISSORS");
        }

    }
}
