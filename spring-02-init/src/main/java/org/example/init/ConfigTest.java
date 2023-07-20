package org.example.init;

import org.example.init.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.study();
    }
}
