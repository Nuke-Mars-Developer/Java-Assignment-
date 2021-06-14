package com.appxstudioinc.OOPS;


public class cwk1_creating_new_class {

    static class Student{
        protected int rollno;
        String name;
        String S_class;
        String section;
        int hostelfee = 75000;
        int tutionfee = 120000;
        int examfee = 3000;

        public int GetTotalFee(){
           int TotalFee = hostelfee+tutionfee+examfee;
            return TotalFee;

        }



        public boolean printDetails(){
            System.out.println("My name is : "+name);
            System.out.println("My Roll No is : "+rollno);
            System.out.println("My Class is : "+S_class);
            System.out.println("My Section is : "+section);
            System.out.println("Your Fee is Rs : "+GetTotalFee());
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println("--------------1--------------");
        Student student1 = new Student(); //creating an instance of new student

        student1.name = "Krishna Kumar Mukhiya";
        student1.rollno = 1905059;
        student1.S_class = "IT";
        student1.section = "A";
        student1.GetTotalFee();


        student1.printDetails();


        // Printing student 2
        System.out.println("--------------2--------------");
        Student student2 = new Student();
        student2.S_class = "CSE";
        student2.name = "Vivek Kumar Sah";
        student2.rollno = 1901069;
        student2.section = "A";
        student2.printDetails();

        System.out.println("--------------3--------------");
        Student student3 = new Student();
        student3.name = "Aakansha ";
        student3.S_class = "B.M.E";
        student3.rollno = 1965822;
        System.out.println(student3.tutionfee);
        System.out.println(student3.printDetails());
    }
}
