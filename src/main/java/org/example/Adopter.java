package org.example;

public class Adopter extends Human {

  double money;

  public Adopter(String name, String sex, int age) {
    super(name, sex, age);
  }

  public void feed(Animal animal, AnimalFood animalFood) {
    System.out.println(super.name + " just gave some " + animalFood.name + " to " + animal.name);
    animal.hungerLevel--;
    if(animalFood.name.equals(animal.favouriteFood)){
      //animal.temperLevel++;
      System.out.println(animal.temperLevel+=1);
    }
  }


  public void activity(Animal animal, RecreationActivity activity) {
    System.out.println(super.name + " " + activity.name + " with " + animal.name);
    animal.temperLevel++;
    if(activity.name.equals(animal.favouriteActivity)) {
      animal.temperLevel+=2;
    }
    else animal.temperLevel++;

  }

}
