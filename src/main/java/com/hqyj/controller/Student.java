package com.hqyj.controller;

import com.hqyj.dao.StudentDao;
import com.hqyj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Student {

   // private String name;

    @Autowired
    private StudentDao studentDao;
    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;

    public void add() {
       // System.out.println(name);
        studentDao.add();
        studentService.add();
    }

 /*   public void setName(String name) {
        this.name = name;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
*/
}
