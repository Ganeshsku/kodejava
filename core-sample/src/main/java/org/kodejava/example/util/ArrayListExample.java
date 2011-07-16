package org.kodejava.example.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        // Adding items into array list
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        // Remove the third item from array list
        list.remove(2);

        // Iterate List item and print it using for loop statement
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println("Item = " + item);
        }

        // Iterate List item and print it using for-each statement
        for (String item : list) {
            System.out.println("Item = " + item);
        }

        // Converting List into array of object
        Object[] array = list.toArray();
        System.out.println("Items = " + Arrays.toString(array));
    }
}
