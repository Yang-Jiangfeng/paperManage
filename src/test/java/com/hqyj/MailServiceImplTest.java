package com.hqyj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring.xml"})

public class MailServiceImplTest {


    @Autowired
    private MailServiceImpl mailService;

    @Test
    public void tests() {
        mailService.seandMail("626264686@qq.com", "1946558094@qq.com", "sb", "憨憨");

    }


}
