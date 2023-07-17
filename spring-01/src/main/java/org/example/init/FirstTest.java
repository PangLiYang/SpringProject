package org.example.init;

import org.example.init.service.StudentService;
import org.example.init.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstTest {
    public static void main(String[] args) {
        // Without Spring
        StudentService studentService = new StudentServiceImpl();
        studentService.study();

        // With Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // Retrieve the class object from spring container (like calling "map.get")
        StudentService studentServiceSpring = context.getBean("studentService", StudentService.class);
        studentServiceSpring.study();

    }
}
