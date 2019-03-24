package model;

import java.util.ArrayList;

public class MedicalRecord {

  private String clientName;
  private String clientId;
  private String petInfo;
  private String symptoms;
  private int entryDay;
  private int entryMonth;
  private int entryYear;
  private String diagnosis;
  private ArrayList<Medicines> medicines;

  public MedicalRecord(String clientName, String clientId, String petInfo, String symptoms, int entryDay, int entryMonth, int entryYear, String diagnosis) {
    this.clientName = clientName;
    this.clientId = clientId;
    this.petInfo = petInfo;
    this.symptoms = symptoms;
    this.entryDay = entryDay;
    this.entryMonth = entryMonth;
    this.entryYear = entryYear;
    this.diagnosis = diagnosis;
    medicines = new ArrayList<Medicines>();
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getPetInfo() {
    return petInfo;
  }

  public void setPetInfo(String petInfo) {
    this.petInfo = petInfo;
  }

  public String getSymptoms() {
    return symptoms;
  }

  public void setSymptoms(String symptoms) {
    this.symptoms = symptoms;
  }

  public int getEntryDay() {
    return entryDay;
  }

  public void setEntryDay(int entryDay) {
    this.entryDay = entryDay;
  }

  public int getEntryMonth() {
    return entryMonth;
  }

  public void setEntryMonth(int entryMonth) {
    this.entryMonth = entryMonth;
  }

  public int getEntryYear() {
    return entryYear;
  }

  public void setEntryYear(int entryYear) {
    this.entryYear = entryYear;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public void addMedicines(Medicines medicine) {
    medicines.add(medicine);
  }
}
