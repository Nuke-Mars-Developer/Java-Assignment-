package com.appxstudioinc;

public class cwk33_varArgs {

    public static void main(String[] args) {



        System.out.println("### Testing VarArgs ###");
        System.out.println("The sum of 5 and 6 is : "+sum(5, 6));
        System.out.println("The sum of 5 ,8, 9 is : "+sum(5, 8, 9));
        System.out.println("The sum of 9 and 6 is : "+sum(9, 6));
        System.out.println("The sum of 25 , 61 and 71 is : "+sum(25, 61, 71));
        System.out.println("The sum of 5 and 6 is : "+sum(5, 6));

    }
    static int sum(int a, int ...array){  // take one element is  complusory ; one integer

        int totalsum=0;
        for (int element:array){
//             totalsum =totalsum+ element+a;
             totalsum += element+a;
        }
        return totalsum;
    }
}
