package com.cheungz.controller;

import com.cheungz.domain.Student;
import com.cheungz.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @Author  z'z
 * @Time  2020/8/30 19:46
 **/

@Controller
@RequestMapping()
public class StudentController{

    @Resource(name = "studentServiceImpl")
    private StudentService Service;

    /**
     *
     * @Author  z'z
     * @Time  2020/8/30 19:46
     * 注册
     **/
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(String username,String password){
        String tips = "注册失败";
        Student student  = new Student();
        student.setUsername(username);
        student.setPassword(password);
        int a = Service.addStudent(student);
        if (a>0){
            tips = "恭喜,注册成功";
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",tips);
        modelAndView.setViewName("/result");
        return modelAndView;
    }

    /**
     *
     * @Author  z'z
     * @Time  2020/8/30 19:46
     * 登录
     **/
    @RequestMapping("login.do")
    public ModelAndView userLogin(String username,String password){
        String prompt = "登录失败";
        Student student = new Student();
        student.setUsername(username);
        student.setPassword(password);
        Student student1 = Service.findStudent(student);
        if (student1 != null)
            prompt = "登录成功";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",prompt);
        modelAndView.setViewName("/loginRes");
        return modelAndView;
    }

    /**
     * @Author:  z'z
     * @Time:  2020/10/7 19:28
     * @description:查看所有的信息
     **/

    @RequestMapping("/selectStudents.do")
    public ModelAndView studentShow(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> students = Service.allFindStudent();
        Iterator it = students.iterator();
        Student s;
        for (;it.hasNext();){
                s = (Student) it.next();
                System.out.println(s.toString());
        }
        modelAndView.addObject("students",students);
        modelAndView.setViewName("/studentList");
        return modelAndView;
    }
}
