package org.kodejava.example.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDisposeDemo {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("InitDispose.xml");

        InitDisposeService service =
                (InitDisposeService) context.getBean("service");
        service.doSomething();

        context.close();
    }
}
