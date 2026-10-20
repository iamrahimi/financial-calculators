package com.pluralsight.workbook2;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = input.nextLine();

        String[] name = fullName.split(" ");

        String firstName = name[0];
        String lastName = name[name.length - 1];

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String showDate = input.nextLine();

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(showDate, inputFormat);

        String formattedDate = date.format(outputFormat);

        System.out.print("How many tickets would you like? ");
        int tickets = input.nextInt();

        String ticketWord;

        if (tickets == 1) {
            ticketWord = "ticket";
        } else {
            ticketWord = "tickets";
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("   RESERVATION CONFIRMATION");
        System.out.println("------------------------------");
        System.out.println(tickets + " " + ticketWord
                + " reserved for " + formattedDate
                + " under " + lastName + ", " + firstName);
        System.out.println("==============================");

    }
}
