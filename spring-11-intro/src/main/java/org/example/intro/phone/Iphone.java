package org.example.intro.phone;

import org.springframework.stereotype.Component;

@Component("Iphone")
public class Iphone implements Phone{
    @Override
    public void call() {
        System.out.println("Iphone calling");
    }
}
