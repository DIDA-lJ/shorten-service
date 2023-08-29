package com.qiyao.shortenservice.service;

/**
 * @ClassName UrlMapService
 * @Description UrlMap
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/08/29
 */
public interface UrlMapService {
    /**
     * 解码
     * @param longUrl
     * @return
     */
    String encode(String longUrl);
}
