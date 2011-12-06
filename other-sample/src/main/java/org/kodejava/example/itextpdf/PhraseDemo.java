package org.kodejava.example.itextpdf;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PhraseDemo {
    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("AnotherPhrase.pdf"));
            document.open();

            //
            // Creates a phrase object, sets leading to 32 and
            // adds some chunks.
            //
            Phrase phrase1 = new Phrase(20);

            //
            // Set main font information of the Phrase object.
            //
            phrase1.setFont(FontFactory.getFont(FontFactory.COURIER, 12,
                    Font.BOLD, new BaseColor(0, 0, 255)));

            for (int i = 0; i < 50; i++) {
                phrase1.add(new Chunk("Hello "));
            }
            //
            // Add chunk to the phrase and replace the font information
            // for this chunk.
            //
            phrase1.add(new Chunk("Hello",
                    FontFactory.getFont(FontFactory.HELVETICA)));
            document.add(phrase1);

            //
            // Creates a phrase by defining the leading and a string.
            //
            Phrase phrase2 = new Phrase(40, "Hello World!!!");
            document.add(phrase2);

            //
            // Creates a phrase by defining the leading and add a chunk
            // into the phrase. The chunk has it own font face, font
            // style and color.
            //
            Phrase phrase3 = new Phrase(50,
                    new Chunk("Hello I am BIG", FontFactory.getFont(
                            FontFactory.HELVETICA, 40,
                            Font.ITALIC, new BaseColor(255, 0, 0))));
            document.add(phrase3);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
