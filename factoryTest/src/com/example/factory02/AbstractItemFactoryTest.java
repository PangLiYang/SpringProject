package com.example.factory02;

public class AbstractItemFactoryTest {
    public static void main(String[] args) {
        // Create the factory of targeted item, and use it to create the item.
        AbstractItemFactory fac = new Factory02();
        ItemTemplate item = fac.produce();
        item.play();
    }
}
