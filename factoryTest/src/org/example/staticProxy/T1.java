package org.example.staticProxy;

public class T1 implements Target{
    @Override
    public void eat() {
        System.out.println("T1.eat()");
    }
}
