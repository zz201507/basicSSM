package com.cheungz.service.impl;

import com.cheungz.dao.StudentDao;
import com.cheungz.domain.Student;
import com.cheungz.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,
                    RuntimeException.class
            }
    )
    public int addStudent(Student student) {
        int a = studentDao.insertStudent(student);
        return a;
    }

    @Override
    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,
                    RuntimeException.class
            }
    )
    public Student findStudent(Student student) {
        Student students = studentDao.selectStudent(student);
        return students;
    }

    @Override
    public List<Student> allFindStudent() {
        List<Student> students = studentDao.allFindStudent();
        return students;
    }
}
