package org.example.problems;

import org.example.problems.config.AopConfig;
import org.example.problems.service.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProblemsTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);
        Student student = context.getBean("studentImpl", Student.class);
//        student.play();
        student.study();
    }
}
