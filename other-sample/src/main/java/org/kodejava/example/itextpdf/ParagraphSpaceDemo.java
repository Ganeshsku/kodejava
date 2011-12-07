package org.kodejava.example.itextpdf;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ParagraphSpaceDemo {
    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("ParagraphSetting.pdf"));
            document.open();

            String content = "The quick brown fox jumps over the lazy dog";

            //
            // Setting paragraph line spacing to 32
            //
            Paragraph para1 = new Paragraph(32);
            //
            // Setting the space before and after the paragraph
            //
            para1.setSpacingBefore(50);
            para1.setSpacingAfter(50);
            for (int i = 0; i < 10; i++) {
                para1.add(new Chunk(content));
            }
            document.add(para1);

            Paragraph para2 = new Paragraph();
            for (int i = 0; i < 10; i++) {
                para2.add(new Chunk(content));
            }
            document.add(para2);

            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
