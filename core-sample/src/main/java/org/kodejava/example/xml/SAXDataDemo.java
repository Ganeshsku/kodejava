package org.kodejava.example.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SAXDataDemo {
    //
    // List of our records data.
    //
    private List<Record> records = new ArrayList<Record>();

    //
    // Stacks for storing the elements and objects.
    //
    private Stack<String> elements = new Stack<String>();
    private Stack<Record> objects = new Stack<Record>();


    public static void main(String[] args) {
        SAXDataDemo demo = new SAXDataDemo();
        demo.run();
    }

    private void run() {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            String filename = "/records.xml";
            InputStream is = getClass().getResourceAsStream(filename);

            parser.parse(is, new DefaultHandler() {
                @Override
                public void startElement(String uri, String localName,
                                         String qName,
                                         Attributes attributes)
                        throws SAXException {

                    elements.push(qName);
                    if ("record".equals(qName)) {
                        Record record = new Record();
                        objects.push(record);
                        records.add(record);
                    }
                }

                @Override
                public void endElement(String uri, String localName,
                                       String qName)
                        throws SAXException {
                    elements.pop();
                }

                @Override
                public void characters(char[] ch, int start, int length)
                        throws SAXException {

                    String value = new String(ch, start, length);
                    if (value.length() == 0) {
                        return;
                    }

                    if ("title".equals(currentElement())) {
                        Record record = objects.peek();
                        record.setTitle(value);
                    } else if ("artist".equals(currentElement())) {
                        Record record = objects.peek();
                        record.setArtist(value);
                    } else if ("genre".equals(currentElement())) {
                        Record record = objects.peek();
                        record.setGenre(value);
                    } else if ("year".equals(currentElement())) {
                        Record record = objects.peek();
                        record.setYear(Integer.valueOf(value));
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Record record : records) {
            System.out.println("record = " + record);
        }
    }

    private String currentElement() {
        return elements.peek();
    }
}
