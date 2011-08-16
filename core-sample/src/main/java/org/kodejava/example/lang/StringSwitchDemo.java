package org.kodejava.example.lang;

public class StringSwitchDemo {
    public static void main(String[] args) {
        StringSwitchDemo demo = new StringSwitchDemo();
        String type = "two";

        switch (type) {
            case "one": demo.doSomething();
                break;
            case "two": demo.doSomethingElse();
                break;
            default: demo.doDefault();
                break;
        }
    }

    private void doSomething() {
        System.out.println("StringSwitchDemo.doSomething");
    }

    private void doSomethingElse() {
        System.out.println("StringSwitchDemo.doSomethingElse");
    }

    private void doDefault() {
        System.out.println("StringSwitchDemo.doDefault");
    }
}
