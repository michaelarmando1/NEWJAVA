package com.michael.newjava.O_O_P;

public class Dog {

   //Constructor for the class dog

//    public Dog() {
//        System.out.println("It is still working");
//    }
//    public Dog(int x) {
//        System.out.println("Hello World!" + " " + x);
//    }
//
//
//    public static void main(String[] args) {
//
//        new Dog();
//        new Dog(6);
//    }

    private String name;
//
    private String breed;
//
    private int age;

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

        System.out.println(name);
        System.out.println(breed);
        System.out.println(age + " months old");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}


