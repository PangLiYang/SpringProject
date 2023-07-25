package org.example.annotation.config;

import org.example.annotation.bean.Student;
import org.example.annotation.bean.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AppConfiguration {

    /*
        Spring will parse this bean, and put the return objects into the container
        This works for specific class, and default class type
     */
    @Bean
    public Student studentInstance(Teacher teacher) {
        return new Student(1001, "jack", teacher);
    }

    /*
        We can also assign a name for the instance rather than using method name.
     */

    @Bean("integerList")
    public ArrayList<Integer> listInstance() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }
}
