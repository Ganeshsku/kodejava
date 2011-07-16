package org.kodejava.example.util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContains {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");

        if (list.contains("Item 1")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
