package org.example.factory01;

public class ItemFactoryTest {
    public static void main(String[] args) {
        ItemTemplate item = ItemFactory.produce("Item01");
        item.play();
    }
}
