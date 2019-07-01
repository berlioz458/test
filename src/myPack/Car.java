package myPack;

public class Car implements Transport, Interface{
    @Override
    public void go() {
        System.out.println("We are driving");
    }

    @Override
    public void stop() {
        System.out.println("We are stop");
    }

    @Override
    public void method1() {
        System.out.println("test1");
    }

    @Override
    public void method2() {
        System.out.println("test2");
    }

    @Override
    public void method3() {
        System.out.println("test3");

    }
}
