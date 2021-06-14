package com.appxstudioinc;
import java.util.Scanner;
class Km_to_meter {
    public static void main(String[] args) {
        System.out.println("Enter The Distance in KM");
        Scanner input = new Scanner(System.in);
        int distance = input.nextInt();
        int conversion = distance*1000;
        System.out.println("The Length of Given Distance in metre is :"+ conversion+" METERS");

    }
}
