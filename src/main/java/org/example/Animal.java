package org.example;

public class Animal {

  private String name;
  private String type;
  private double age;
  private double healthLevel;
  private double hungerLevel;
  private double temperLevel;
  private String favouriteFood;
  private String favouriteActivity;
//
//  În proiectul AnimalRescuer, în clasa Animal, creați o metodă prin care să se afișeze în consolă un mesaj
//  din care să se deducă starea de spirit pozitivă a animalului.
//  Apoi suprascrieți această metodă în fiecare sub-clasă a clasei Animal, așa încât mesajul să fie relevant
//  pentru fiecare specie în parte (de exmplu, un câine ar da din coadă, o pisică ar toarce, etc.).

  public void positiveMood(){
    System.out.println(name + " is happy");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getAge() {
    return age;
  }

  public void setAge(double age) {
    this.age = age;
  }

  public double getHealthLevel() {
    return healthLevel;
  }

  public void setHealthLevel(double healthLevel) {
    this.healthLevel = healthLevel;
  }

  public double getHungerLevel() {
    return hungerLevel;
  }

  public void setHungerLevel(double hungerLevel) {
    this.hungerLevel = hungerLevel;
  }

  public double getTemperLevel() {
    return temperLevel;
  }

  public void setTemperLevel(double temperLevel) {
    this.temperLevel = temperLevel;
  }

  public String getFavouriteFood() {
    return favouriteFood;
  }

  public void setFavouriteFood(String favouriteFood) {
    this.favouriteFood = favouriteFood;
  }

  public String getFavouriteActivity() {
    return favouriteActivity;
  }

  public void setFavouriteActivity(String favouriteActivity) {
    this.favouriteActivity = favouriteActivity;
  }
}
