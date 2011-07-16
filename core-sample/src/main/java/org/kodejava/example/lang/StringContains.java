package org.kodejava.example.lang;

public class StringContains {
    public static void main(String[] args) {
        String name = "Kode Java";

        //
        // Checks to see if the word "Java" is found in the name
        // variable.
        //
        if (name.indexOf("Java") != -1) {
            System.out.println("Bravo Java!");
        } else {
            System.out.println("Can't find Java");
        }
    }
}
