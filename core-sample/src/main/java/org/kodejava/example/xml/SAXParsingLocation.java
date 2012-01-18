package org.kodejava.example.xml;

import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;

public class SAXParsingLocation {
    public static void main(String[] args) {
        SAXParsingLocation demo = new SAXParsingLocation();
        demo.run();
    }

    private void run() {
        try {
            //
            // Get an instance of SAXParser object.
            //
            SAXParser parser =
                    SAXParserFactory.newInstance().newSAXParser();

            InputStream is =
                    getClass().getResourceAsStream("/elements.xml");
            DefaultHandler handler = new CustomHandler();
            parser.parse(is, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class CustomHandler extends DefaultHandler {
        private Locator locator;

        @Override
        public void setDocumentLocator(Locator locator) {
            this.locator = locator;
            System.out.println("locator = " + locator);
        }
    }
}
