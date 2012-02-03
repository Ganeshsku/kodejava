package org.kodejava.example.util;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //
        // Read string input for username
        //
        System.out.print("Username: ");
        String username = scanner.nextLine();

        //
        // Read string input for password
        //
        System.out.print("Password: ");
        String password = scanner.nextLine();

        //
        // Read an integer input for another challenge
        //
        System.out.print("What is 2 + 2: ");
        int result = scanner.nextInt();

        if (username.equals("admin")
                && password.equals("secret") && result == 4) {
            System.out.println("Welcome to Java Application");
        } else {
            System.out.println("Invalid username or password, " +
                    "access denied!");
        }
    }
}
