package com.simon.lektion_7.models;

// Abstract Class - market by keyword:abstract
// can inherit from both interface and abstract classes
public abstract class AAnimal {

    // includes abstract, excludes body
    public abstract void eat();

    // Ordinary method - excludes abstract
    public void makeSound() {
        System.out.println("Raaaaaaaaah!!!");
    }

}
