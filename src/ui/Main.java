package ui;

import model.*;

import java.util.Scanner;

public class Main {

  private Veterinary veterinary;
  private Scanner readerString;
  private Scanner readerInt;

  public Main() {
    readerString = new Scanner(System.in);
    readerInt = new Scanner(System.in);
    init();
  }

  public static void main(String[] args) {
    Main m = new Main();
    m.Menu();
  }

  public void init() {
    veterinary = new Veterinary();
    //Client Angela = new Client("Angela", "1006206201", "Calle 10", "3208810");
    //Pet Mateo = new Pet("Mateo", "Perro", 12, 15.0, Angela);
  }

  public void Menu() {
    int option = 0;
    do{
      optionsToChoose();
      option = readerInt.nextInt();
      switch(option) {
        // case 1:
        // addClient();
        // break;
        case 1:
          hospitalizePet();
        break;
        case 2:
          showMedicalRecord();
        break;
        case 3:
          takeOutAPet();
        break;
      }
    }
    while(option != 4);
  }

  public void optionsToChoose() {
    System.out.println("");
    System.out.println("_____________________________________________________");
    System.out.println("_____________________________________________________");
    System.out.println("-----------------------------------------------------");
    System.out.println("---Bienvenido a la veterinaria Mi pequenha mascota---");
    System.out.println("-----------------------------------------------------");
    System.out.println("----- Escoja alguna de las siguientes opciones  -----");
    System.out.println("-----------------------------------------------------");
    System.out.println("--1. Hospitalizar una mascota.");
    System.out.println("--2. Ver el informe de las historias clinicas.");
    System.out.println("--3. Dar de alta a una mascota.");
    System.out.println("--4. Salir del sistema");
    System.out.println("_____________________________________________________");
    System.out.println("_____________________________________________________");
  }

  // public void addClient() {
  //   String name = "";
  //   int id = 0;
  //   String address = "";
  //   int phoneNumber = 0;
  //   System.out.println("");
  //   System.out.println("Digite el nombre: ");
  //   name = readerString.nextLine();
  //   System.out.println("Digite el id: ");
  //   id = readerInt.nextInt();
  //   System.out.println("Digite la direccion: ");
  //   address = readerString.nextLine();
  //   System.out.println("Digite el numero de telefono: ");
  //   phoneNumber = readerInt.nextInt();
  //   Client client = new Client(name, id, address, phoneNumber);
  //   veterinary.addNewClient(client);
  // }

  public void hospitalizePet() {
    if(veterinary.emptyRoom()) {
      System.out.println("");
      String petName = "";
      String petType = "";
      int petAge = 0;
      double petWeight = 0.0;
      String name = "";
      String id = "";
      String address = "";
      String phoneNumber = "";
      System.out.println("Digite el nombre de la mascota: ");
      petName = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite el tipo de la mascota: ");
      System.out.println("--1. Perro.");
      System.out.println("--2. Gato.");
      System.out.println("--3. Ave.");
      System.out.println("--4. Otro.");
      System.out.println("");
      petType = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite la edad de la mascota: ");
      petAge = readerInt.nextInt();
      System.out.println("");
      System.out.println("Digite el peso de la mascota: ");
      String userResponse = readerString.nextLine();
      petWeight = Double.valueOf(userResponse);
      System.out.println("");
      System.out.println("Digite lo sintomas de la mascota: ");
      String symptoms = readerString.nextLine();
      System.out.println("");
      //
      System.out.println("Digite el nombre del cliente: ");
      name = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite el id del cliente: ");
      id = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite la direccion del cliente: ");
      address = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite el numero de telefono del cliente: ");
      phoneNumber = readerString.nextLine();
      System.out.println("");
      Client client = new Client(name, id, address, phoneNumber);
      Pet pet = new Pet(petName, petType, petAge, petWeight, symptoms, client);
      veterinary.addNewClient(client);
      veterinary.addNewPet(client, pet);
      veterinary.setRoomAvailabilityFalse(pet);
      System.out.println("Digite el dia de ingreso: ");
      int entryDay = readerInt.nextInt();
      System.out.println("");
      System.out.println("Digite el mes de ingreso: ");
      int entryMonth = readerInt.nextInt();
      System.out.println("");
      System.out.println("Digite el anho de ingreso: ");
      int entryYear = readerInt.nextInt();
      System.out.println("");
      System.out.println("Digite el diagnostico: ");
      String diagnosis = readerString.nextLine();
      System.out.println("");
      // Pet pet2 = principal.findPett(nameClie, idClie, namePe);
      MedicalRecord medRecord = new MedicalRecord(name, id, petName, symptoms, entryDay, entryMonth, entryYear, diagnosis);
      System.out.println("Digite el nombre del medicamento: ");
      String medicine = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite la dosis");
      String doseResponse = readerString.nextLine();
      double dose = Double.valueOf(doseResponse);
      System.out.println("");
      System.out.println("Digite el costo del medicamento: ");
      String doseCostResponse = readerString.nextLine();
      double doseCost = Double.valueOf(doseCostResponse);
      System.out.println("");
      System.out.println("Digite la frecuencia del medicamento: ");
      int frecuency = readerInt.nextInt();
      System.out.println("");
      Medicines medicines = new Medicines(medicine, dose, doseCost, frecuency);
      veterinary.hospitalizeVet(name, id, petName, medRecord, medicines);
      System.out.println("La mascota ha sido agregada al servicio satisfactoriamente.");
    }
    else {
      System.out.println("");
      System.out.println("Todos los cuartos se encuentran llenos, por favor intente mas tarde.");
    }
  }

  public void showMedicalRecord() {
    veterinary.showAllMedicalRecords();
  }

  public void takeOutAPet() {
    if(veterinary.emptyRoom() == false) {
      System.out.println("Digite el numero del cuarto y despues el nombre de la mascota: ");
      veterinary.showPetsNames();
      int numberOfRoom = readerInt.nextInt();
      String petToTake = readerString.nextLine();
      veterinary.takeOutOfARoom(numberOfRoom, petToTake);
    }
    else {
      System.out.println("Todos los cuartos se encuentran vacios.");
    }
  }
}
