package org.example.lifecycle.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


public class Human {
    private String name;

    public Human() {
        System.out.println("1_instantiate");
    }

    @Value("James")
    public void setName(String name) {
        System.out.println("2_Setting properties");
        this.name = name;
    }

    public void init() {
        System.out.println("3_initialize");
    }

    public void destroy() {
        System.out.println("5_destroy");
    }
}
