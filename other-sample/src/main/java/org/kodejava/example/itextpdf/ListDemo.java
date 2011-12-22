package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ListDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("ListDemo.pdf"));
            document.open();

            List ordered = new List(List.ORDERED);
            ordered.add(new ListItem("Item 1"));
            ordered.add(new ListItem("Item 2"));
            ordered.add(new ListItem("Item 3"));
            document.add(ordered);

            List unordered = new List(List.UNORDERED);
            unordered.add(new ListItem("Item 1"));
            unordered.add(new ListItem("Item 2"));
            unordered.add(new ListItem("Item 3"));
            document.add(unordered);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
