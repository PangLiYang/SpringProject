package com.example.dynamicProxy;

public class T1 implements Target {
    @Override
    public void eat() {
        System.out.println("T1.eat()");
    }

    @Override
    public void price(int p) {
        System.out.println("The price: " + p);
    }
}
