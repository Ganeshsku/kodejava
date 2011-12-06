package org.kodejava.example.itextpdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PDFChunkDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("Chunk.pdf"));
            document.open();

            //
            // Add some chunks into the document object.
            //
            document.add(new Chunk("The quick brown fox "));
            document.add(new Chunk("jumps over the lazy dog."));
            document.add(new Chunk("The quick brown fox "));
            document.add(new Chunk("jumps over the lazy dog."));
            document.add(new Chunk("The quick brown fox ",
                    FontFactory.getFont(FontFactory.HELVETICA, 20,
                            Font.ITALIC, new BaseColor(0, 128, 0))));
            document.add(new Chunk("jumps over the lazy dog."));
            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
