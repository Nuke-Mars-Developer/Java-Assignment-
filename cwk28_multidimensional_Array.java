package com.appxstudioinc;

import java.util.Arrays;

public class cwk28_multidimensional_Array {
    public static void main(String[] args) {

        //Printing 2D Array

        int [][] rooms;
        rooms = new int [3][3];

        rooms[0][0] = 101;
        rooms[0][1] = 102;
        rooms[0][2] = 103;

        rooms[1][0] = 201;
        rooms[1][1] = 202;
        rooms[1][2] = 203;

        rooms[2][0] = 301;
        rooms[2][1] = 302;
        rooms[2][2] = 303;

        System.out.println(Arrays.deepToString(rooms));
        System.out.println("|--- Printing 2D Array using for Loop ---|");
        for (int i = 0; i <rooms.length; i++){
            for (int j = 0; j <rooms[i].length;j++){
                System.out.print(rooms[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }




    }
}
