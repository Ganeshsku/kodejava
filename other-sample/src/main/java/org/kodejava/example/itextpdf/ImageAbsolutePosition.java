package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class ImageAbsolutePosition {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("ImageAbsolutePosition.pdf"));
            document.open();

            //
            // Sets the absolute position of the image.
            //
            String filename = "other-sample/src/main/resources/java.gif";
            Image image = Image.getInstance(filename);
            image.setAbsolutePosition(0f, 0f);
            document.add(image);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
