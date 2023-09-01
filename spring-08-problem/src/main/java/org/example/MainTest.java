package org.example;


import org.example.config.SpringConfiguration;
import org.example.proxy.MyInvocationHandler;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // Proxy target
        UserService userService = context.getBean("userService", UserService.class);
        // Use proxy!
//        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
//                userService.getClass().getInterfaces(),

//                new MyInvocationHandler(userService));

//        userServiceProxy.addUser();

        // Use processor
        userService.addUser();
    }
}
