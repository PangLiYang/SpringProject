package org.example.annotation;


import org.example.annotation.config.SpringConfiguration;
import org.example.annotation.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser();
    }
}
