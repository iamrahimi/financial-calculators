package com.pluralsight;
import java.util.Scanner;

public class PresentValueCalculator {

    public static double monthlyPayout = 0.0;
    public static double annualInterest = 0.0;
    public static int years;
    public static double presentValue = 0.0;

    public static void main(String[] args) {

        System.out.println("Welcome to the Annuity Calculator");

        getInformation(); // will collect information from the user
        calculatePresentValue(); // this will do the calculation
        displayInformation(); // this will display the summary

    }

    public static void getInformation() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the monthly payout amount?");
        monthlyPayout = input.nextDouble();

        System.out.println("Expected annual interest rate (%)?");
        annualInterest = input.nextDouble();
        annualInterest = annualInterest / 100;

        System.out.println("Annuity plan (How many years)?");
        years = input.nextInt();

    }

    public static void calculatePresentValue() {

        int months = years * 12;
        double monthlyInterestRate = annualInterest / 12;

        presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyInterestRate, -months)) / monthlyInterestRate;

    }

    public static void displayInformation() {

        // Console design
        System.out.println("========================================");
        System.out.println("          ANNUITY CALCULATOR");
        System.out.println("========================================");
        System.out.println();

        System.out.printf("  %-22s $%,.2f%n", "Monthly Payout:", monthlyPayout);
        System.out.printf("  %-22s %.2f%%%n", "Annual Interest:", annualInterest * 100);
        System.out.printf("  %-22s %d years%n", "Annuity Term:", years);

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("                 RESULTS");
        System.out.println("----------------------------------------");
        System.out.println();

        System.out.printf("  %-22s $%,.2f%n", "Present Value:", presentValue);

        System.out.println();
        System.out.println("========================================");
        System.out.println("       Thank you for using our app!");
        System.out.println("========================================");

    }

}

