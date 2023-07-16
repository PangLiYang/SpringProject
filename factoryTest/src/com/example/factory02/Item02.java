package com.example.factory02;

public class Item02 implements ItemTemplate {
    @Override
    public void play() {
        System.out.println("This is a better item, item02!");
    }
}
