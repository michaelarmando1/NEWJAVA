package com.michael.newjava.O_O_P;

public class Runner {
    public static void main(String[] args) {
        // Dog dog1 = new Dog("Rob", "Wrathweiler", 3);

        //Constructors con = new Constructors();
        //con.print_something();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setName("Romeo");
        dog1.setBreed("Rotweiller");
        dog1.setAge(3);

        dog2.setName("Sky");
        dog2.setBreed("Chiuwawa");
        dog2.setAge(5);

        dog3.setName("Jude");
        dog3.setBreed("BullDog");
        dog3.setAge(6);

        System.out.println("First Dog's Name is " + dog1.getName() + ", He is a " + dog1.getBreed() + " and he is " + dog1.getAge() + " Months Old");
        System.out.println("Second Dog's Name is " + dog2.getName() + ", He is a " + dog2.getBreed() + " and he is " + dog2.getAge() + " Months Old");
        System.out.println("Third Dog's Name is " + dog3.getName() + ", He is a " + dog3.getBreed() + " and he is " + dog3.getAge() + " Months Old");

    }
}
