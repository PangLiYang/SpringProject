package com.example.staticProxy;

public class MainTest {
    public static void main(String[] args) {
        T1 t1 = new T1();
        Proxy1 proxy1 = new Proxy1(t1);

        Main main = new Main(proxy1);
        main.makeTarget();
    }
}
