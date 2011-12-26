package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TableNestedDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("TableNestedDemo.pdf"));
            document.open();

            PdfPTable table = new PdfPTable(3);
            PdfPCell cell1 = new PdfPCell(new Phrase("Cell 1"));
            PdfPCell cell2 = new PdfPCell(new Phrase("Cell 2"));
            PdfPCell cell3 = new PdfPCell(new Phrase("Cell 3"));

            PdfPTable nestedTable = new PdfPTable(2);
            nestedTable.addCell(new PdfPCell(new Phrase("Nested 1")));
            nestedTable.addCell(new PdfPCell(new Phrase("Nested 2")));
            cell3.addElement(nestedTable);

            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            document.add(table);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
