package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();


        // set some values
        cellPhone.setSerialNumber();
        cellPhone.setModel();
        cellPhone.setCarrier();
        cellPhone.setPhoneNumber();
        cellPhone.setOwner();

        /*System.out.println(cellPhone.getSerialNumber());
        System.out.println(cellPhone.getModel());
        System.out.println(cellPhone.getCarrier());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.println(cellPhone.getOwner());*/

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the serial number? e.g 100000 ");
        int serialNumber = keyboard.nextInt();
        System.out.println("your serial number is: " + serialNumber);

        System.out.println("what model is the phone? ");
        String model = keyboard.next();
        System.out.println("your model is: "+ model);

        System.out.println("who is the carrier? ");
        String carrier = keyboard.next();
        System.out.println("the carrier is: " + carrier);

        System.out.println("what is the phone number? ");
        String phoneNumber = keyboard.next();
        System.out.println("your number is: " + phoneNumber);

        System.out.println("who is the owner of the phone? ");
        String ownerOfThePhone = keyboard.next();
        System.out.println("the owner is: ");



    }
}
