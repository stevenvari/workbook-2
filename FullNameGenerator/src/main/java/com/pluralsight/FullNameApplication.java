package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        // 1. prompt the user for of their name
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Type your Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Type your Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Type your suffix or Press enter to skip");
        String suffix = scanner.nextLine().trim();

        System.out.printf("%s %s %s %s", firstName, middleName, lastName, suffix);







        // 2. Create a new string that holds the user's full name





        /* side note all user always have a first and last name, they may also
        have a middle name and/or suffix. make sure any leading or trailing spaces
        that the user may have
         */







        // 3. if does not enter middle name
    }
}
