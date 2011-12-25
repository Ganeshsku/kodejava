package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TableCellPadding {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("TableCellPadding.pdf"));
            document.open();

            int numColumns = 3;
            PdfPTable table = new PdfPTable(numColumns);
            PdfPCell[] cells = new PdfPCell[numColumns];
            for (int i = 0; i < numColumns; i++) {
                cells[i] = new PdfPCell(new Phrase("Cell " + i + 1));
                //
                // Set cell's padding equally for all side of the
                // cell.
                //
                cells[i].setPadding(10);
                table.addCell(cells[i]);
            }
            table.completeRow();

            cells = new PdfPCell[numColumns];
            for (int i = 0; i < numColumns; i++) {
                cells[i] = new PdfPCell(new Phrase("Cell " + i + 1));
                //
                // Set cell's padding individually for top, right,
                // bottom and left padding.
                //
                cells[i].setPaddingTop(20);
                cells[i].setPaddingRight(30);
                cells[i].setPaddingBottom(20);
                cells[i].setPaddingLeft(30);
                table.addCell(cells[i]);
            }
            table.completeRow();
            document.add(table);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
