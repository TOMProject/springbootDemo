package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends BaseServiceImpl<Student,Integer> implements StudentService {

    @Override
    public Student getStudentbyName(String name) {
        return null;
    }
}
