package com.qiyao.shortenservice.service.impl;

import com.qiyao.shortenservice.service.UrlMapService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
class UrlMapServiceImplTest {
    @Autowired
    private UrlMapService urlMapService;

    @Test
    void tryEncode() {
        //Arrange

        //Act
        String shortKey = urlMapService.encode("https://www.baidu.com");

        //Assert
        Assertions.assertNotNull(shortKey);
    }

    @Test
    void tryDecode() {
        //Arrange
        String shortKey = urlMapService.encode("https://www.baidu.com");

        //Act
        Optional<String> longUrl = urlMapService.decode(shortKey);

        //Assert
        Assertions.assertEquals("https://www.baidu.com", longUrl.get());
    }
}