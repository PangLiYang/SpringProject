package org.example.aop.annotation;

import org.example.aop.annotation.config.AopConfiguration;
import org.example.aop.annotation.service.StudentService;
import org.example.aop.annotation.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfiguration.class);

        UserService userService = context.getBean("userService", UserService.class);
        StudentService studentService = context.getBean("studentService", StudentService.class);

        userService.addUser();
//        userService.selectUser();
//        userService.selectUserById(24);
//        userService.updateUser();
        userService.deleteUser();

        studentService.addStudent();
    }
}
