package org.kodejava.example.io;

import java.io.Console;
import java.util.Arrays;

public class ConsoleDemo {

    public static void main(String[] args) {
        //
        // Get a console object, console can be null if not available.
        //
        Console console = System.console();

        if (console != null) {
            //
            // Read username from the console
            //
            String username = console.readLine("Username: ");

            //
            // Read password, the password will not be echoed to the
            // console screen and returned as an array of characters.
            //
            char[] password = console.readPassword("Password: ");

            if (username.equals("admin")
                    && String.valueOf(password).equals("secret")) {
                console.printf("Welcome to Java Application %1$s.\n",
                        username);

                //
                // Clear the password after validation successful
                //
                Arrays.fill(password, ' ');
            } else {
                console.printf("Invalid username or password.\n");
            }
        } else {
            System.out.println("Console is not available.");
        }
    }
}
