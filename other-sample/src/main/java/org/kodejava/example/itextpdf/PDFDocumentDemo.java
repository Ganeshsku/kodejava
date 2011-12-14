package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;

public class PDFDocumentDemo {
    public static void main(String[] args) {
        //
        // Creates an instance of a Document.
        //
        Document document = new Document();

        try {
            //
            // To work with a Document we must open the document, add
            // some contents and finally close the document.
            //
            document.open();
            document.add(new Paragraph("Hello World!"));
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
