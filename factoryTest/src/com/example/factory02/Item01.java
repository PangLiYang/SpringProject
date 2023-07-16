package com.example.factory02;

public class Item01 implements ItemTemplate {
    @Override
    public void play() {
        System.out.println("This is the Item01");
    }
}
