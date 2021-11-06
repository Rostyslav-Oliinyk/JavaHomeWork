package com.pb.oliinyk.hw6;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse =  new Horse();
        cat.name = "Барсик";
        dog.name = "Мухтар";
        horse.name = "Строптивый";
        cat.location = "Квартира";
        dog.location = "Дом";
        horse.location = "Конюшня";
        cat.food = "Мышь";
        dog.food = "Кость";
        horse.food = "Трава";
        Animal[] animal = {cat,dog,horse};
        for (int i = 0;i<animal.length; i++)
        {
            if(animal[i] instanceof Animal)
            {
                Class classVeterinarian = Class.forName("wh6.VetClinic");
            }
            // treatAnimal(Animal[i] animal);
        }
    }
}