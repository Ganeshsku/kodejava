package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TableWidthDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("TableWidthDemo.pdf"));
            document.open();

            //
            // Creates a table with 5 columns
            //
            PdfPTable table = new PdfPTable(5);
            table.addCell(new PdfPCell(new Phrase("Cell 1")));
            table.addCell(new PdfPCell(new Phrase("Cell 2")));
            table.addCell(new PdfPCell(new Phrase("Cell 3")));
            table.addCell(new PdfPCell(new Phrase("Cell 4")));
            table.addCell(new PdfPCell(new Phrase("Cell 5")));

            //
            // Sets the width percentage that the table will occupy
            // in the page.
            //
            table.setWidthPercentage(50);
            document.add(table);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
