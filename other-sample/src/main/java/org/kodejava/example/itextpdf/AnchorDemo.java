package org.kodejava.example.itextpdf;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AnchorDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("AnchorDemo.pdf"));
            document.open();

            String content = "You can learn Java programming on the " +
                    "following website: ";
            Paragraph paragraph = new Paragraph(content);

            //
            // Creates a new anchor that link to external website
            // and add this anchor to the paragraph.
            //
            Anchor anchor = new Anchor("Learn Java Programming by Examples");
            anchor.setReference("http://www.kodejava.org");
            paragraph.add(anchor);

            document.add(paragraph);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }

    }
}
