package org.kodejava.example.pattern.factory;

public class SingletonDemo {
    public static void main(String[] args) throws Exception {
        //
        // Gets an instance of Service object and calls the
        // doSomething method.
        //
        Singleton service = Singleton.getInstance();
        service.doSomething();
    }
}
