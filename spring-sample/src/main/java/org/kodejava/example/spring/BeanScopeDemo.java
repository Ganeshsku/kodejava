package org.kodejava.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Prototype.xml");

        DummyService serviceA =
                (DummyService) context.getBean("service");
        serviceA.setMessage("Hello From A");
        System.out.println("Message A = " + serviceA.getMessage());

        DummyService serviceB =
                (DummyService) context.getBean("service");
        System.out.println("Message B = " + serviceB.getMessage());
    }
}
