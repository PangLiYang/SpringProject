package org.example.problems.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("studentImpl")
public class StudentImpl implements Student, ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void study() {
        System.out.println("學習日文");
//        this.play();
        Student student = context.getBean("studentImpl", Student.class);
        student.play();
    }

    @Override
    public void play() {
        System.out.println("魔獸世界");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;

    }
}
