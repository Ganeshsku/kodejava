package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.GreekList;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.RomanList;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class RomanGreekListDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("RomanGreekListDemo.pdf"));
            document.open();

            List roman = new RomanList();
            roman.add(new ListItem("Item 1"));
            roman.add(new ListItem("Item 2"));
            roman.add(new ListItem("Item 3"));
            document.add(roman);

            List greek = new GreekList();
            greek.add(new ListItem("Item 1"));
            greek.add(new ListItem("Item 2"));
            greek.add(new ListItem("Item 3"));
            document.add(greek);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
