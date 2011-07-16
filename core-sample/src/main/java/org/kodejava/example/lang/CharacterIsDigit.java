package org.kodejava.example.lang;

public class CharacterIsDigit {
    public static void main(String[] args) {
        String str = "123ABC456def789HIJ0";

        for (int i = 0; i < str.length(); i++) {
            //
            // Determines if the specified character is a digit
            //
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i)
                        + " is a digit.");
            } else {
                System.out.println(str.charAt(i)
                        + " not a digit.");
            }
        }
    }
}
