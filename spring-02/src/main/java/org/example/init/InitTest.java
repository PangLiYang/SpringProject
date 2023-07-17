package org.example.init;

import org.example.init.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentService studentServiceSpring = context.getBean("studentService", StudentService.class);
        studentServiceSpring.study();

    }
}
