package com.r05323046.factory03;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        AbstractFactory fac = new Factory02();
        AbstractSupport sp = fac.produceSupport();
        AbstractItem item = fac.produceItem();

        sp.support();
        item.play();
    }
}
