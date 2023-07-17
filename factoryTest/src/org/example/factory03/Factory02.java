package org.example.factory03;

public class Factory02 implements AbstractFactory{
    @Override
    public AbstractSupport produceSupport() {
        return new Item02Support();
    }

    @Override
    public AbstractItem produceItem() {
        return new Item02();
    }
}
