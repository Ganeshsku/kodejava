package org.kodejava.example.lang;

public class StringSwitchDemo {
    public static void main(String[] args) {
        String type = "two";

        switch (type) {
            case "one": doSomething();
                break;
            case "two": doSomethingElse();
                break;
            default: doDefault();
                break;
        }
    }

    private static void doSomething() {
        System.out.println("StringSwitchDemo.doSomething");
    }

    private static void doSomethingElse() {
        System.out.println("StringSwitchDemo.doSomethingElse");
    }

    private static void doDefault() {
        System.out.println("StringSwitchDemo.doDefault");
    }
}
