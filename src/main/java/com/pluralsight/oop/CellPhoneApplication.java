package com.pluralsight.oop;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cell Phone Application");

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

        System.out.println("===== CELL PHONE DETAILS =====");
        System.out.println("Owner: " + cellPhone.getOwner());
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());




    }
}
