package model;

public class Pet {

  private String name;
  private String animalType;
  private int age;
  private double weight;
  private MedicalRecord[] record;

  private Client client;

  public Pet(String name, String animalType, int age, double weight, Client client) {
    this.name = name;
    this.animalType = animalType;
    this.age = age;
    this.weight = weight;
    this.client = client;
    record = new MedicalRecord[1];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public  Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
