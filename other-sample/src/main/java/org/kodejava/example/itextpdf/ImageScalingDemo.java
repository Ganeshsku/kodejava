package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class ImageScalingDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("ImageScaling.pdf"));
            document.open();

            //
            // Scale the image to an absolute width and an absolute
            // height
            //
            String filename = "other-sample/src/main/resources/java.gif";
            Image image = Image.getInstance(filename);
            image.scaleAbsolute(200f, 200f);
            document.add(image);

            //
            // Scale the image to a certain percentage
            //
            String url = "http://localhost/xampp/img/xampp-logo-new.gif";
            image = Image.getInstance(url);
            image.scalePercent(200f);
            document.add(image);

            //
            // Scales the image so that it fits a certain width and
            // height
            //
            image = Image.getInstance(url);
            image.scaleToFit(100f, 200f);
            document.add(image);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
