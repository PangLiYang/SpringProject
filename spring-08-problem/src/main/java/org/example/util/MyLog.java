package org.example.util;

public class MyLog {

    public static void doLog(Class<?> clazz) {
        System.out.println("We are logging: " + clazz.getName());
    }
}
