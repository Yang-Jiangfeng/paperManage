package com.hqyj.service.impl;

import com.hqyj.service.StudentService;
import org.springframework.stereotype.Service;

@Service("studentServiceImplTwo")
public class StudentServiceImplTwo implements StudentService {
    public void add() {
        System.out.println("StudentServiceImplTwo");
    }
}
