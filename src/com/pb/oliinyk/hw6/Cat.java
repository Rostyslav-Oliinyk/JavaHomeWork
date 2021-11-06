package com.pb.oliinyk.hw6;

import java.util.Objects;

public class Cat extends Animal {

    public String purrs;

    @Override
    public void makeNoise(String nameAnimal)
    {
        System.out.println(nameAnimal + " шумит в" + location);
    };

    @Override
    public void eat(String nameAnimal)
    {
        System.out.println(nameAnimal + " ест" + food);
    };

    @Override
    public String toString() {
        return "Cat{" +
                "purrs='" + purrs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(purrs, cat.purrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purrs);
    }
}
