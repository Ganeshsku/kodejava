package org.kodejava.example.xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;

public class SAXDemo {
    public static void main(String[] args) throws Exception {
        //
        // Creates a new instance of SAXParserFactory that in turn
        // creates a SAXParser.
        //
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        //
        // The handler that will listen to the SAX event during
        // the xml traversal.
        //
        SAXHandler handler = new SAXHandler();
        InputStream data =
                SAXDemo.class.getResourceAsStream("/person.xml");
        parser.parse(data, handler);
    }
}
