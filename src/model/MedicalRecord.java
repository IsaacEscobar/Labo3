package model;

import java.util.ArrayList;

public class MedicalRecord {

  private int entryDay;
  private int entryMonth;
  private int entryYear;
  private String diagnosis;
  private ArrayList<Medicines> medicines;

  public MedicalRecord(int entryDay, int entryMonth, int entryYear, String diagnosis) {
    this.entryDay = entryDay;
    this.entryMonth = entryMonth;
    this.entryYear = entryYear;
    this.diagnosis = diagnosis;
    medicines = new ArrayList<Medicines>();
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
}
