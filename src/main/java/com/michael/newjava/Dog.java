package com.michael.newjava;

public class Dog extends Cat{
    public void printLegNo() {
        int legs = noOfLegs();
        System.out.println(legs);
    }

    String welcome = "Welcome" + name;

    public static void main(String[] args) {
        new Dog().printLegNo();
        //Dog dog = new Dog();
        //dog.printLegNo();
    }
}
