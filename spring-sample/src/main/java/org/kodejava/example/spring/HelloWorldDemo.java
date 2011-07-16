package org.kodejava.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("HelloWorld.xml");

        HelloWorld hello = (HelloWorld) context.getBean("hello");
        hello.sayHello();
    }
}
