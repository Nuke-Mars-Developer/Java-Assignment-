package com.appxstudioinc;

import java.util.Scanner;
public class electric_bill_class {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityBill ebill = new ElectricityBill(System.in);
        ebill.setConsumerName(sc.nextInt());
        ebill.setConsumerNumber(sc.nextInt());
        ebill.setPreviousMonthReading(sc.nextInt());
        ebill.setCurrentMonthReading(sc.nextInt());
        ebill.setIsDomestic(sc.next().equals("domestic"));
//        System.out.print("%.2f", ebill.calculateBillAmount());
//
    }


}
