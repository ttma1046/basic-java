package package_b;

import package_a.Car;

public class BMW extends Car {

    public BMW() {
        super("BMW", "BMW");
    }

    public void test() {
        start();
    }

    @Override
    protected void start() {
        System.out.println("starting...");
    }
}
