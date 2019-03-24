package model;

import java.util.ArrayList;

public class Pet {

  private String name;
  private String animalType;
  private int age;
  private double weight;
  private ArrayList<MedicalRecord> records;
  private Client client;

  public Pet(String name, String animalType, int age, double weight, String symptoms, Client client) {
    this.name = name;
    this.animalType = animalType;
    this.age = age;
    this.weight = weight;
    this.client = client;
    records = new ArrayList<MedicalRecord>();
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

  public  Client getclient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public ArrayList<MedicalRecord> showMedicalRecord(){
    ArrayList<MedicalRecord> record = new ArrayList<MedicalRecord>();
    for(int i = 0; i < record.size(); i++) {
      records.add(record.get(i));
    }
    return record;
  }

  public String showInfoPet(){
    String message = "";
    message += "Su nombre es:" + name + "\n";
    message += "Su edad es:" + age + "\n";
    message += "Su peso es:" + weight + "\n";
    message += "Su tipo es" + animalType + "\n";
    return message;
  }

  public void addMedRecord(MedicalRecord medRecord, Medicines medicine){
    medRecord.setPetInfo(showInfoPet());
    records.add(medRecord);
    records.get(records.size()-1).addMedicines(medicine);

  }
}
