package com.appxstudioinc.OOPS;

public class cwk06_constructor42 {


    // creating class
    static class StudentData{
        String StudentName;
        int StudentId;
        long StudentContact;

//        class StudentData

//         creating constructor
            public StudentData(String Name){
            StudentName = Name;

         }

//         creating constructor
            public StudentData(String Name, int Id){
            StudentName = Name;
            StudentId = Id;

         }

////         creating constructor
//            public StudentData(int Id, long){
//            StudentName = Name;
//            StudentId = Id;
//
//         }

        public StudentData () {
            StudentName = "Krishna Kumar";
        }

//         creating constructor
            public StudentData(String Name, int Id, long Contact){
            StudentName = Name;
            StudentId = Id;
            StudentContact = Contact;

         }

        public String getStudentName(){
            return StudentName;
        }

        public void setStudentName(String StudentName){
            this.StudentName = StudentName;
        }

        public int getStudentId(){
            return StudentId;
        }

        public void setStudentId(int StudentId){
             this.StudentId = StudentId;
        }

        public long getStudentContact(){
            return StudentContact;
        }

        public void setStudentContact(long StudentContact){
            this.StudentContact = StudentContact;
        }

    }





    public static void main(String[] args) {
        System.out.println("===== CONSTRUCTOR =====");

        StudentData s1 = new StudentData("Krishna",1905059,9817894373L);
//        s1.setStudentName("Vivek Kumar Sah");
        System.out.println(s1.StudentName+" \n"+s1.StudentId+"\n"+s1.StudentContact);

        // using another constructor for vivek
//        StudentData ss = new StudentData(190);
//        s1.setStudentName("Vivek Kumar Sah");
        System.out.println(s1.StudentId+"\n"+s1.StudentContact);

        System.out.println("===== || =====");
        StudentData krishna = new StudentData("Krishna Kumar Mukhiya");
        krishna.setStudentId(1905059);
        krishna.setStudentContact(9817894373L);
        System.out.println(krishna.StudentName);



        }



    }

