package org.kodejava.example.itextpdf;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ParagraphAlignment {
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
                    new FileOutputStream("ParaAlign.pdf"));
            document.open();

            // Creates a check for the paragraphs contents
            Chunk chunk = new Chunk(ParagraphAlignment.CONTENT);

            //
            // Creates paragraphs and set the alignment of the paragraph.
            // We use the Paragraph.ALIGN_LEFT, Paragraph.ALIGN_CENTER
            // and Paragraph.ALIGN_RIGHT
            //
            Paragraph para1 = new Paragraph(chunk);
            para1.setAlignment(Paragraph.ALIGN_LEFT);
            para1.setSpacingAfter(50);
            document.add(para1);

            Paragraph para2 = new Paragraph(chunk);
            para2.setAlignment(Paragraph.ALIGN_CENTER);
            para2.setSpacingAfter(50);
            document.add(para2);

            Paragraph para3 = new Paragraph(chunk);
            para3.setAlignment(Paragraph.ALIGN_RIGHT);
            document.add(para3);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
        document.close();
    }
}
