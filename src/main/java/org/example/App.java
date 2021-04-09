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

        Adopter adopter = new Adopter("John","male",12);
        adopter.money = 100;

        AnimalFood food = new AnimalFood("bones",15,1.5);
        food.inStock = true;
        food.expiryDate = LocalDate.of(2021, 11, 30);

        adopter.feed(animal, food);

        Vet vet = new Vet("Anna", "female", 30);
        vet.specialization = "canine and feline";

        RecreationActivity activity = new RecreationActivity();
        activity.name = "play sticks";

        adopter.activity(animal,activity);




        Dog dog = new Dog();
    }
}
