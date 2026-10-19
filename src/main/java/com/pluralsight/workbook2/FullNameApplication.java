package com.pluralsight.workbook2;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        String fullName;
        String firstName;
        String middleName;
        String lastName;
        String suffix;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name ");
        System.out.print("First name: ");
        firstName = input.nextLine();
        System.out.print("Middle name: ");
        middleName = input.nextLine();
        System.out.print("Last name: ");
        lastName = input.nextLine();
        System.out.print("Suffix: ");
        suffix = input.nextLine();

//        System.out.println("Your full name: " + firstName + " " + middleName + " " + lastName + " " + suffix);
        fullName = firstName.trim();
        if(middleName.length() > 0) {
            fullName = fullName + " " + middleName.trim();
        }

        if(lastName.length() > 0) {
            fullName = fullName + " " + lastName.trim();
        }

        if(suffix.length() > 0) {
            fullName = fullName + ", " + suffix.trim();
        }

        System.out.println(fullName);





    }
}
