package com.michael.newjava.O_O_P.Polymorphism;

public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.animalsound();
        dog.animalsound();
        cat.animalsound();
    }
}
