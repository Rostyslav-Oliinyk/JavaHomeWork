package com.pb.oliinyk.hw6;

import java.util.Objects;

public class Horse extends Animal{

    public String neigh;

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
    public String toString()
    {
        return "Horse{" +
                "neigh='" + neigh + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(neigh, horse.neigh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neigh);
    }
}
//    В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.