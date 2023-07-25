package org.example.cyclic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyclicTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Pin pin = context.getBean("pin", Pin.class);
        pin.peek();
    }
}
