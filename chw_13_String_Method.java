package com.appxstudioinc;

public class chw_13_String_Method {
    public static void main(String[] args) {

        String name = "||  AppX Studio Inc  ||";
        System.out.println(name);

        //String Length
        System.out.println("The length of String is "+name.length());

        // LowerCase
        System.out.println("The Lowercase of String is "+name.toLowerCase());

        // UpperCase
        System.out.println("The Uppercase of String is "+name.toUpperCase());

        //trim      IT remove unnecessary spaces from String
        System.out.println("The trim of String is "+name.trim());

        //Substring     it remove initial string as user value
        System.out.println("The Substring of String is "+name.substring(5));

        //Replace
        System.out.println("The Replace of String is "+name.replace("Inc" , "Corporation"));

        //StartsWith            it check that whether it is start with user input value or not
        System.out.println("The Startswith of String is "+name.startsWith("||"));

        //EndsWith              it check whether it ends with user input value or not
        System.out.println("The Endswith of String is "+name.endsWith("Inc"));

        //CharAt                it check the position of String as per user input
        System.out.println("The CharAt of String is "+name.charAt(5));

        //IndexOf
        System.out.println("The IndexOf of String is "+name.indexOf("App"));
        System.out.println("The IndexOf of String is "+name.indexOf("t")); // ||  finds the positon of t in the string...
        System.out.println("The IndexOf of String is "+name.indexOf("S",3));// find position of S and start counting from 3 in this string --->>  ||  AppX Studio Inc  ||
        System.out.println("The IndexOf of String is "+name.indexOf("App",2));//find position of App and start counting from 2 in this string  -->>   ||  AppX Studio Inc  ||



        //lastIndexOf("r")
        System.out.println("The lastIndexOf of String is "+name.lastIndexOf("dio",3));// find position of dio and  in the string & counting from last 3 character --->>  ||  AppX Studio Inc  ||
        System.out.println("The lastIndexOf of String is "+ name.lastIndexOf("t")); //find position of t and  in the string & counting from last--->>  ||  AppX Studio Inc  ||

        // lastIndexOf("r" "2")
        System.out.println("The lastIndexOf of String is "+ name.lastIndexOf("o")); //find position of o and  in the string & counting from last--->>  ||  AppX Studio Inc  ||
        System.out.println("The lastIndexOf of String is "+ name.lastIndexOf("io",4));//find position of io and  in the string & counting from last 4 (leaving last)digit --->>  ||  AppX Studio Inc  ||


        //equals
        System.out.println(name.equals("AppX")); // to check the string is equals to original string


        //equalsIngoreCase
        System.out.println(name.equalsIgnoreCase("Studio")); //to check by ignoring certain word input by user


        // Escape Sequence


        //For Tab
        System.out.println("I am JAVA \t Programming ");// used to put tab(space)

        //For double quotes
        System.out.println("How are You ? You \"re Welcome To JAVA Programming ");// used to put double quote( " ) inside code statement

        //For nextline
        System.out.println("As You know I\'m JAVA \nAndroid App is using by Me ");//used to print next line in code statement

        //For Single Quotes
        System.out.println("Be with me I\'m very Fun Language");

        //and more....









    }
}
