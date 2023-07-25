package org.example.lifecycle;

import org.example.lifecycle.bean.Human;
import org.example.lifecycle.config.HumanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HumanConfiguration.class);
        Human human = context.getBean("human", Human.class);
        System.out.println("4_using: " + human);

        // Close the container
        context.close();
    }
}
