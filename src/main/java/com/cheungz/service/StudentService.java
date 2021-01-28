package com.cheungz.service;

import com.cheungz.domain.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);
    Student findStudent(Student student);
    List<Student> allFindStudent();

}
