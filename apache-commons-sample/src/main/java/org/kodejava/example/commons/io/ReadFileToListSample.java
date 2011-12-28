package org.kodejava.example.commons.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadFileToListSample {
    public static void main(String[] args) {
        //
        // Create a file object of sample.txt
        //
        File file = new File("sample.txt");

        try {
            //
            // Here we read a file, sample.txt, using FileUtils
            // class of commons-io-1.3.1. Using FileUtils.readLines()
            // we can read file content line by line and return
            // the result as a List of string.
            //
            List<String> contents = FileUtils.readLines(file);

            //
            // Iterate the result to print each line of the file.
            //
            for (String line : contents) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
