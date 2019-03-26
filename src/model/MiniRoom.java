package model;

public class MiniRoom {

  private boolean availability;
  private double price;
  private int days;
  private double total;
  private Pet petInRoom;

  public MiniRoom(boolean availability, double price, int days, double total, Pet petInRoom) {
    this.availability = availability;
    this.price = price;
    this.days = days;
    this.total = total;
    this.petInRoom = petInRoom;
  }

  public boolean isAvailability() {
    return availability;
  }

  public void setAvailability(boolean availability) {
    this.availability = availability;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getDays() {
    return days;
  }

  public void setDays(int days) {
    this.days = days;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public Pet getPetInRoom() {
    return petInRoom;
  }

  public void setPetInRoom(Pet petInRoom) {
    this.petInRoom = petInRoom;
  }

  public String showPet() {
    return System.out.println(getPetInRoom().getName());
  }
}
