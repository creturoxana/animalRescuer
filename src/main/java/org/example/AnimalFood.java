package org.example;

import java.time.LocalDate;

public class AnimalFood {

  String name;
  double price;
  double quantity;
  LocalDate expiryDate;
  boolean inStock;

  public AnimalFood(String name, double price, double quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
}
