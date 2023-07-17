package org.example.staticProxy;

public class Proxy1 implements Target{

    private final Target target;

    public Proxy1(Target target) {
        this.target = target;
    }

    @Override
    public void eat() {
        target.eat();
        System.out.println("Proxy is here!");

    }
}
