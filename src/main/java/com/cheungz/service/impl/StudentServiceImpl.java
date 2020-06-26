package com.cheungz.service.impl;

import com.cheungz.dao.StudentDao;
import com.cheungz.domain.Student;
import com.cheungz.service.StudentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {
        int a = studentDao.insertStudent(student);
        return a;
    }

    @Override
    public List<Student> findStudent() {
        List<Student> students = studentDao.selectStudent();
        return students;
    }
}
