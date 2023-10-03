package com.simon.lektion_7.models;

public class Dog implements Animal{
    @Override
    public void name() {
        System.out.println("Dog");
    }

    @Override
    public void move() {
        System.out.println("Hovers 20 centimeters off the ground");
    }

    @Override
    public void eat() {
        System.out.println("NomNomNomNomNom");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz Mimimimimimi zzzzzz mimimimimimi");
    }

    @Override
    public void makeSound() {
        System.out.println("ARf, Arf, Woof, Woof");
    }
}
