package com.michael.newjava.O_O_P;

public class MethodOverloading {

    public int add(int x, int y) {
        return x + y;
    }

    public String add(String Firstname, String Lastname) {
        return Firstname + " " + Lastname;
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add("Michael", "Okoh");

        System.out.println(obj.add(2, 7));

        System.out.println(new MethodOverloading().add("Michael", "Okoh"));
    }
}
