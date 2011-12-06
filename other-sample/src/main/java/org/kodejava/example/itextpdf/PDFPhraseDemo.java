package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PDFPhraseDemo {
    public static void main(String[] args) {
        //
        // Creates an instance of Document.
        //
        Document document = new Document();
        try {
            //
            // Write the pdf document into a file using the PdfWriter
            // and passes the document object and a FileOutputStream.
            //
            PdfWriter.getInstance(document,
                    new FileOutputStream("Phrase.pdf"));
            document.open();

            //
            // Add a some Phrase element into the document.
            //
            document.add(new Phrase("This is the first text "));
            document.add(new Phrase("This is the second text "));
            document.add(new Phrase("This is the third text "));
            document.add(new Phrase("This is the fourth text "));
            document.add(new Phrase("This is the fifth text "));
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
