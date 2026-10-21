package com.pluralsight.oop;

import java.util.Scanner;

public class CellPhoneApplication {
   public static Scanner input = new Scanner(System.in);
    public static CellPhone cellPhone = new CellPhone();
    public static CellPhone cellPhone2 = new CellPhone();

    public static void main(String[] args) {
        System.out.println("Welcome to Cell Phone Application");
        cellPhone = inputData();
        cellPhone2 = inputData();
        display(cellPhone2);
        display(cellPhone);
    }

    public static CellPhone inputData(){
        System.out.println("What is the serial number?");
        cellPhone.setSerialNumber(input.nextLine());
        System.out.println("What is the model?");
        cellPhone.setModel(input.nextLine());
        System.out.println("What is the carrier?");
        cellPhone.setCarrier(input.nextLine());
        System.out.println("What is the phone number?");
        cellPhone.setPhoneNumber(input.nextLine());
        System.out.println("Who is the owner of the phone?");
        cellPhone.setOwner(input.nextLine());
        System.out.println("Enter the number to dial?");
        cellPhone.setDialPhoneNumber(input.nextLine());

        return cellPhone;
    }

    public static void display(CellPhone cellPhone) {
        System.out.println("===== CELL PHONE DETAILS =====");
        System.out.println("Owner: " + cellPhone.getOwner());
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("---------------Calling... ");
        System.out.println(cellPhone.dial(cellPhone.getDialPhoneNumber()));
    }
}
