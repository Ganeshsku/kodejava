package org.kodejava.example.jdom;

import org.jdom.input.SAXBuilder;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.Element;
import org.jdom.CDATA;
import org.jdom.output.XMLOutputter;
import org.jdom.output.Format;

import java.io.StringReader;
import java.io.IOException;

public class JDOMBuildCDATASection {
    public static void main(String[] args) {
        String xml =
                "<root>" +
                "   <comments>" +
                "       <comment></comment>" +
                "   </comments>" +
                "</root>";

        SAXBuilder builder = new SAXBuilder();
        try {
            Document document = builder.build(new StringReader(xml));
            Element root = document.getRootElement();
            Element comments = root.getChild("comments");

            Element comment = comments.getChild("comment");

            //
            // Using the setContent and addContent to add CDATA section
            // into  the xml element.
            //
            comment.setContent(
                    new CDATA("<b>This is a bold string</b>."));
            comment.addContent(
                    new CDATA("<i>And this an italic string</i>."));

            XMLOutputter outputter =
                    new XMLOutputter(Format.getPrettyFormat());
            outputter.output(document, System.out);

            //
            // Reading a CDATA section is simply done by calling the
            // getText method. It doesn't care if it was a simple string
            // or a CDATA section, it will just return the content as
            // string.
            //
            String text = comment.getText();
            System.out.println("Text = " + text);
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
