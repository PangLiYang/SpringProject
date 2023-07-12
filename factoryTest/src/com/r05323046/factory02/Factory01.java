package com.r05323046.factory02;

public class Factory01 implements AbstractItemFactory{
    @Override
    public ItemTemplate produce() {
        return new Item01();
    }
}
