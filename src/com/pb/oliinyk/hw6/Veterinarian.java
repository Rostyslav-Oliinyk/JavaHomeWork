package com.pb.oliinyk.hw6;

public class Veterinarian  {
    Animal animal = new Animal();
    public void treatAnimal(Animal animal)
    {
        System.out.println(animal.name + " ест " + animal.food + " и живет в "+ animal.location );
    }
}