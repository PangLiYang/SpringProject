package org.example.init.factory_bean;

import org.example.init.service.StudentService;
import org.example.init.service.StudentServiceImpl;
import org.springframework.beans.factory.FactoryBean;

// Use FactoryBean interface
public class BeanFactoryBean implements FactoryBean<StudentService> {
    @Override
    public StudentService getObject() throws Exception {
        return new StudentServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
