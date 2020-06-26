package com.cheungz.controller;

import com.cheungz.domain.Student;
import com.cheungz.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/student")
public class StudentController{

    @Resource(name = "studentServiceImpl")
    private StudentService Service;

    //注册学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(String name,Integer age){
        String tips = "注册失败";
        Student student  = new Student();
        student.setName(name);
        student.setAge(age);
        int a = Service.addStudent(student);
        if (a>0){
            tips = "恭喜,注册成功";
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(tips);
        modelAndView.setViewName("/result");
        return modelAndView;
    }
}
