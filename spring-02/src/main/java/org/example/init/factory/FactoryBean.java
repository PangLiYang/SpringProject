package org.example.init.factory;

import org.example.init.service.StudentService;
import org.example.init.service.StudentServiceImpl;

/*
    Use instance factory;
    Then config this factory in xml!
 */
public class FactoryBean {
    public StudentService createInstance() {
        return new StudentServiceImpl();
    }
}
