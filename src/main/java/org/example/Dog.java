package org.example;

public class Dog extends Animal {

  private String breed;
  private boolean eatShoes;

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
