package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class TableImageDemo {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("TableImage.pdf"));
            document.open();

            //
            // Creates a table
            //
            PdfPTable table = new PdfPTable(3);
            PdfPCell cell1 = new PdfPCell(new Phrase("Cell 1"));

            //
            // Creates an image and set it as cell's content
            //
            String filename = "other-sample/src/main/resources/java.gif";
            Image image = Image.getInstance(filename);
            PdfPCell cell2 = new PdfPCell(image, false);
            cell2.setPadding(10);

            PdfPCell cell3 = new PdfPCell(new Phrase("Cell 3"));

            //
            // Add cells to table
            //
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);

            document.add(table);
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
