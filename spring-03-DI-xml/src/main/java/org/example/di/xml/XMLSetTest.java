package org.example.di.xml;

import org.example.di.xml.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLSetTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser();
    }
}
