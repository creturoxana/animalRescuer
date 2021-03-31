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
        animal.name = "Gigi";
        animal.type = "dog";
        animal.age = 0.6;
        animal.healthLevel = 9;
        animal.hungerLevel = 7;
        animal.temperLevel = 8.5;
        animal.favouriteActivity = "run";
        animal.favouriteFood = "bones";

        Adopter adopter = new Adopter();
        adopter.name = "John";
        adopter.money = 100;

        Vet vet = new Vet();
        vet.name = "Anna";
        vet.specialization = "canine and feline";

        RecreationActivity activity = new RecreationActivity();
        activity.name = "play";

        AnimalFood food = new AnimalFood();
        food.name = "dog food";
        food.quantity = 15;
        food.price = 1.5;
        food.inStock = true;
        food.expiryDate = LocalDate.of(2021, 11, 30);



    }
}
