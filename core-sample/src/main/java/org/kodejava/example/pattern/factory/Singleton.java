package org.kodejava.example.pattern.factory;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        return instance;
    }

    public void doSomething() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone is not allowed.");
    }
}
