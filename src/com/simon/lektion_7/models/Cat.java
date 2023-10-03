package com.simon.lektion_7.models;

public class Cat implements Animal{

    @Override
    public void move() {
        System.out.println("jumps around");

    }

    @Override
    public void eat() {
        System.out.println("bleh");

    }

    @Override
    public void sleep() {
        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZ");

    }

    @Override
    public void makeSound() {
        System.out.println("rawr");

    }
}
