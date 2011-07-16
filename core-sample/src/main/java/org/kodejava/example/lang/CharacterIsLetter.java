package org.kodejava.example.lang;

public class CharacterIsLetter {
    public static void main(String[] args) {
        String name = "Kode Java 123";

        // Determines if the specified character is a letter
        if (Character.isLetter(name.charAt(5))) {
            System.out.println("The fifth character (" +
                    name.charAt(5) + ") is an alphabet!");
        }
    }
}
