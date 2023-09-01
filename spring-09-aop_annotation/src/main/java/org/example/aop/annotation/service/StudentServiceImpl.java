package org.example.aop.annotation.service;

import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Override
    public void addStudent() {
        System.out.println("添加學生");
    }
}
