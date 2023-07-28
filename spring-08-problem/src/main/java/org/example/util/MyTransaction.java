package org.example.util;

public class MyTransaction {
    public static void doTX(Class<?> clazz) {
        System.out.println("Transacting: " + clazz.getName());
    }
}
