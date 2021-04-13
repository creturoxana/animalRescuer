package org.example;

public class Dog extends Animal {

  private String breed;
  private boolean eatShoes;

  @Override
  public void positiveMood() {
    System.out.println(getName() + " is happy when eats");
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public boolean isEatShoes() {
    return eatShoes;
  }

  public void setEatShoes(boolean eatShoes) {
    this.eatShoes = eatShoes;
  }
}
