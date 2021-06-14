package com.appxstudioinc;

public class String_Practise_Set {
    public static void main(String[] args) {

        //  1. program to convert given string to lower case
        String Dell = "Hey Buddies I am Dell";
        System.out.println("The lowercase of given String is "+Dell.toLowerCase());

        //  2. program to replace character
        String A = "Fox";
        System.out.println("The replaced version of Fox is "+A.replace("F","B"));

        //  3. program to replace string
        String wish = "Dear <|name|>, Thanks a lots";
        System.out.println(wish.replace("<|name|>","Krishna"));

        //  4. program to detect double triple spaces in string
        String Apple = "I am so Expensive   ";
        int len = Apple.length();
        System.out.println(len);
        System.out.println(Apple.trim().length());
        if(len>Apple.trim().length());
        System.out.println("Yes It has spaces\n--------------------");

        // another method of solving upper problem
        String myBio = "Hi I am krishna  Kumar    Mukhiya";
        System.out.println(myBio.indexOf("  "));
        System.out.println(myBio.indexOf("   "));
        System.out.println("!!! Checked !!!");


        //  5. program to use escape sequence
        System.out.println("Letter = Dear Krishna, This Code snippet is nice, Thanks !!!");
        System.out.println("\"Dear Krishna, This Code snippet is nice, Thanks !!!\"");






    }
}
