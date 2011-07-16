package org.kodejava.example.lang;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = new String("Hello World");

        //
        // To compare string for equality we must use the equals
        // method of the string object. This ensure that the
        // string content is compared and not the object reference
        // of the both string. This process will return true
        // because s1 and s2 have the same value.
        //
        if (s1.equals(s2)) {
            System.out.println("Both strings are equals");
        } else {
            System.out.println("Both strings are not equals");
        }

        //
        // Do not use the == operator to compare string for its
        // content, the == operator check return true only if the
        // object has the same reference. This process will return
        // false as the string references to a different object.
        //
        if (s1 == s2) {
            System.out.println("Both strings are equals");
        } else {
            System.out.println("Both strings are not equals");
        }
    }
}
