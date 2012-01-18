package org.kodejava.example.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayRemoveDuplicate {
    public static void main(String[] args) {
        //
        // A string array with duplicate values
        //
        String[] data = {
                "A", "C", "B", "D", "A", "B", "E", "D", "B", "C"
        };
        System.out.println("Original array         : " +
                Arrays.toString(data));

        //
        // Convert it to list as we need the list object to create a
        // set object. A set is a collection object that cannot have
        // a duplicate values, so by converting the array to a set
        // the duplicate value will be removed.
        //
        List<String> list = Arrays.asList(data);
        Set<String> set = new HashSet<String>(list);

        System.out.print("Remove duplicate result: ");

        //
        // Create an array to convert the Set back to array.
        // The Set.toArray() method copy the value in the set to the
        // defined array.
        //
        String[] result = new String[set.size()];
        set.toArray(result);
        for (String s : result) {
            System.out.print(s + ", ");
        }
    }
}
