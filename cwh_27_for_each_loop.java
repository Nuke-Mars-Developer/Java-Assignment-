package com.appxstudioinc;

import java.util.Arrays;

public class cwh_27_for_each_loop {
    public static void main(String[] args) {

        System.out.println("\n---Integer Array---");
        int [] marks = {51, 65,85, 68, 78, 90, 81, 70};

        System.out.println(Arrays.toString(marks));
        System.out.println("Length of Mark Array : "+marks.length);

//        System.out.println("\n---Float Array---");
//        float [] height = { 5.6f, 4.2f, 5.1f, 6.0f, 6.5f, 4.9f };
//        System.out.println(Arrays.toString(height));
//        System.out.println(height.length);
//        System.out.println(height[0]);
//        System.out.println(height[2]);
//        System.out.println(height[3]);
//        System.out.println(height[1]);
//
//        System.out.println("\n---String Array---");
//        String [] name = {"Manoj", "Nitin", "Nithish", "Madhesh", "Prasnjit"};
//        System.out.println(Arrays.toString(name));
////        System.out.println
//        String newName = name[4]+" "+name[2]+" "+name[0];
//        System.out.println(newName);

//      This is using For loop as usual loop
        for (int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("\n------------Enhanced Loop------------");
        // This is enhanced for loop
        for (int mark : marks) {
            System.out.println(mark);
        }

    }
}
