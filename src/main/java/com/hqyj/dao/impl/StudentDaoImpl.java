package com.hqyj.dao.impl;


import com.hqyj.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

    public void add() {
        System.out.println("StudentDaoImpl");
    }
    public void die(){
        System.out.println("die");
    }
}
