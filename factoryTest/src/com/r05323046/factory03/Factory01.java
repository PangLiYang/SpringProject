package com.r05323046.factory03;

public class Factory01 implements AbstractFactory{
    @Override
    public AbstractSupport produceSupport() {
        return new Item01Support();
    }

    @Override
    public AbstractItem produceItem() {
        return new Item01();
    }
}
