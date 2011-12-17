package org.kodejava.example.itextpdf;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AnchorInternalDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("AnchorInternal.pdf"));
            document.open();

            Anchor anchor = new Anchor("[Continue Here]");
            anchor.setReference("#targetLink");
            Paragraph para1 = new Paragraph(
                    "The quick brown fox jumps over the lazy dog. ");
            para1.add(anchor);
            document.add(para1);

            Anchor target = new Anchor(
                    "The quick onyx goblin jumps over the lazy dwarf.");
            anchor.setName("targetLink");
            Paragraph para2 = new Paragraph();
            para2.setSpacingBefore(550);
            para2.add(target);
            document.add(para2);

            document.close();
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
