package com.qiyao.shortenservice.controller;

import com.qiyao.shortenservice.dao.TestDao;
import com.qiyao.shortenservice.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestDao testDao;
    @GetMapping("/dao-test")
    public Test daoTest() {
        return testDao.save(Test.builder().name("test").build());
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
