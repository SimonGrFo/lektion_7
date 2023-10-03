package com.simon.lektion_7.models;

// abstract - Inheritance
// by default methods are public
// uses keyword implements
public interface Animal {

    // TODO - SUPER IMPORTANT private vis/mod
    // TODO - errors?

    // abstract method
    void name();
    void move();
    void eat();
    void sleep();
    void makeSound();

    // default
    default void typeOfAnimal(String typeOfAnimal) {
        System.out.println(typeOfAnimal);
    }

}
