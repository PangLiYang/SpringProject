package org.example.init.service;

public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {
        System.out.println("Create this StudentServiceImpl instance!");
    }

    @Override
    public void study() {
        System.out.println("Studying...");
    }
}
