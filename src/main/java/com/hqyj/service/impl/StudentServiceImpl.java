package com.hqyj.service.impl;

import com.hqyj.service.StudentService;
import org.springframework.stereotype.Service;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
    public void add() {
        System.out.println("StudentServiceImpl");
    }
}
