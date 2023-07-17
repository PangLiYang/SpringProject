package org.example.factory02;

public class Factory02 implements AbstractItemFactory{
    @Override
    public ItemTemplate produce() {
        return new Item02();
    }
}
