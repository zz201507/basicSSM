package com.cheungz.dao;

import com.cheungz.domain.Student;

import java.util.List;


public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudent();
}
