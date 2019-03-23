package model;

import java.util.ArrayList;

public class Client {

  private String name;
  private String id;
  private String address;
  private String phoneNumber;
  private ArrayList<Pet> pets;

  public Client(String name, String  id, String address, String phoneNumber) {
    this.name = name;
    this.id = id;
    this.address = address;
    this.phoneNumber = phoneNumber;
    pets = new ArrayList<Pet>();
    // Client Angela = new Client("Angela", "1006206201", "Calle 10", "3208810");
    // Pet Mateo = new Pet("Mateo", "Perro", 12, 15.0, Angela);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void addPet(Pet newPet) {
    pets.add(newPet);
  }

  public void showPets() {
    System.out.println(pets.get(0).getName());
  }
}
