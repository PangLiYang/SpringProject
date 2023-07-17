package org.example.staticProxy;

public class Main {
    private Target target;

    public Main(Target target) {
        this.target = target;
    }

    public void makeTarget() {
        target.eat();
    }
}
