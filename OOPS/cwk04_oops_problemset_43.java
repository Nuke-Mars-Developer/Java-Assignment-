package com.appxstudioinc.OOPS;

import java.util.Random;
import java.util.Scanner;

public class cwk04_oops_problemset_43 {
    static class Game {
        private int userInput;
        public int gtn = 100;
        private int computerInput;

        public int getUserInput() {
            return userInput;
        }

        public int setUserInput(int userInput) {
            this.userInput = userInput;
            return userInput;
        }

        public int getComputerInput() {
            return computerInput;
        }

        public void setComputerInput(int computerInput) {
            this.computerInput = computerInput;
        }

//        public int noOfGames(int gamescount) {
//            gamescount = computerInput;
//            return gamescount;
//        }

//        public int userInput(int x){
//            userInput=x;
//            return userInput;
//        }
        public int random(){
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            return randomNumber;
        }

        public boolean isCorrectNumber(int x, int y){
            int computerInput = y;
            int userInput = x;
            int counter= 0;
            while (x==y) {
                if (x == y) {
                    System.out.println("!!!Hurray You Guess correct number !!!");
                    System.out.println("You have tried : " + new Game().noOfGuesses(1) + "Chances");
//                System.out.println("You have tried : "+counter+1+"Chances");
                } else if (x > y) {
                    System.out.println("Decrease Your Guessing Little Less  ");
                    System.out.println("You have tried : " + new Game().noOfGuesses(1) + "Chances");
//                System.out.println("You have tried : "+counter+1+"Chances");
                } else {
                    System.out.println("Increase Your Guessing Little Bit ");
                    System.out.println("You have tried : " + new Game().noOfGuesses(1) + "Chances");
//                System.out.println("You have tried : "+counter+1+"Chances");
                }
            }


            return false;
        }

        public int noOfGuesses(int n){
            int guesscount = 0;
            guesscount = guesscount+1;
            return guesscount;
        }






        }





    public static void main(String[] args) {
        System.out.println("=====  PROBLEM SET  =====");
        System.out.println("-----  PROBLEM 1  -----");

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Random number is : "+ new Game().random());
        int random = new Game().random();
        System.out.println(random);
        System.out.println("Guess any number less than 100");
        int user = scanner.nextInt();
        int usernumber = new Game().setUserInput(user);
        System.out.println("Your Input : "+new Game().setUserInput(user));

        boolean game;


        /*
         *Create a class Game, which allows a user to play "Guess the Number" game once.
         *Game should have the following methods:
         *Constructor to generate the random number
         *takeUserInput() to take a user input of number
         *isCorrectNumber() to detect whether the number entered by the user is true
         * getter and setter for noOfGuesses
         * Use properties such as noOfGuesses(int), etc to get this task done!
         * */

//        System.out.println("Computer has selected a random number\nChoose one Number\n" +
//                "We will Check");
//        int yourinput = scanner.nextInt();

//        new Game().userInput(yourinput);
//        System.out.println(yourinput);

        System.out.println(new Game().isCorrectNumber(usernumber,random));




    }


}

