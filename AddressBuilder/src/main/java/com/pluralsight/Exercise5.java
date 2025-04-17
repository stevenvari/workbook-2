package com.pluralsight;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String fullName = input.nextLine();

        System.out.println("what is your billing street e.g (123 Main Street): ");
        String billStreet = input.nextLine();

        System.out.println("Enter your billing city e.g (Middleton): ");
        String billCity = input.nextLine();

        System.out.println("Enter billing State e.g (TX): ");
        String billingState = input.nextLine();

        System.out.println("Enter your zipcode e.g (75111): ");
        String billingZipcode = input.nextLine();

        //shipping address

        System.out.println("Enter your Shipping Address e.g (456 Big Sky Blvd): ");
        String shippingAddress = input.nextLine();

        System.out.println("Enter your Shipping city e.g (Outer Rim): ");
        String shippingCity = input.nextLine();

        System.out.println("Enter your shipping State e.g (TX): ");
        String shippingState = input.nextLine();

        System.out.println("Shipping zip e.g (75333): ");
        String shippingZip = input.nextLine();

        //Billing address strings using StringBuilder

        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(billStreet).append("\n");
        billingAddress.append(billCity).append(",").append(billingState).append(" ").append(billingZipcode);

        System.out.println(fullName);
        System.out.println(billingAddress);

        // shipping address strings using StringBuilder

        StringBuilder shippingA = new StringBuilder();
        shippingA.append(shippingAddress).append("\n");
        shippingA.append(shippingCity).append(",").append(shippingState).append(" ").append(shippingZip);

        System.out.println(fullName);
        System.out.println(shippingAddress);







    }
}
