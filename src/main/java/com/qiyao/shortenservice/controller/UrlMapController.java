package com.qiyao.shortenservice.controller;

import com.qiyao.shortenservice.common.ResponseResult;
import com.qiyao.shortenservice.common.ResultUtils;
import com.qiyao.shortenservice.service.UrlMapService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName UrlMapController
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/08/29
 */
@RestController
@RequestMapping("/urlmap")
public class UrlMapController {

    private static final String DOMAIN = "http://127.0.0.1:8888/";

    @Autowired
    private UrlMapService urlMapService;

    @PostMapping("/shorten")
    public ResponseResult<Map> shorten(@RequestParam("longUrl") String longUrl) {
        String encode = urlMapService.encode(longUrl);
        return ResultUtils.success(Map.of("shortKey", encode, "shortUrl", DOMAIN + encode));
    }
}
