package model;

public class Medicines {

  private String name;
  private double dose;
  private double doseCost;
  private double supplyFrecuency;

  public Medicines(String name, double dose, double doseCost, double supplyFrecuency) {
    this.name = name;
    this.dose = dose;
    this.doseCost = doseCost;
    this.supplyFrecuency = supplyFrecuency;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDose() {
    return dose;
  }

  public void setDose(double dose) {
    this.dose = dose;
  }

  public double getDoseCost() {
    return doseCost;
  }

  public void setDoseCost(double doseCost) {
    this.doseCost = doseCost;
  }

  public double getSupplyFrecuency() {
    return supplyFrecuency;
  }

  public void setSupplyFrecuency(double supplyFrecuency) {
    this.supplyFrecuency = supplyFrecuency;
  }
}
