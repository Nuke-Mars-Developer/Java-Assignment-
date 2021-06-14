package com.appxstudioinc.OOPS;

import java.util.Scanner;

public class cwk2_basic_OOPS_Questions {

    public static class Employee {
        String name;
        int salary;

        public int getSalary(int salary) {
            Scanner scanner = new Scanner(System.in);
            int salary1 = scanner.nextInt();
            return salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            String nameOfEmployee = name;
        }

    }

    static class cellphone {

        public void ring() {
            System.out.println("Ringing");
        }

        public void vibrate() {
            System.out.println("Vibrating");
        }

        public void call() {
            System.out.println("Calling Krishna Kumar Mukhiya");
        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- QN 1 ----------");
        /*
         *  1. Create a class Employee with the following properties and methods:
         * Salary (property) (int)
         * getSalary (method returning int)
         * name (property) (String)
         * getName (method returning String)
         * setName (method changing name)
         */
        Employee Employee1 = new Employee();
        Employee1.name = "Krishna Kumar Mukhiya";
        Employee1.salary = 54900;
        System.out.println(Employee1.name + "\n" + Employee1.salary);


        // 2  Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
        System.out.println("---------Qn 2 Printing cellphone Function --------");
        cellphone cellphone = new cellphone();
        cellphone.vibrate();
        cellphone.ring();
        cellphone.call();

        // 3 Create a class Square with a method to initialize its side, calculating area, perimeter etc.
        System.out.println("---------- QN 3 ----------");
        Square square = new Square();
        int areaofsquare = square.area(6);
        System.out.println("Area : " + areaofsquare);

        int perimeterofsquare = square.perimeter(9);
        System.out.println("Perimeter : " + perimeterofsquare);

        System.out.println("---------- QN 4 ----------");
        // 4.Create a class Square with a method to initialize its side, calculating area, perimeter etc.
        Rectangle rectangle = new Rectangle();
        System.out.println("Area of Rectangle  : " + rectangle.area(5, 6) + " cm2");
        System.out.println("Perimeter of Rectangle  : " + rectangle.perimeter(6, 7) + " cm");

        System.out.println("---------- QN 5 ----------");
        // 5. Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
        TommyVecetti gta5 = new TommyVecetti();
        System.out.println("GTA 5 Options");
        gta5.run();
        gta5.hit();
        gta5.fire();

        System.out.println("---------- QN 6 ----------");
        // 6 Repeat problem 4 for a circle.
        Circle circle = new Circle();
        System.out.println("Area of Circle : " + circle.area(4.5F) + "cm2");
        System.out.println("Perimeter | Circumference of Circle : " + circle.perimeter(8.2F) + "cm");


    }

    static class Square {
        int side;
        int area;
        int perimeter;

        int area(int side) {
            area = side * side;
            return area;
        }

        int perimeter(int side) {
            perimeter = 4 * side;
            return perimeter;
        }

    }

    static class Rectangle {
        int length;
        int breadth;
        int area;
        int perimeter;

        int area(int length, int breadth) {
            area = length * breadth;
            return area;
        }

        int perimeter(int length, int breadth) {
            perimeter = 2 * (length + breadth);
            return perimeter;
        }
    }


    static class TommyVecetti {
        public void hit() {
            System.out.println("Hitting Target !!!");
        }

        public void run() {
            System.out.println("Running");
        }

        public void fire() {
            System.out.println("Firing Machine Gun");
        }
    }

    static class Circle {
        float area;
        float circumference;

        public float area(float radius) {
            area = (float) (2 * radius * radius);
            return area;
        }

        public float perimeter(float radius) {
            circumference = (float) (2 * 3.14 * radius);
            return circumference;
        }
    }


}
