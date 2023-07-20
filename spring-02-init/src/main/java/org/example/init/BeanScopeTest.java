package org.example.init;

import org.example.init.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        StudentService studentService1 = context.getBean("studentService", StudentService.class);
        StudentService studentService2 = context.getBean("studentService", StudentService.class);

        System.out.println(studentService1 == studentService2);
    }
}
