package com.appxstudioinc;

import java.io.InputStream;
import java.util.Scanner;

public class ElectricityBill {
    int ConsumerNumber;
    int ConsumerName;
    int PreviousMonthReading;
    int CurrentMonthReading;


    public ElectricityBill(Object in) {


    }

    public void setConsumerName(int nextInt) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        String str= sc.nextLine();              //reads string
        System.out.println("Enter Name: \n");
    }

    public void setCurrentMonthReading(int nextInt) {
    }

    public void setConsumerNumber(int nextInt) {
    }

    public void setPreviousMonthReading(int nextInt) {
    }

    public void setIsDomestic(boolean domestic) {
    }

//    public Object calculateBillAmount() {


//    }
}
