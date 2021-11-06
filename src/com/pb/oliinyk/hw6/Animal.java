package com.pb.oliinyk.hw6;

public class Animal {
    public  String food;
    public  String location;
    public  String name;

    public void makeNoise(String nameAnimal)
    {
        System.out.println(nameAnimal + " шумит");
    }
    public void eat(String nameAnimal)
    {
        System.out.println(nameAnimal + " ест");
    }
    public void sleep(String nameAnimal)
    {
        System.out.println(nameAnimal + " спит");
    }
}