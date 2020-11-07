package com.linghu.test.dao;

import com.linghu.test.entity.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> SelectStudent();
}
