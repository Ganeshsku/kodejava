package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class ImageDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("ImageDemo.pdf"));
            document.open();
            //
            // Creating image by file name
            //
            String filename = "other-sample/src/main/resources/java.gif";
            Image image = Image.getInstance(filename);
            document.add(image);

            //
            // Creating image from a URL
            //
            String url = "http://localhost/xampp/img/xampp-logo-new.gif";
            image = Image.getInstance(url);
            document.add(image);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
