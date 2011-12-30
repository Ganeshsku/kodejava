package org.kodejava.example.itextpdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FontDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("FontDemo.pdf"));
            document.open();

            //
            // Creates some fonts
            //
            Font largeBold = new Font(Font.FontFamily.COURIER, 32,
                    Font.BOLD);
            Font smallItalic = new Font(Font.FontFamily.HELVETICA, 10,
                    Font.ITALIC);
            Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                    Font.ITALIC | Font.UNDERLINE, BaseColor.RED);

            //
            // Creates chunk, phrase and paragraph with font
            // information.
            //
            Chunk chunk = new Chunk("Hello World", largeBold);
            Phrase phrase =
                    new Phrase("The quick brown fox ", smallItalic);
            Paragraph paragraph =
                    new Paragraph("jumps over the lazy dog", redFont);

            document.add(chunk);
            document.add(phrase);
            document.add(paragraph);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
