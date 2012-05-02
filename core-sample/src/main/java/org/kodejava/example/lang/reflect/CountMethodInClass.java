package org.kodejava.example.lang.reflect;

import java.lang.reflect.Method;

public class CountMethodInClass {
    public static void main(String[] args) {
        Class clazz = Integer.class;

        //
        // Get t
        //
        Method[] methods = clazz.getMethods();
        //clazz.getDeclaredMethods()
        System.out.printf("Number of methods in class %s = %d%n",
                clazz.getName(), methods.length);

        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
