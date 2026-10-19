package com.pluralsight.workbook2;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        String name = null;
        String firstName = null;
        String middleName = null;
        String lastName = null;
        String[] fullName;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        name = input.nextLine().trim();
        System.out.println("Thank you");

        fullName = name.split(" ");
        firstName = fullName[0].trim();

        if (fullName.length == 3) {
            middleName = fullName[1].trim();
            lastName = fullName[2].trim();
        }else {
           middleName = "(none)";
            lastName = fullName[1].trim();
        }

        System.out.println(firstName + " " + middleName + " " + lastName);
    }
}
