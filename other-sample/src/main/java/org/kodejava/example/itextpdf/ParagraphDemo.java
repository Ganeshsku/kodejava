package org.kodejava.example.itextpdf;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ParagraphDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("Paragraph.pdf"));
            document.open();

            String content = "The quick brown fox jumps over the lazy dog";
            Paragraph paragraph = new Paragraph();
            for (int i = 0; i < 20; i++) {
                Chunk chunk = new Chunk(content);
                paragraph.add(chunk);
            }

            document.add(paragraph);
            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
