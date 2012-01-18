package org.kodejava.example.jdom;

import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.DocType;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.EntityRef;
import org.jdom.JDOMException;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

public class JDOMMixedContent {
    public static void main(String[] args) {
        String xml =
                "<root>" +
                "<data>" +
                "<!-- This element contains application data -->" +
                "User Information" +
                "<![CDATA[<table><tr><td>-data-</td></tr></table>]]>" +
                "<field name=\"username\">alice</field>" +
                "</data>" +
                "</root>";

        SAXBuilder builder = new SAXBuilder();
        try {
            Document document = builder.build(new StringReader(xml));
            Element root = document.getRootElement();
            Element data = root.getChild("data");

            //
            // Reading the mixed content of an xml element and iterate
            // the result list. This list object can contains any of the
            // following objects: Comment, Element, CDATA, DocType,
            // ProcessingInstruction, EntityRef and Text.
            //
            List content = data.getContent();

            for (Object o : content) {
                if (o instanceof Comment) {
                    Comment comment = (Comment) o;
                    System.out.println("Comment   = " + comment);
                } else if (o instanceof Element) {
                    Element element = (Element) o;
                    System.out.println("Element   = " + element);
                } else if (o instanceof CDATA) {
                    CDATA cdata = (CDATA) o;
                    System.out.println("CDATA     = " + cdata);
                } else if (o instanceof DocType) {
                    DocType docType = (DocType) o;
                    System.out.println("DocType   = " + docType);
                } else if (o instanceof ProcessingInstruction) {
                    ProcessingInstruction pi = (ProcessingInstruction) o;
                    System.out.println("PI        = " + pi);
                } else if (o instanceof EntityRef) {
                    EntityRef entityRef = (EntityRef) o;
                    System.out.println("EntityRef = " + entityRef);
                } else if (o instanceof Text) {
                    Text text = (Text) o;
                    System.out.println("Text      = " + text);
                }
            }

            //
            // Remove the second mixed content which is the CDATA content.
            //
            content.remove(2);
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
