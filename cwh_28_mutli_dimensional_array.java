package com.appxstudioinc;

import java.util.Arrays;

public class cwh_28_mutli_dimensional_array {
    public static void main(String[] args) {

        int [] rollno;// 1-D Arrays

        int [][] hotelfloor; // 2-D Arrays
        String [][] Species ; // String Array


        int [][] mallfloor = new int[2][3];
        mallfloor [0][0]=101;
        mallfloor [0][1]=102;
        mallfloor [0][2]=103;
        mallfloor [1][0]=201;
        mallfloor [1][1]=202;
        mallfloor [1][2]=203;

    // Displaying Array
    for(int[] floor:mallfloor){
        System.out.println(Arrays.toString(floor));
        String a = Arrays.toString(floor);
    }
//        System.out.println(Arrays.toString(floor));
        // By another ways

        for(int i=0;i<mallfloor.length;i++) {
            for (int j=0;j<mallfloor.length;j++){
                System.out.print(mallfloor[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

}
}
