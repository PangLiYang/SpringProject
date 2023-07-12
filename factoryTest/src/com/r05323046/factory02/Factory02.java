package com.r05323046.factory02;

public class Factory02 implements AbstractItemFactory{
    @Override
    public ItemTemplate produce() {
        return new Item02();
    }
}
