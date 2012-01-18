package org.kodejava.example.jdom;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

public class ReadXmlDocument {
    public static void main(String[] args) {
        //
        // Our imaginary xml file to be processed in this example.
        //
        String data =
            "<root>" +
            "<row>" +
            "<column name=\"username\" length=\"16\">admin</column>" +
            "<column name=\"password\" length=\"128\">secret</column>" +
            "</row>" +
            "<row>" +
            "<column name=\"username\" length=\"16\">jdoe</column>" +
            "<column name=\"password\" length=\"128\">password</column>" +
            "</row>" +
            "</root>";

        //
        // Create an instance of SAXBuilder
        //
        SAXBuilder builder = new SAXBuilder();
        try {
            //
            // Tell the SAXBuilder to build the Document object from the
            // InputStream supplied.
            //
            Document document = builder.build(
                    new ByteArrayInputStream(data.getBytes()));

            //
            // Get our xml documen root element which equals to the
            // <root> tag in the xml document.
            //
            Element root = document.getRootElement();

            //
            // Get all the children named with <row> in the document.
            // The method return the children as a java.util.List
            // object.
            //
            List rows = root.getChildren("row");
            for (int i = 0; i < rows.size(); i++) {
                //
                // Convert each row to an Element object and get its
                // children which will return a collection of <column>
                // elements. When we have to column element we can read
                // the attribute value (name, length) as defined above
                // and also read its value (between the <column></column>
                // tag) by calling the getText() method.
                //
                // The getAttribute() method also provide a handy method
                // if we want to convert the attribute value to a correct
                // data type, in the example we read the length attribute
                // value as an integer.
                //
                Element row = (Element) rows.get(i);
                List columns = row.getChildren("column");
                for (int j = 0; j < columns.size(); j++) {
                    Element column = (Element) columns.get(j);
                    String name = column.getAttribute("name").getValue();
                    String value = column.getText();
                    int length = column.getAttribute("length").getIntValue();

                    System.out.println("name = " + name);
                    System.out.println("value = " + value);
                    System.out.println("length = " + length);
                }
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
