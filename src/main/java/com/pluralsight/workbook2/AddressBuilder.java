package com.pluralsight.workbook2;

import java.util.Scanner;

public class AddressBuilder {
   public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to the Address Builder");
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        String billingString = billingAddress();
        String shippingString = shippingAddress();

        System.out.println("========================================");
        System.out.println("             CUSTOMER DETAILS");
        System.out.println("========================================");

        System.out.println("\nCustomer Name:");
        System.out.println("  " + name);

        System.out.println("\nBilling Address:");
        System.out.println( billingString);

        System.out.println("\nShipping Address:");
        System.out.println( shippingString);

        System.out.println("\n========================================");

    }

    public static String billingAddress() {

        StringBuilder BillingAddressBuilder = new StringBuilder();
        System.out.println("Please enter your billing address: ");
        System.out.println("Billing Street: ");
        BillingAddressBuilder.append(input.nextLine() + "\n " );
        System.out.println("Billing City: ");
        BillingAddressBuilder.append(input.nextLine()+ ", " );
        System.out.println("Billing State: ");
        BillingAddressBuilder.append(input.nextLine()+ " " );
        System.out.println("Billing Zip code: ");
        BillingAddressBuilder.append(input.nextLine()+ " " );

        return BillingAddressBuilder.toString();
    }

    public static String shippingAddress() {

        StringBuilder shippingAddressBuilder = new StringBuilder();
        System.out.println("Please enter your shipping address: ");
        System.out.println("Shipping Street: ");
        shippingAddressBuilder.append(input.nextLine() + "\n " );
        System.out.println("Shipping City: ");
        shippingAddressBuilder.append(input.nextLine()+ ", " );
        System.out.println("Shipping State: ");
        shippingAddressBuilder.append(input.nextLine()+ " " );
        System.out.println("Shipping Zip code: ");
        shippingAddressBuilder.append(input.nextLine()+ " " );

        return shippingAddressBuilder.toString();
    }
}
