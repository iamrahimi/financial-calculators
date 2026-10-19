package com.pluralsight;
import java.util.Scanner;

public class futureValueCalculator {

    public static double principal = 0.0;
    public static double annualInterest = 0.0;
    public static int years;
    public static double futureValue = 0.0;
    public static double totalInterest = 0.0;

    public static void main(String[] args) {

        System.out.println("Welcome to the CD Calculator");

        getInformation(); // will collect information from the user
        calculateFutureValue(); // this will do the calculation
        totalInterestCalc(); // This will give total interest
        displayInformation(); // this will display the summary

    }

    public static void getInformation() {

        System.out.println("Please enter the deposit amount?");
        Scanner input = new Scanner(System.in);
        principal = input.nextDouble();

        System.out.println("Annual interest rate (%)?");
        annualInterest = input.nextDouble();
        annualInterest = annualInterest / 100;

        System.out.println("Investment plan (How many years)?");
        years = input.nextInt();

    }

    public static void calculateFutureValue() {

        int daysPerYear = 365;
        int totalDays = years * daysPerYear;

        futureValue = principal * Math.pow(1 + (annualInterest / daysPerYear), totalDays);

    }

    public static void totalInterestCalc() {

        totalInterest = futureValue - principal;

    }

    public static void displayInformation() {

        // Console design
        System.out.println("========================================");
        System.out.println("              CD CALCULATOR");
        System.out.println("========================================");
        System.out.println();

        System.out.printf("  %-20s $%,.2f%n", "Deposit Amount:", principal);
        System.out.printf("  %-20s %.2f%%%n", "Annual Interest:", annualInterest * 100);
        System.out.printf("  %-20s %d years%n", "Investment Term:", years);

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("                 RESULTS");
        System.out.println("----------------------------------------");
        System.out.println();

        System.out.printf("  %-20s $%,.2f%n", "Future Value:", futureValue);
        System.out.printf("  %-20s $%,.2f%n", "Total Interest:", totalInterest);

        System.out.println();
        System.out.println("========================================");
        System.out.println("       Thank you for using our app!");
        System.out.println("========================================");

    }

}
