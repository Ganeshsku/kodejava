package org.kodejava.example.itextpdf;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ChapterDemo {
    public static void main(String[] args) {
        //
        // Creates a new document
        //
        Document document = new Document();
        try {
            //
            // Prepare PDF writer and open the document.
            //
            PdfWriter.getInstance(document,
                    new FileOutputStream("ChapterDemo.pdf"));
            document.open();

            //
            // Creates a new Chapter object
            //
            Chapter chapter = new Chapter("Chapter One", 1);

            //
            // Add sections to the chapter
            //
            Section section = chapter.addSection("This is Section 1", 2);
            Paragraph paragraph = new Paragraph(
                    "This is the paragraph of the Section 1");
            section.add(paragraph);

            chapter.addSection("This is Section 2", 2);

            document.add(chapter);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
