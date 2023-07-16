package com.example.dynamicProxy;

public class Main {
    private Target target;

    public Main(Target target) {
        this.target = target;
    }

    public void makeTarget() {
        target.eat();
    }

    public void setPrice(int p) {
        target.price(p);
    }
}
