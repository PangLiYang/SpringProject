package org.example.init.service;

public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {
        System.out.println("Create this StudentServiceImpl instance!");
    }

    @Override
    public void study() {
        System.out.println("Studying...");
    }

    public void init() {
        System.out.println("Init method!");
    }

    public void destroy() {
        System.out.println("Destroy method!");
    }
}
