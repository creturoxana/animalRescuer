package org.example;

public class Adopter extends Human {

  double money;

  public Adopter(String name, String sex, int age) {
    super(name, sex, age);
  }

  public void feed(Animal animal, AnimalFood animalFood) {
    System.out.println(super.getName() + " just gave some " + animalFood.getName() + " to " + animal.getName());
    animal.setHungerLevel(animal.getHungerLevel() - 1);
    if(animalFood.getName().equals(animal.getFavouriteFood())){
      //animal.temperLevel++;
      animal.setTemperLevel(animal.getTemperLevel() + 1);
      System.out.println(animal.getTemperLevel());
    }
  }


  public void activity(Animal animal, RecreationActivity activity) {
    System.out.println(super.getName() + " " + activity.getName() + " with " + animal.getName());
    animal.setTemperLevel(animal.getTemperLevel() + 1);
    if(activity.getName().equals(animal.getFavouriteActivity())) {
      animal.setTemperLevel(animal.getTemperLevel() + 2);

    }
    else animal.setTemperLevel(animal.getTemperLevel() + 1);


  }

}
