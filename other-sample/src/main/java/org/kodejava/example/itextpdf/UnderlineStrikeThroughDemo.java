package org.kodejava.example.itextpdf;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UnderlineStrikeThroughDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("UnderStrike.pdf"));
            document.open();

            //
            // Creates a chunk with an underline with 0.1 thickness
            //
            Chunk underline = new Chunk("The quick brown fox ");
            underline.setUnderline(0.1f, -1f);
            document.add(underline);

            //
            // Creates a strike through chunk with 1 thickness
            //
            Chunk strike = new Chunk("jumps over the lazy dog.");
            strike.setUnderline(1f, 3f);
            document.add(strike);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}