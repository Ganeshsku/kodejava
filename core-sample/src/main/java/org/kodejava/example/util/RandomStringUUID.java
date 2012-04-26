package org.kodejava.example.util;

import java.util.UUID;

public class RandomStringUUID {
    public static void main(String[] args) {
        //
        // Creating a random UUID (Universally Unique Identifier).
        //
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        System.out.println("Random UUID String = " + randomUUIDString);
        System.out.println("UUID version       = " + uuid.version());
        System.out.println("UUID variant       = " + uuid.variant());
    }
}