package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.ZapfDingbatsList;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ZapfDingbatsListDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("ZapfDingbats.pdf"));
            document.open();

            //
            // Create a ZapfDingbatsList with char number 50
            //
            List zapf1 = new ZapfDingbatsList(50);
            zapf1.add(new ListItem("Item 1"));
            zapf1.add(new ListItem("Item 2"));
            zapf1.add(new ListItem("Item 3"));
            document.add(zapf1);

            //
            // Create a ZapfDingbatsList with char number 55 and indent
            // it by 30.
            //
            List zapf2 = new ZapfDingbatsList(55, 30);
            zapf2.add(new ListItem("Item 1"));
            zapf2.add(new ListItem("Item 2"));
            zapf2.add(new ListItem("Item 3"));
            document.add(zapf2);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
