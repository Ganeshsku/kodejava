package org.kodejava.example.itextpdf;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ParagraphIndentationDemo {
    private static final String CONTENT =
            "Lorem ipsum dolor sit amet, consectetur adipisicing " +
            "elit, sed do eiusmod tempor incididunt ut labore et " +
            "dolore magna aliqua. Ut enim ad minim veniam, quis " +
            "nostrud exercitation ullamco laboris nisi ut aliquip " +
            "ex ea commodo consequat. Duis aute irure dolor in " +
            "reprehenderit in voluptate velit esse cillum dolore eu " +
            "fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
            "non proident, sunt in culpa qui officia deserunt mollit " +
            "anim id est laborum.";

    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("ParaIndentation.pdf"));
            document.open();

            Paragraph paragraph = new Paragraph();
            paragraph.add(new Chunk(ParagraphIndentationDemo.CONTENT));

            // Set paragraph's first line indent
            paragraph.setFirstLineIndent(75);

            // Set paragraph's left side indent
            paragraph.setIndentationLeft(50);

            // Set paragraph's right side indent
            paragraph.setIndentationRight(25);
            document.add(paragraph);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
