package org.example.aop.xml;

import org.example.aop.xml.service.StudentService;
import org.example.aop.xml.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringXml.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.addUser();
//        userService.selectUser();
//        userService.selectUserById(24);
        userService.updateUser();
//        userService.deleteUser();
    }
}
