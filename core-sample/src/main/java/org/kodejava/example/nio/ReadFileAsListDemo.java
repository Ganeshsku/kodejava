package org.kodejava.example.nio;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileAsListDemo {
    public static void main(String[] args) {
        String file = "data.txt";

        //
        // Read all lines from a file. This method ensures that the file
        // is closed when all bytes have been read or an I/O error, or
        // other runtime exception, is thrown. Bytes from the file are
        // decoded into characters using the specified charset.
        //
        // Note that this method is intended for simple cases where it is
        // convenient to read all lines in a single operation. It is not
        // intended for reading in large files.
        //
        List<String> lines = Files.readAllLines(Paths.get(file),
                Charset.defaultCharset());
        for (String line : lines) {
            System.out.println("lines = " + lines);
        }
    }
}
