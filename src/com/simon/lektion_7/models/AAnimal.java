package com.simon.lektion_7.models;

// Abstract Class - market by keyword:abstract
public abstract class AAnimal {

    // includes abstract, excludes body
    public abstract void eat();

    // Ordinary method - excludes abstract
    public void makeSound() {
        System.out.println("Raaaaaaaaah");
    }

}
