package com.qiyao.shortenservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
