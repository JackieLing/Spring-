package com.linghu.test.service;

import com.linghu.test.entity.Student;

import java.util.List;

public interface StudentService {
    public int addStudent(Student student);
    public List<Student> queryStudent();
}
