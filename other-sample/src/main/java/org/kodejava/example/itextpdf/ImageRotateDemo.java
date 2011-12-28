package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class ImageRotateDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("ImageRotation.pdf"));
            document.open();

            //
            // Rotate image in radian using the setRotation method.
            //
            String filename = "other-sample/src/main/resources/java.gif";
            Image image = Image.getInstance(filename);
            image.setRotation(90f);
            document.add(image);

            //
            // Rotate image in degree using the setRotationDegree method
            //
            String url = "http://localhost/xampp/img/xampp-logo-new.gif";
            image = Image.getInstance(url);
            image.setRotationDegrees(90);
            document.add(image);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
