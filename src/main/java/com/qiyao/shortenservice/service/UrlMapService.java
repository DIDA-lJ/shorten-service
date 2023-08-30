package com.qiyao.shortenservice.service;

import java.util.Optional;

/**
 * @ClassName UrlMapService
 * @Description UrlMap
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/08/29
 */
public interface UrlMapService {
    /**
     * 编码
     * @param longUrl 需要进行短链接 Key 值编码的长链接
     * @return 编码后的短链接 Key
     */
    String encode(String longUrl);

    /**
     * 解码
     * @param shortKey 需要进行解码的短链接 Key 值
     * @return
     */
    Optional<String> decode(String shortKey);
}
