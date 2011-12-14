package org.kodejava.example.itextpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PDFTableDemo {
    public static void main(String[] args) {
        String[] headers = new String[]{
                "NO", "USERNAME", "FIRST NAME", "LAST NAME"
        };
        String[][] data = new String[][]{
                {"1", "JDOW", "JOHN", "DOW"},
                {"2", "STIGER", "SCOTT", "TIGER"},
                {"3", "FBAR", "FOO", "BAR"}
        };

        //
        // Create a new document.
        //
        Document document = new Document(PageSize.LETTER.rotate());

        try {
            //
            // Get an instance of PdfWriter and create a Table.pdf file
            // as an output.
            //
            PdfWriter.getInstance(document,
                    new FileOutputStream(new File("Table.pdf")));
            document.open();

            //
            // Create an instance of PdfPTable. After that we transform
            // the header and data array into a PdfPCell object. When
            // each table row is complete we have to call the
            // table.completeRow() method.
            //
            // For better presentation we also set the cell font name,
            // size and weight. And we also define the background fill
            // for the cell.
            //
            PdfPTable table = new PdfPTable(headers.length);
            for (int i = 0; i < headers.length; i++) {
                String header = headers[i];
                PdfPCell cell = new PdfPCell();
                cell.setGrayFill(0.9f);
                cell.setPhrase(new Phrase(header.toUpperCase(),
                        new Font(Font.FontFamily.HELVETICA, 10,
                                Font.BOLD)));
                table.addCell(cell);
            }
            table.completeRow();

            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    String datum = data[i][j];
                    PdfPCell cell = new PdfPCell();
                    cell.setPhrase(new Phrase(datum.toUpperCase(),
                            new Font(Font.FontFamily.HELVETICA, 10,
                                    Font.NORMAL)));
                    table.addCell(cell);
                }
                table.completeRow();
            }

            document.addTitle("Table Demo");
            document.add(table);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
