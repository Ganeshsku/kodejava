package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TableColumnSpanDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("TableColumnSpan.pdf"));
            document.open();

            //
            // Creates a table with four column. The first rows
            // will have cell 1 to cell 4.
            //
            PdfPTable table = new PdfPTable(4);
            table.addCell(new PdfPCell(new Phrase("Cell 1")));
            table.addCell(new PdfPCell(new Phrase("Cell 2")));
            table.addCell(new PdfPCell(new Phrase("Cell 3")));
            table.addCell(new PdfPCell(new Phrase("Cell 4")));
            table.completeRow();

            //
            // Creates another row that only have to columns.
            // The cell 5 and cell 6 width will span two columns
            // in width.
            //
            PdfPCell cell5 = new PdfPCell(new Phrase("Cell 5"));
            cell5.setColspan(2);
            PdfPCell cell6 = new PdfPCell(new Phrase("Cell 6"));
            cell6.setColspan(2);
            table.addCell(cell5);
            table.addCell(cell6);
            table.completeRow();

            //
            // Adds table to the document
            //
            document.add(table);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
