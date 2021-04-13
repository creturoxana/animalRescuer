package org.example;

public class Vet extends Human {

  private String specialization;

  public Vet(String name, String sex, int age) {
    super(name, sex, age);
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }
}
