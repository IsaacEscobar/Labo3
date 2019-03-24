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

  public void startHospitalize(String petName, MedicalRecord medRecord, Medicines medicine){
    boolean bPets = false;
    for(int i = 0; i < pets.size() && !bPets; i++) {
      if(!pets.get(i).getName().equals(petName)){
        bPets = true;
        pets.get(i).addMedRecord(medRecord, medicine);
      }
    }
  }

  public void showClientPetMedicalRecord() {
    for(int i = 0; i < pets.size(); i++) {
      pets.get(i).showMedicalRecord();
    }
  }
}
