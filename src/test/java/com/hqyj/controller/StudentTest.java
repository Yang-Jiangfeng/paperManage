package com.hqyj.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})

public class StudentTest {

/*
1如果接口只有1个实现类或者类没有继承的关系，只用Autowired注解, autowried默认采用的根据类型来装配
2如果接口有多个实现类，需要搭配Qualifier类实现, Qualifier采用的根据名称装配byName
3如果类有继承关系，注入父类的时候,定义的属性名是父类的小写类名全称
4 Qualifier 设置不能为空，如果为空，是运行时异常，语法没有异常
*/
    @Autowired
    private Student student;
    @Test
    public void add() {

student.add();

      /*  ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student)context.getBean("student");
        student.add();
*/
    }
}
