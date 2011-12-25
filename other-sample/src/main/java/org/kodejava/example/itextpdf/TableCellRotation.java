package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TableCellRotation {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("TableCellRotate.pdf"));
            document.open();

            PdfPTable table = new PdfPTable(3);
            PdfPCell cell1 = new PdfPCell(new Phrase("Cell 1 - 90"));
            // 90 degree rotation
            cell1.setRotation(90);
            table.addCell(cell1);

            PdfPCell cell2 = new PdfPCell(new Phrase("Cell 2 - 180"));
            // 180 degree rotation
            cell2.setRotation(180);
            table.addCell(cell2);

            PdfPCell cell3 = new PdfPCell(new Phrase("Cell 3 - 270"));
            // 270 degree rotation
            cell3.setRotation(270);
            table.addCell(cell3);
            table.completeRow();

            document.add(table);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
