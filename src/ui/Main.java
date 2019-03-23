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
    Client Angela = new Client("Angela", 1006206201, "Calle 10", 3208810);
    Pet Mateo = new Pet("Mateo", "Perro", 12, 15.0, Angela);
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
        addPet();
        break;
      }
      readerString.nextLine();
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
    // System.out.println("--1. Agregar un nuevo cliente.");
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

  public void addPet() {
    if(veterinary.emptyRoom()) {
      System.out.println("");
      String petName = "";
      String petType = "";
      int petAge = 0;
      double petWeight = 0.0;
      String name = "";
      int id = 0;
      String address = "";
      int phoneNumber = 0;
      System.out.println("Digite el nombre de la mascota: ");
      petName = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite el tipo de la mascota: ");
      System.out.println("--1. Perro.");
      System.out.println("--2. Gato.");
      System.out.println("--3. Ave.");
      System.out.println("--4. Otro.");
      petType = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite la edad de la mascota: ");
      petAge = readerInt.nextInt();
      System.out.println("");
      System.out.println("Digite el peso de la mascota: ");
      String userResponse = readerString.nextLine();
      petWeight = Double.valueOf(userResponse);
      System.out.println("");
      //
      System.out.println("Digite el nombre: ");
      name = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite el id: ");
      id = readerInt.nextInt();
      System.out.println("");
      System.out.println("Digite la direccion: ");
      address = readerString.nextLine();
      System.out.println("");
      System.out.println("Digite el numero de telefono: ");
      phoneNumber = readerInt.nextInt();
      System.out.println("");
      // Client client = new Client(name, id, address, phoneNumber);
      // veterinary.addNewClient(client);
      Client client = new Client(name, id, address, phoneNumber);
      Pet pet = new Pet(petName, petType, petAge, petWeight, client);
      veterinary.addNewPet(client, pet);
      veterinary.setRoomAvailabilityFalse();
      System.out.println("La mascota ha sido agregada al servicio satisfactoriamente.");
    }
    else {

    }
  }
}
