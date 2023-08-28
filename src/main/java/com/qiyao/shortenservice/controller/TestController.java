package com.qiyao.shortenservice.controller;

import com.qiyao.shortenservice.common.ResponseResult;
import com.qiyao.shortenservice.common.ResultUtils;
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
 * @Date 2023/08/28
 * @Author LinQi
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestDao testDao;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/daotest")
    public Test doTest() {
        return testDao.save(Test.builder().name("abc").build());
    }

    @GetMapping("/test-restful/success")
    public ResponseResult<String> testRestfulSuccess() {
        return ResultUtils.success("ok");
    }

    @GetMapping("/test-restful/failure")
    public ResponseResult<String> testRestfulFailure(){
        return ResultUtils.failure("error");
    }
}
