package org.kodejava.example.intro;

public class StringSwitchDemo {
    public static void main(String[] args) {
        StringSwitchDemo demo = new StringSwitchDemo();
        String day = "Sunday";

        switch (day) {
            case "Sunday":
                demo.doSomething();
                break;
            case "Monday":
                demo.doSomethingElse();
                break;
            case "Tuesday":
            case "Wednesday":
                demo.doSomeOtherThings();
                break;
            default:
                demo.doDefault();
                break;
        }
    }

    private void doSomething() {
        System.out.println("StringSwitchDemo.doSomething");
    }

    private void doSomethingElse() {
        System.out.println("StringSwitchDemo.doSomethingElse");
    }

    private void doSomeOtherThings() {
        System.out.println("StringSwitchDemo.doSomeOtherThings");
    }

    private void doDefault() {
        System.out.println("StringSwitchDemo.doDefault");
    }
}
