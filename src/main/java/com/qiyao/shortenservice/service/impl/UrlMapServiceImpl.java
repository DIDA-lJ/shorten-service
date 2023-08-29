package com.qiyao.shortenservice.service.impl;

import com.qiyao.shortenservice.dao.UrlMapDao;
import com.qiyao.shortenservice.model.UrlMap;
import com.qiyao.shortenservice.service.UrlMapService;
import com.qiyao.shortenservice.utils.Base62Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * @ClassName UrlMapService
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/08/29
 */
@Service
@Slf4j
public class UrlMapServiceImpl implements UrlMapService {
    /**
     * UrlMap 接口注入
     */
    @Autowired
    private UrlMapDao urlMapDao;

    /**
     * 为长链接创建对应的键值
     * @param longUrl 需要进行短链接 key 编码的长链接
     * @return 短链接的键值
     */
    @Override
    public String encode(String longUrl) {
        UrlMap urlMap = urlMapDao.findFirstByLongUrl(longUrl);

        if (urlMap == null) {
            urlMap = urlMapDao.save(UrlMap.builder()
                    .longUrl(longUrl)
                    .expireTime(Instant.now().plus(30, ChronoUnit.DAYS))
                    .build()
            );
            log.info("create urlMap:{}", urlMap);
        }
        return Base62Utils.idToShortKey(urlMap.getId());
    }
}
