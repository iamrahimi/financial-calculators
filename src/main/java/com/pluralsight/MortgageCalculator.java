package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    public static double principal = 0.0;
    public static double annualInterest = 0.0;
    public static int years;
    public static double totalInterest = 0.0;

    public static void main(String[] args) {

        System.out.println("Welcome to the Mortgage Calculator");
        getInformation(); // will collect information from the user
        colculateMontlyPayments(); // this will do the calculation
        totalInterestColc(); // This will give total interest
        displayInformation(); // this will display the summary

    }

    public static void getInformation() {
        System.out.println("Please enter the principle amount?");
        Scanner input = new Scanner(System.in);
        principal = input.nextDouble();
        System.out.println("Annual interest rate (%)?");
        annualInterest = input.nextDouble();
        annualInterest = annualInterest / 100;
        System.out.println("Yearly plan (How many years)?");
        years = input.nextInt();

    }


    public static double colculateMontlyPayments() {
        int months = years * 12;
        double monthlyInterestRate = annualInterest / 12;

        if (monthlyInterestRate == 0) {
            return principal / months;
        }

        double n = Math.pow(1 + monthlyInterestRate, months);
        double monthlyPayment = (principal * monthlyInterestRate * n) / (n - 1);

        return monthlyPayment;
    }

    public static void totalInterestColc() {
        double monthlyPayment = colculateMontlyPayments();
        int months = years * 12;

        totalInterest = (monthlyPayment * months) - principal;
    }


    public static void displayInformation(){
        // Console design
        System.out.println("========================================");
        System.out.println("          MORTGAGE CALCULATOR");
        System.out.println("========================================");
        System.out.println();

        System.out.printf("  %-20s $%,.2f%n", "Loan Amount:", principal);
        System.out.printf("  %-20s %.2f%%%n", "Annual Interest:", annualInterest * 100);
        System.out.printf("  %-20s %d years%n", "Loan Term:", years);
        System.out.printf("  %-20s %d months%n", "Total Payments:", years * 12);

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("                 RESULTS");
        System.out.println("----------------------------------------");
        System.out.println();

        System.out.printf("  %-20s $%,.2f%n", "Monthly Payment:", colculateMontlyPayments());
        System.out.printf("  %-20s $%,.2f%n", "Total Interest:", totalInterest);

        System.out.println();
        System.out.println("========================================");
        System.out.println("       Thank you for using our app!");
        System.out.println("========================================");

    }

}
