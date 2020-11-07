package com.linghu.test.service;

import com.linghu.test.dao.StudentDao;
import com.linghu.test.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;


    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums=studentDao.insertStudent(StudentDao);
        return nums;
    }

    @Override
    public List<Student> queryStudent() {

    }
}
