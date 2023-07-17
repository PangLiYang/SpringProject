package org.example.factory01;

public class Item02 implements ItemTemplate{
    @Override
    public void play() {
        System.out.println("This is a better item, item02!");
    }
}
