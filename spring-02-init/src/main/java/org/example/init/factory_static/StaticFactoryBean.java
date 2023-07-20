package org.example.init.factory_static;

import org.example.init.service.StudentService;
import org.example.init.service.StudentServiceImpl;

public class StaticFactoryBean {
    public static StudentService createInstance() {
        return new StudentServiceImpl();
    }
}
