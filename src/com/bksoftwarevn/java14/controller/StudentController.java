package com.bksoftwarevn.java14.controller;

import com.bksoftwarevn.java14.model.Student;
import com.bksoftwarevn.java14.service.StudentService;

public class StudentController implements StudentService {

    @Override
    public void inTenStudent(Student student) {
        System.out.println(student.getName());
    }
}
