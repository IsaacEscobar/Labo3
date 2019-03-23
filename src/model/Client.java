package model;

import java.util.ArrayList;

public class Client {

  private String name;
  private int id;
  private String address;
  private int phoneNumber;
  private ArrayList<Pet> pets;

  public Client(String name, int id, String address, int phoneNumber) {
    this.name = name;
    this.id = id;
    this.address = address;
    this.phoneNumber = phoneNumber;
    pets = new ArrayList<Pet>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void addPet(Pet newPet) {
    pets.add(newPet);
  }
}
