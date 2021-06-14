package com.appxstudioinc.problemset_method;

import java.util.Scanner;

public class cwk31_methodp3 {

//Write a value-returning method, isVowel that returns the value true
// if a given character is a vowel, and otherwise returns false.
// In main() method accept a string from user and count number
// of vowels in that string.
    public static void main(String[] args) {
        System.out.println("Method in Java");

        System.out.println("Enter any word : ");
        Scanner scanner = new Scanner(System.in);
        String fullstring = scanner.nextLine();
        System.out.println("You have entered this string : "+fullstring);
        System.out.println("Total no of letters are : "+fullstring.length()+" letters");
        // to count total number of vowel in letters
        int count=0;
        for (int i=0; i<fullstring.length();i++){
            if (isVowel(fullstring.charAt(i)))
            {
                count++;
            }
        }
        System.out.println("Number of vowels : "+count);
        }

        public static boolean isVowel(char letter) {
        switch (letter)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;


        }

        }
}
