package org.kodejava.example.commons.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;

public class URLToFile {
    public static void main(String[] args) throws Exception {
        //
        // FileUtils.toFile(URL url) convert from URL the File.
        //
        String data = FileUtils.readFileToString(FileUtils.toFile(
                URLToFile.class.getResource("/data.txt")));
        System.out.println("data = " + data);

        //
        // Creates a URL with file protocol and convert it into File
        // object.
        //
        File file = FileUtils.toFile(new URL("file://D:/demo.txt"));
        data = FileUtils.readFileToString(file);
        System.out.println("data = " + data);
    }
}
