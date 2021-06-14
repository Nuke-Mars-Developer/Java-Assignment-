package com.appxstudioinc.OOPS;

public class cwk3_accessModifiers {

    static class MyFriend{
        String name;
        String City;
        long Phonenumber;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }

        public long getPhonenumber() {
            return Phonenumber;
        }

        public void setPhonenumber(long phonenumber) {
            Phonenumber = phonenumber;
        }
    }
    public static void main(String[] args) {
        System.out.println("---------- ACCESS MODIFIER & GETTER SETTER ----------");
        MyFriend friend = new MyFriend();
        friend.name="Vivek";
        friend.City="Janakpur";
        friend.Phonenumber=9817894374L;

        System.out.println(friend.getName()+"\n"+friend.getCity()+"\n"+friend.getPhonenumber());

    }
}
