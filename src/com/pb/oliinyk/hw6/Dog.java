package com.pb.oliinyk.hw6;

import java.util.Objects;

public class Dog extends Animal{

    public String bark;

    @Override
    public void makeNoise(String nameAnimal)
    {
        System.out.println(nameAnimal + " шумит в" + name);
    };
    @Override
    public void eat(String nameAnimal)
    {
        System.out.println(nameAnimal + " ест" + food);
    };

    @Override
    public String toString() {
        return "Dog{" +
                "bark='" + bark + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(bark, dog.bark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bark);
    }
}