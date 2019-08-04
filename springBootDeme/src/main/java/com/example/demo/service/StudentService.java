package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.mapper.BaseMapper;

public interface StudentService extends BaseMapper<Student,Integer> {

    public Student getStudentbyName(String name);
}
