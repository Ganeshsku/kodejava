package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TableColumnWidthDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("TableColumnWidth.pdf"));
            document.open();

            PdfPTable table = new PdfPTable(4);
            table.addCell(new PdfPCell(new Phrase("Cell 1")));
            table.addCell(new PdfPCell(new Phrase("Cell 2")));
            table.addCell(new PdfPCell(new Phrase("Cell 3")));
            table.addCell(new PdfPCell(new Phrase("Cell 4")));

            //
            // Defiles the relative width of the columns
            //
            float[] columnWidths = new float[] {10f, 20f, 30f, 10f};
            table.setWidths(columnWidths);

            document.add(table);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
