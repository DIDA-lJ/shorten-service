package com.qiyao.shortenservice.demo;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * @ClassName GuavaCacheExample
 * @Description GuavaCache 缓存使用示例
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/08/30
 */

public class GuavaCacheExample {
    public static void main(String[] args) {
        Cache<String, String> cache = CacheBuilder.newBuilder()
                // 设置最大缓存大小
                .maximumSize(100)
                .build();
        // 将数据放入缓存
        cache.put("key1", "value1");
        cache.put("key2", "value2");

        // 从缓存中读取数据
        String value = cache.getIfPresent("key1");
        System.out.println("key1:" + value);
    }
}
