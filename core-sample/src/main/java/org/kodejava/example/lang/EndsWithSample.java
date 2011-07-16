package org.kodejava.example.lang;

public class EndsWithSample {
    public static void main(String[] args) {
        String str =
                "The quick brown fox jumps over the lazy dog";

        //
        // well, does the fox jumps over a lazy dog?
        //
        if (str.endsWith("lazy dog")) {
            System.out.println("The dog is a lazy dog");
        } else {
            System.out.println("Good dog!");
        }
    }
}
