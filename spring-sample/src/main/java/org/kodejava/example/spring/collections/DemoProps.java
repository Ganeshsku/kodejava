package org.kodejava.example.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoProps {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[] {"CollectionProps.xml"});

        Album album = (Album) context.getBean("album");
        System.out.println("Album = " + album);
    }
}
