package org.kodejava.example.jdom;

import org.jdom.input.SAXBuilder;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;
import org.jdom.output.Format;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

public class JDOMAddRemoveElement {
    public static void main(String[] args) {
        String xml =
            "<root>" +
            "   <user name=\"Alice\" age=\"21\" dob=\"20-01-1988\"/>" +
            "   <user name=\"Bob\" age=\"23\" dob=\"01-05-1986\"/>" +
            "</root>";

        SAXBuilder builder = new SAXBuilder();
        try {
            Document document = builder.build(
                    new ByteArrayInputStream(xml.getBytes()));

            //
            // Adding a new element to the root of the document using the
            // addContent method.
            //
            document.getRootElement().addContent(
                    new Element("people").setAttribute("id", "1"));
            document.getRootElement().addContent(
                    new Element("people").setAttribute("id", "1"));

            //
            // Add a new element. By adding a new element to the List of
            // children we can modified the xml document. Using
            // java.util.List makes the modification of XML document
            // simple and easy.
            //
            List children = document.getRootElement().getChildren();
            children.add(new Element("user")
                    .setAttribute("name", "Carol")
                    .setAttribute("age", "25")
                    .setAttribute("dob", "06-03-1984"));

            //
            // Add element to the begining of the xml document.
            //
            children.add(0, new Element("user")
                    .setAttribute("name", "Jimmy")
                    .setAttribute("age", "25")
                    .setAttribute("dob", "16-05-1984"));

            //
            // Remove the fourth element.
            //
            children.remove(3);

            XMLOutputter outputter =
                    new XMLOutputter(Format.getPrettyFormat());
            outputter.output(document, System.out);
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
