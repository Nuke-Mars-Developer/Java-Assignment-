package com.appxstudioinc.OOPS;

import java.util.Random;
import java.util.Scanner;

//public class ConstructorExercise {
//}

class Game {

    private int userInput;
    private int systemInput;

    public int getSystemInput() {
        return systemInput;
    }

    public void setSystemInput(int systemInput) {
        this.systemInput = systemInput;
    }
    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public int gameX(int systemInputX) {
        systemInputX = systemInput;
        return systemInputX;
    }
    public int takeUserInput(int x) {
        x = userInput;
        return x;
    }
    public void isCorrectNumber(int x, int y, int w) {
        int z = x-y;
        z = Math.abs(z);
        if (x == y) {
            System.out.println("Both are equal!!! \nExiting now...");
            System.out.format("Total guesses: %d", w+1);
            System.exit(0);
        } else if (z >= 11) {
            System.out.println("Difference between both is more than 10. Try more. \nExiting now...");
            System.exit(0);
        } else {
            System.out.println("Difference between both is of 10. You can try more...");
        }
    }
}

public class ConstructorExercise {
    public static void main(String[] args) {

        int noOfGuesses = 1;
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        Game gameMode = new Game();

        int systemInput = rm.nextInt(100);
        gameMode.setSystemInput(systemInput);

        System.out.print("Please enter a no (0-100): ");
        int userInput = sc.nextInt();
        gameMode.setUserInput(userInput);

        System.out.format("System input: %d\n" ,gameMode.gameX(systemInput));

        gameMode.isCorrectNumber(userInput, gameMode.gameX(systemInput), noOfGuesses);
        if (userInput != gameMode.gameX(systemInput)) {
            while (true){
                System.out.println("Please reenter the value: ");
                userInput = sc.nextInt();
                gameMode.isCorrectNumber(userInput, gameMode.gameX(systemInput), noOfGuesses);
                noOfGuesses++;
            }
        }

    }
}