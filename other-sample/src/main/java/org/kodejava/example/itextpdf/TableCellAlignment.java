package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TableCellAlignment {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("TableCellAlignment.pdf"));
            document.open();

            //
            // Setting table's cells horizontal alignment
            //
            PdfPTable table = new PdfPTable(3);
            PdfPCell cell1 = new PdfPCell(new Phrase("Cell 1"));
            cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
            table.addCell(cell1);
            PdfPCell cell2 = new PdfPCell(new Phrase("Cell 2"));
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell2);
            PdfPCell cell3 = new PdfPCell(new Phrase("Cell 3"));
            cell3.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(cell3);
            table.completeRow();

            //
            // Setting table's cells vertical alignment
            //
            PdfPCell[] cells = new PdfPCell[3];
            int[] alignments = new int[]{
                    Element.ALIGN_TOP,
                    Element.ALIGN_MIDDLE,
                    Element.ALIGN_BOTTOM
            };
            for (int i = 0; i < cells.length; i++) {
                cells[i] = new PdfPCell(new Phrase("Cell " + (i + 1)));
                cells[i].setMinimumHeight(50);
                cells[i].setVerticalAlignment(alignments[i]);
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
