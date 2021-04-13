package org.example;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal animal = new Animal();
        animal.setName("Gigi");
        animal.setType("dog");
        animal.setAge(0.6);
        animal.setHealthLevel(9);
        animal.setHungerLevel(7);
        animal.setTemperLevel(8.5);
        animal.setFavouriteActivity("run");
        animal.setFavouriteFood("bones");

        Adopter adopter = new Adopter("John","male",12);
        adopter.money = 100;

        AnimalFood food = new AnimalFood("bones",15,1.5);
        food.setInStock(true);
        food.setExpiryDate(LocalDate.of(2021, 11, 30));

        adopter.feed(animal, food);

        Vet vet = new Vet("Anna", "female", 30);
        vet.setSpecialization("canine and feline");

        RecreationActivity activity = new RecreationActivity();
        activity.setName("play sticks");

        adopter.activity(animal,activity);




        Dog dog = new Dog();
        dog.positiveMood();

        animal.positiveMood();
    }
}
