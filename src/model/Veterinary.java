package model;

import java.util.ArrayList;

public class Veterinary {

  private MiniRoom[] rooms;
  private ArrayList<Client> clients;

  public Veterinary() {
    rooms = new MiniRoom[8];
    clients = new ArrayList<Client>();
    rooms[0] = new MiniRoom(false, 0.0, 0, 0.0, null);
    rooms[1] = new MiniRoom(false, 0.0, 0, 0.0, null);
    rooms[2] = new MiniRoom(false, 0.0, 0, 0.0, null);
    rooms[3] = new MiniRoom(false, 0.0, 0, 0.0, null);
    rooms[4] = new MiniRoom(false, 0.0, 0, 0.0, null);
    rooms[5] = new MiniRoom(false, 0.0, 0, 0.0, null);
    rooms[6] = new MiniRoom(true, 0.0, 0, 0.0, null);
    rooms[7] = new MiniRoom(false, 0.0, 0, 0.0, null);
    // Client client = new Client("Angela", "1006206201", "Calle 10", "3208810");
  }

  public void addNewClient(Client newClient) {
    clients.add(newClient);
  }

  public void addNewPet(Client client, Pet newPet) {
    clients.get(clients.indexOf(client)).addPet(newPet);
  }

  public boolean emptyRoom() {
    boolean isEmpty = false;
    for(int i = 0; i < 8; i++) {
      if(rooms[i].isAvailability() == true) {
        i = 7;
        isEmpty = true;
      }
    }
    return isEmpty;
  }

  // public void showRoom6Availability() {
  //   System.out.println(rooms[6].isAvailability());
  // }

  public void setPetInARoom(Pet pet) {
    for(int i = 0; i < 8; i++) {
      if(rooms[i].isAvailability() == true) {
        i = 7;
        rooms[i].setPetInRoom(pet);
      }
    }
  }

  // public void showClient() {
  //   System.out.println(clients.get(0).getName());
  //   clients.get(0).showPets();
  // }

  public void setRoomAvailabilityFalse(Pet pet) {
    for(int i = 0; i < 8; i++) {
      if(rooms[i].isAvailability() == true) {
        i = 7;
        setPetInARoom(pet);
        rooms[i].setAvailability(false);
      }
    }
  }

  public void showAllMedicalRecords() {
    for(int i = 0; i < clients.size(); i++) {
      clients.get(i).showClientPetMedicalRecord();
    }
  }

  public void hospitalizeVet(String clientName, String clientId , String petName, MedicalRecord medRecord, Medicines medicines){
    boolean stop = false;
    for(int i = 0; i < clients.size() && !stop; i++) {
      if(!clients.get(i).getName().equals(clientName) && clients.get(i).getId() == clientId){
        stop = true;
        clients.get(i).startHospitalize(petName, medRecord, medicines);
      }
      // else {
      //   Pet relation = clients.get(i).findPet(petName);
      // }
    }
  }
}
