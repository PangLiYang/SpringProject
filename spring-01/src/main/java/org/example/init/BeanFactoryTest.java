package org.example.init;

import org.example.init.service.StudentService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        // Read config documents
        reader.loadBeanDefinitions("spring.xml");

        // Obtain the Object
        StudentService studentService = factory.getBean("studentService", StudentService.class);
        studentService.study();
    }
}
