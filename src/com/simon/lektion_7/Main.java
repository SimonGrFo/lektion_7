package com.simon.lektion_7;

import com.simon.lektion_7.models.Cat;
import com.simon.lektion_7.models.Dog;

public class Main {
    public static void main(String[] args) {

        // instantiate objects
        Cat kasper = new Cat();
        Dog dog = new Dog();

        kasper.name();
        kasper.eat();
        kasper.move();
        kasper.sleep();
        kasper.makeSound();
        kasper.typeOfAnimal("cat");

        dog.name();
        dog.eat();
        dog.move();
        dog.sleep();
        dog.makeSound();
        dog.typeOfAnimal("dog");






    }
}

/*
 Interfaces




*/
