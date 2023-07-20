package org.example.init;

import org.example.init.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DestroyTest {
    public static void main(String[] args) {

        // Can no longer use polymorphism
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.study();

        // Close the container
        context.close();
    }
}
