package model;

import java.util.ArrayList;

public class Veterinary {

  private MiniRoom[] rooms;
  private ArrayList<Client> clients;

  public Veterinary() {
    rooms = new MiniRoom[8];
    clients = new ArrayList<Client>();
    MiniRoom room1 = new MiniRoom(true, 12.0, 0, 0.0);
  }

  public void addNewClient(Client newClient) {
    clients.add(newClient);
  }

  public void addNewPet(Client client, Pet newPet) {
    clients.get(clients.indexOf(client)).addPet(newPet);
  }

  public boolean emptyRoom() {
    boolean isEmpty = false;
    for(int i = 0; i < rooms.length; i++) {
      if(rooms[i].isAvailability() == true) {
        i = 8;
        isEmpty = true;
      }
    }
    return isEmpty;
  }

  public void setRoomAvailabilityFalse(MiniRoom rooms) {
    for(int i = 0; i < rooms.length; i++) {
      if(rooms[i].isAvailability() == true) {
        rooms[i].isAvailability() = false;
      }
    }
  }
}
