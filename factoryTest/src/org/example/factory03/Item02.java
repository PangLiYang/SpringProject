package org.example.factory03;

public class Item02 implements AbstractItem{
    @Override
    public void play() {
        System.out.println("This is the suboptimal choice, item 02...");
    }
}
