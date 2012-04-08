package org.kodejava.example.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        //
        // Get the temporary directory. We'll read the data.txt file
        // from this directory.
        //
        String tempDir = System.getProperty("java.io.tmpdir");
        File file = new File(tempDir + "/data.txt");

        StringBuilder builder = new StringBuilder();
        FileInputStream fis = null;
        try {
            //
            // Create a FileInputStream to read the file.
            //
            fis = new FileInputStream(file);

            int data;
            //
            // Read the entire file data. When -1 is returned it
            // means no more content to read.
            //
            while ((data = fis.read()) != -1) {
                builder.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //
        // Print the content of the file
        //
        System.out.println("File Contents = " + builder.toString());
    }
}
