package com.example.factory01;

// The factory class which produces items.
public class ItemFactory {

    // This method is usually declared static
    public static ItemTemplate produce(String model) {
        if ("Item01".equals(model)) {
            return new Item01();
        } else if ("Item02".equals(model)) {
            return new Item02();
        }
        return null;
    }
}
