package org.kodejava.example.intro;

import java.io.*;

public class TryWithResourceDemo {
    public static void main(String[] args) {
        try {
            TryWithResourceDemo demo = new TryWithResourceDemo();
            demo.printStream("core-sample/src/main/resources/data.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printStream(String fileName) throws IOException {
        char[] buffer = new char[1024];

        try (InputStream is = new FileInputStream(fileName);
             Reader reader = new BufferedReader(
                     new InputStreamReader(is, "UTF-8"))) {

            while (reader.read(buffer) != -1) {
                System.out.println(buffer);
            }
        }
    }
}
